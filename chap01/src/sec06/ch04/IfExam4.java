package sec06.ch04;

public class IfExam4 {

	public static void main(String[] args) {
		//삼항식
		System.out.println(abs(-10));
		System.out.println(abs(7));
	}
	
	public static int abs(int val) {
		return val < 0 ? -val : val;
	}
	//MethodMission2에 있는 abs랑 비교

}
