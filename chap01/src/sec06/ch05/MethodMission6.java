package sec06.ch05;

public class MethodMission6 {

	public static char getGrade(int score) {
		switch (score / 10) {
			case 10: case 9: return 'A';
			case 8: return 'B';
			case 7: return 'C';
			case 6: return 'D';
		}
		return 'E';
	}

	public static char getGradeSign(int score) {
		int mod = score % 10;
		if (score == 100 || mod >= 8) {
			return '+';
		} else if (mod <= 3) {
			return '-';
		}
		return ' ';
	}

	public static int getRandomScore(int s, int e) {
		return (int) (Math.random() * (e - s + 1)) + s;
	}

	public static void main(String[] args) {
		int score = getRandomScore(50, 100);
		// 50~100 사이의 랜덤숫자가 리턴되도록 세팅!!

		char grade = getGrade(score);
		// 90점 이상 'A'
		// 80점 이상 'B'
		// 70점 이상 'C'
		// 60점 이상 'D'
		// 나머지 'E'이 리턴 되도록
		char gradeSign = getGradeSign(score);
		// ?8 이상이거나 100점이면 '+'
		// ?3 이하이면 '-'
		// 나머지 ' '빈칸이 리턴 되도록

		System.out.printf("%d : %c%c\n", score, grade, gradeSign);

	}

}
