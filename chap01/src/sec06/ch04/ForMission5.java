package sec06.ch04;

public class ForMission5 {

	public static void main(String[] args) {
		//2~9단 구구단 출력!!!!		
		for(int i=2; i<10; i++) {
			for(int z=1; z<10; z++) {
				System.out.printf("%d * %d = %d\n", i, z, (i*z));				
			}
			System.out.println();			
		}
		
		//2 * 1 = 2
		//2 * 2 = 4
		//....
		//2 * 9 = 18
		//(빈칸)
		//3 * 1 = 3
		//3 * 2 = 6
		//...
		//3 * 9 = 27
		//(빈칸)
		//...
		//9 * 9 = 81

	}

}
