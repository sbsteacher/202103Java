package sec06.ch06;

public class OverloadingExam {

	public static void main(String[] args) {
		//Calc 객체화
		//sum메소드 호출 아규먼츠는 5, 10
		Calc c = new Calc();
		c.sum(5, 10);
		
		c.sum(5, 10, 11);
		
		c.sum(10, 20, "30");
		
	}

}

class Calc {
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	void sum(int n1, int n2, int n3) {
		System.out.println(n1 + n2 + n3);
	}
	
	int sum(int d1, int d2, String d3) {
		System.out.println(d1 + d2 + d3);
		return 0;
	}
}










