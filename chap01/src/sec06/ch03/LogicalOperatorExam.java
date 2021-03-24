package sec06.ch03;

public class LogicalOperatorExam {

	public static void main(String[] args) {
		//&&(and), ||(or), !(not)
		
		boolean res1 = (1>7) && true && true;
		System.out.println("res1 : " + res1);
		
		boolean res2 = (10 < 2) || false || false;
		System.out.println("res2 : " + res2);

		
		int n = 2;
		boolean res = false && (1<n++);
		System.out.println("n : " + n);
		
	}

}







