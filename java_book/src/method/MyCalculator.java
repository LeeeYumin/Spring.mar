package method;

public class MyCalculator {
	
	//데이터(필드) : 정수형 변수 - num1, num2, result
	//기능(메서드) : 두 수의 합의 계산
	
	private int num1;
	private int num2;
	private int result; //필드 3개 여기서 선언
	
	//생성자 만들어줌
	public MyCalculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		sum();
		
	}
	

	private void sum() { //메서드.. private 했으니까 외부 접근 불가
		
		result = num1 + num2;
		
	}
	
	public int getResult() {
		return result;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
}
