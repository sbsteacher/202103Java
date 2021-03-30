package sec06.ch04;

public class ScopeExam {
	
	
	public static void main(String[] args) {
		int jjj = 10;
		
		
		// 스코프 (변수&상수가 살아있는 범위)
		
		int a = 10;
		
		if(a > 9) {
			System.out.println("a : " + a);
			
			jjj = 10;
			System.out.println("jjj(1) : " + jjj);
		}
		System.out.println("jjj(2) : " + jjj);
		
		for(int i=0; i<10; i++) {
			
		}
		int i=0;
		for(; i<22; i++) {
			
		}
		System.out.println(i);
		
		if(true) {
			//int i=10;
		}
		
		if(true) {
			//int i=10;
		}
		
		
	}

}
