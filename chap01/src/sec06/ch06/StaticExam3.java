package sec06.ch06;

public class StaticExam3 {

	public static void main(String[] args) {
		CalcInstance ci = new CalcInstance();
		int result = ci.sum(10, 20);
		System.out.println("result : " + result);
		
		int result2 = CalcStatic.sum(10, 30);
		int result3 = CalcStatic.sum(10, 40);
		System.out.println("result2 : " + result2);
		
		StaticExam4.main(args);
	}
}

class CalcStatic {
	int sum2(int num1, int num2) {
		return num1 + num2;
	}
	
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance {
	int sum(int num1, int num2) {
		return num1 + num2;
	}
}








