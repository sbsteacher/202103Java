package sec06.ch04;

public class SwitchExam {

	public static void main(String[] args) {
		int val = 2;
		switch(val) {
		case 1:			
		case 4:
			System.out.println("값은 1이다.");
			break;
		case 2:
			System.out.println("값은 2이다.ㅋㅋ");
			System.out.println("값은 2이다.ㅎㅎ");
			break;
		case 3:
			System.out.println("값은 3이다.");
			break;
		default:
			System.out.println("값은 1~3이 아니다.");			
		}
		System.out.println("끝");
	}	

}
