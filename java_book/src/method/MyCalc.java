package method;

//사칙연산 계산기
//데이터 : X
//기능 : 두 수의 합을 계산해서 결과 리턴, 두 수의 뺄셈 계산하고 결과 리턴

public class MyCalc {
	/**
	 * @param num1 첫번째 정수형 숫자
	 * @param num2 두번째 정수형 숫자
	 * @return 두수의 합
	 */	
	// 두 수의 합을 계산해서 결과 리턴
	public int sum(int num1, int num2) {
		int result = 0;
		result = num1 + num2;
		return result;
	}
	/**
	 * @param num1 첫번째 정수형 숫자
	 * @param num2 두번째 정수형 숫자
	 * @return 두수의 차이
	 */	
	//두 수의 뺄셈 계산하고 결과 리턴
	public int minus(int num1, int num2) {
		int result = 0;
		result = num1 - num2;
		return result;
	}
	
	//두 수의 차이 결과 리턴
	public int minus2(int num1, int num2) {
		int result = 0;
		if(num1>num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		return result;
	}
}
