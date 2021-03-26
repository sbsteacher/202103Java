package sec06.ch04;

public class IfMission3 {

	public static void main(String[] args) {
		final int SCORE = (int)(Math.random() * 41) + 60;
		System.out.println("SCORE : " + SCORE);
		//SCORE 값은 60~100 점 사이의 값이 된다. (실행할때마다 달라진다)
		//91~100 A (97점 이상은 "A+",  96~94 "A", 93~91 "A-"
		//81~90 B (87점 이상은 "B+",  86~84 "B", 83~81 "B-"
		//71~80 C (77점 이상은 "C+",  76~74 "C", 73~71 "C-"
		//나머지 D
		
		String dGrade = "D";
		char dGradeChar = ' ';
		
		int restVal = SCORE % 10;
		if(restVal >= 7 || restVal == 0) { dGradeChar = '+'; } 
		else if(restVal <= 3) { dGradeChar = '-'; }
		
		if(SCORE > 90) { dGrade = "A"; } 
		else if(SCORE > 80) { dGrade = "B"; } 
		else if(SCORE > 70) { dGrade = "C"; }
		else { dGradeChar = ' '; }
		
		System.out.printf("%s%c", dGrade, dGradeChar);
	}

}
