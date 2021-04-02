package sec06.ch05;

public class MethodMission3 {

	public static void main(String[] args) {
		sumAllFromTo(1, 100000); //sum : 210
		sumAllFromTo(3, 9); //sum : 45
		sumAllFromTo(2, 4); //sum : 9
		sumAllFromTo(4, 2); //sum : 9
		
		sumAllFromToWithCalc(9, 100000);
		sumAllFromToWithCalc(3, 9);
	}
	
	public static void sumAllFromTo(int sNum, int eNum) {		
		int sum = 0;
		for(int i=sNum; i<=eNum; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
	
	public static void sumAllFromToWithCalc(int sNum, int eNum) {
		int result = 0;
		if((eNum - sNum) % 2 == 0) { 
			result = eNum;
			eNum--;
		} 
		int sum = sNum + eNum;		
		result = result + (sum * ((eNum-sNum) / 2 + 1));
		System.out.println("result : " + result);
	}
	
	

}
