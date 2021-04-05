package sec06.ch05;

public class MethodMission8 {

	public static void main(String[] args) {
		//gugudan(9);
		gugudan(4, 8); //단 바뀔때 ----- , 개행 구분자 사용 
	}
	
	public static void gugudan(int sDan, int eDan) {
		for(int i=sDan; i<=eDan; i++) {
			gugudan(i);
			System.out.println("-------");
		}
	}
	
	
	public static void gugudan(int n) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", n, i, (n*i));
		}
	}

}
