package guess.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//데이터(필드) : 임의의 수, 시도횟수, 입력기록 int[], List<Integer> !!!
//기능(메서드) : 난수생성, 숫자입력, 정답확인
public class MyGuessNumber {
	
	int num ;
	int turn = 1;
	boolean check = false;
	List<Integer> numLog = new ArrayList<>(); // 필드 3개 
	
	Scanner scn = new Scanner(System.in);
	
	public void start () {
		
		randomNum();
		
		while (true) {
			getInput();
			checkAnswer();
			if(check || turn > 3) {
				System.out.println("게임종료");
				break;
			}
		}
	}
	
	//난수입력 메서드
	public void randomNum() {
		num = (int)(Math.random()*99)+1;
	}
	
	//숫자입력 메서드
	public void getInput() {
		System.out.println("1~100사이의 숫자를 입력해주세요");
		int input = scn.nextInt();
		numLog.add(input);
	}
	
	//정답확인 메서드
	public void checkAnswer() {
		//log 입력 기록 출력
		for(int i = 0; i <numLog.size(); i++) {
			System.out.print(numLog.get(i) + " ");
		}
		
		//찾기
		if(numLog.get(numLog.size()-1) > num) {
			System.out.println("맞춰야 하는 숫자보다 큽니다");
		}else if(numLog.get(numLog.size()-1) < num) {
			System.out.println("맞춰야 하는 숫자보다 작습니다");
		}else {
			System.out.println("정답입니다");
			check = true;
			return;
		}
		turn++;
	}
}
