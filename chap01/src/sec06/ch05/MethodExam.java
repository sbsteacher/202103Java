package sec06.ch05;

public class MethodExam {

	public static void main(String[] args) { //메인 메소드
		int aaa = 10;
		int result = sum(aaa, 80);
		System.out.println("sum-result : " + result);
		
		result = minus(20, 10);
		System.out.println("minus-result : " + result);
	}

	public static int minus(int aaa, int b) {
		return aaa - b;
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
}
