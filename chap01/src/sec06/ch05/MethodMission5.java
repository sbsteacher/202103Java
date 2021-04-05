package sec06.ch05;

public class MethodMission5 {
	
	public static void printStarLine(int num) {
		for(int i=0; i<num; i++) {
			System.out.print("*");
		}
	}
	
	public static void printStarSqure(int num) {
		for(int z=0; z<num; z++) {
			printStarLine(num);
			System.out.println();
		}
	}
	
	public static void printStarTri(int num) {		
		for(int i=1; i<=num; i++) {
			printStarLine(i);
			System.out.println();
		}
	}
	

	//중복된 소스 최대한 제거
	//메소드 재활용!!!
	public static void main(String[] args) {
		int star = 5;
		printStarTri(star);
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println();
		star = 3;
		printStarTri(star);
		//*
		//**
		//***		
	}
}





