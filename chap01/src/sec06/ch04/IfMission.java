package sec06.ch04;

public class IfMission {

	public static void main(String[] args) {
		int score = 61;
		
		if(score < 70) { // ~ 69
			System.out.println("M 등급 D");
		} else if(score < 80) { // 70 ~ 79
			System.out.println("M 등급 C");
		} else if(score < 90) { // 80 ~ 89
			System.out.println("M 등급 B");
		} else { // 90 ~
			System.out.println("M 등급 A");
		}
		System.out.println("끝");
		
	}
}
