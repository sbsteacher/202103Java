package sec06.ch05;

public class MethodMission3_1 {

	public static void main(String[] args) {
		sumAllFromTo(2, 7); //sum : 9
		sumAllFromTo(7, 2); //sum : 9
	}	
	public static void sumAllFromTo(int to, int from) {
		int sum = 0;
		for(int i=to; i<=from; i++) {
			sum += i;
		}		
		for(int i=to; i>=from; i--) {
			sum += i;
		}	
		System.out.println("sum : " + sum);
	}
	
}
