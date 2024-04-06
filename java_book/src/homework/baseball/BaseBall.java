package homework.baseball;

import java.util.Scanner;

public class BaseBall {

	static int num[] = { 0, 0, 0 };

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0;
		int strike = 0;
		int ball = 0;
		int i = 0;
		int j = 0;
		//턴 횟수 변수 지정
		int k = 0;
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 맞추면 끝나는 게임입니다");
		
		for (i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 9) + 1; //중복값이 있는지 검사
		}

		for (i = 0; i < num.length; i++) {
			for (j = 0; j < num.length; j++) {
				if (i == j) 
					continue;
				else if (num[i] == num[j])
					num[j] = (int) (Math.random() * 9) + 1;
			}
		}
		
//		System.out.println(num[0] + " " + num[1] + " " + num[2]);

		while (true) {
			System.out.print("숫자 3개를 입력 하세요 : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt(); //숫자 3개 입력받음
			if (num[0] == num1 && num[1] == num2 && num[2] == num3)
				break; //숫자 3개 일치하면 끝

			if (num[0] == num1) {
				strike++;
			} 
			if (num[1] == num2) {
				strike++;
			}
			if (num[2] == num3) {
				strike++;
			}
			if (num[0] == num2 || num[0] == num3) { //자리수가 다르면 ball
				ball++;
			}
			if (num[1] == num1 || num[1] == num3) {
				ball++;
			}
			if (num[2] == num1 || num[2] == num2) {
				ball++;
			}
			System.out.println(strike + "스트라이크, " + ball + "볼");
			strike = 0;
			ball = 0; //초기화
			
			//if 걸어서 턴 횟수가 5회 이상이면 중단
			if (k < 6) {
				System.out.println("중단");
			}
			
			
			//턴 횟수 증가
			for(k = 0; k < num.length; k++ ) {
				
			}
		}

		System.out.println("게임 끝");
		sc.close();
	}
}
