package method;

import guess.number.MyGuessNumber;

public class MainApp {
	public static void main(String[] args) {
		//consoletest();
		//consoletest2();
		//Mycalctest();
		MyGuessNumber myGuessNumber = new MyGuessNumber();
		myGuessNumber.start();
		
				
//		MyConsole mc = new MyConsole(); //생성자 만들어서 호출할거임
//		
//		for(int i = 0; i < 3; i++) {
//			mc.printline();			
//		}		
				
	}
	
	public static void Mycalctest() {
		MyCalc myCalc = new MyCalc();
		int res = myCalc.sum(10, 30); //리턴 있으니까 값 있어야 한다
		System.out.println(res);
		//뺄셈 테스트
		int res2 = myCalc.minus(10, 30);
		System.out.println(res2);
		//두 수의 차이
		int res3 = myCalc.minus(11, 30);
		System.out.println(res3);
	}
	
	//코드가 길어기면 메서드로 쪼개고 메서드 호출하기
	public static void consoletest() {
		MyConsole.printline(); //50개 찍는거
		MyConsole.printline(10); //오버로딩
		MyConsole.printline(33,"*"); //2개 (순서맞추기)		
		//역순으로 별찍기 해봅시다...
		
	}
	
	public static void consoletest2() {
		MyCalculator myCalc = new MyCalculator(10,20);
		System.out.println(myCalc.getResult());
		
		myCalc = new MyCalculator(150, 200);
		System.out.println(myCalc.getResult());
		
	}
		
	
}
