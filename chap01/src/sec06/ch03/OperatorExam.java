package sec06.ch03;

public class OperatorExam {
	public static void main(String[] args) {
		//산술연산자
		int n1 = 10;
		int n2 = 3;
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 / n2);
		System.out.println(n1 / (float)n2);
		float result = (float)n1 / n2;
		System.out.println("result : " + result);
		System.out.println(n1 * n2);
		
		System.out.println("------------------");
		int result2 = (3 + 4 + 5) * 6;
		//7 + 5 * 6;
		//12 * 6;
		//72
		//--------
		//3 + 4 + 30
		//7 + 30
		//37
		//--------
		//7 + 5 * 6
		
		System.out.println("result2: " + result2);
		
		int mod = 10 % 3;
		System.out.println("mod : " + mod);
		
		int odd = 11 % 2;
		int even = 22 % 2;
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		
		System.out.println("------------------");
		//int n3 = -2;
		int n3 = 2 * -1;
		System.out.println("n3 : " + (-n3));
	}
}














