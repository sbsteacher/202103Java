package sec06.ch04;

public class ForMission5_1 {

	public static void main(String[] args) {		
		for(int z=1; z<10; z++) {			
			for(int i=2; i<10; i++) {
				System.out.printf("%d * %d = %d\t", i, z, (i * z));
			}
			System.out.println();			
		}
		//\t
		//2*1=2  3*1=3  4*1=4 ... 8*1=8  9*1=9
		//2*2=4  3*2=6  4*2=8 ... 8*2=16 9*2=18
		//2*3=6 ...
		//...
		//2*9=18 3*9=27 4*9=36 ... 9*9=81
	}

}
