package sec06.ch04;

public class LabelLoopExam {

	public static void main(String[] args) {
		
		ddddddd:
		for(int i=0; i<3; i++) {
		
			for(int z=100; z<105; z++) {
				if(z == 102) {
					continue;
				}
				System.out.printf("%d - %d \n", i, z);				
			}
			System.out.println("ddd");
		}		
		System.out.println("끝!");
	}

}
