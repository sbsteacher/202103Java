package sec06.ch04;

public class IfMission3_1 {

	public static void main(String[] args) {
		//final int SCORE = (int)(Math.random() * 41) + 60;
		final int SCORE = 79;
		final int DIFF = 9;
		System.out.println("SCORE : " + SCORE);

		//91이상 A : 9 > 0
		//81이상 B : 8 > 1
		//71이상 C
		int quo = SCORE / 10;
		if(quo == 10) {
			quo = DIFF;
		}
		String[] gradeArr = {"A", "B", "C", "D"};
		
		System.out.println(gradeArr[DIFF-quo]);
		
		
	}

}
