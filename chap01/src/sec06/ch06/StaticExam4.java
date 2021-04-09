package sec06.ch06;

public class StaticExam4 {

	public static void main(String[] args) {
		CalcStatic2.num1 = 10;
		CalcStatic2 cs2 = new CalcStatic2();
		
		int result = cs2.sum();
		System.out.println("result : " + result);
		
		String.format("%d", result);
		
		String str = new String();
		str.format("%d", result);
	}
}
class CalcStatic2 {
	static int num1;
	static int num2;
	
	static int sum() {
		return num1 + num2;
	}
}

class CalcInstance2 {
	int num1;
	int num2;
	
	int sum() {		
		return num1 + num2;
	}
	
	static int sum(int num1, int n2) {
		return num1 + n2;
	}
}









