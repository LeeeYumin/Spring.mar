package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

  private SimpMessagingTemplate template;

  @Autowired
  public GreetingController(SimpMessagingTemplate template) {
      this.template = template;
  }
  
  @MessageMapping("/hello")   //들어오면
  @SendTo("/topic/greetings") // greetings 구독자에게 전송
  public Greeting greeting(HelloMessage message) throws Exception {
    Thread.sleep(1000); // simulated delay
    return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
  }

  @GetMapping("insert")
  @ResponseBody
  public String insert(String greeting) {
	  //서비스
	  
	  //요청 처리 메시지를 보내고
	  String text = "[" + new Date() + "]:" + "승인요청 ";
      this.template.convertAndSend("/topic/greetings", new Greeting(text));
	  return "ok";
  }
}

