package method;

/**
 * 
 * @author yum
 * @version 1.4
 * @사칙연산 계산기
 * 개발내용
 * 		2024-04-06 javadoc 생성
 *
 */
public class MyConsole {

	public static void printline() {
		for(int i=0; i < 50; i++) {
			System.out.print("=");
		}
			System.out.println();
	}
	
	//메서드 오버로딩
	public static void printline(int num) {
		for(int i=0; i < num; i++) {
			System.out.print("=");
		}
			System.out.println();
	}
	
	//33,"*" 순서 맞춰서 넣어주기
	public static void printline(int num, String str) {
		for(int i=0; i < num; i++) {
			System.out.print(str);
		}
			System.out.println();
	}
	
	

}
