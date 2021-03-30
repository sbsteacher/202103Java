package sec06.ch04;

public class ForMission6 {

	public static void main(String[] args) {
		int star = (int)(Math.random() * 5 + 3);
		System.out.println("star : " + star);
		// 3~7 사이 랜덤값		
		for(int z=0; z<star; z++) {
			for(int i=0; i<star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//star = 3; (3칸짜리 별이 3줄)
		//***
		//***
		//***
		
		//star = 5; (5칸짜리 별이 5줄)
		//*****
		//*****
		//*****
		//*****
		//*****

	}

}
