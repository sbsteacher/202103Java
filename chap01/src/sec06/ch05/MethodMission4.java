package sec06.ch05;

public class MethodMission4 {

	public static void main(String[] args) {
		int rNum = getRandomNum(); //0~9
		System.out.println("rNum : " + rNum);
		
		rNum = getRandomNum(20); //0~19
		rNum = getRandomNum(5); //0~4
		
		rNum = getRandomNum(5, 10); 
		System.out.println("5, 10 rNum : " + rNum);
		rNum = getRandomNum(10, 20);
		System.out.println("10, 20 rNum : " + rNum);
	}
	
	public static int getRandomNum(int min, int max) {
		return (int)(Math.random() * (max - min + 1)) + min;
	}
	
	public static int getRandomNum(int max) {
		return (int)(Math.random() * max);
	}
	
	public static int getRandomNum() {
		return (int)(Math.random() * 10);
	}

}
