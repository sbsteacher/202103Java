package sec06.ch04;

public class ForMission9 {

	public static void main(String[] args) {
		int star = 8;
		
		//____*
		//___**
		//__***
		//_****
		//*****
		
		for(int i=1; i<=star; i++) {			
			for(int z=i; z<star; z++) { 
				System.out.print("_"); 
			}
			for(int k=0; k<i; k++) { 
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		for(int i=star; i>0; i--) {
			for(int k=1; k<=star; k++) {
				if(k < i) { 
					System.out.print("_"); 
				} else { 
					System.out.print("*"); 
				}
			}
			System.out.println();
		}		
		
		
		
		
		
		
		
		
		
		
		int quo = 1;
		for(int i=0; i<star*star; i++) {
			int m = i%star;
			if(m == 0 && i != 0) { 
				System.out.println();
				quo = i/star + 1;
			}
			if(m < star - quo) {
				System.out.print("_");
			} else {
				System.out.print("*");
			}			
		}
		
	}

}
