package sec06.ch04;

public class WhileMission {
	public static void main(String[] args) {
		//1~100 합계를 구하시오. (while문으로 해결)
		//합계 : 5050
		
		int i=0;
		int sum = 0;
		while(i++ < 100) {
			sum = sum + i;
		}
		System.out.println("sum : " + sum);
		
		int j=1; 
		int sum2=0;
		while(j <= 100) {
			sum2 += j++;
		}
		System.out.println("sum2 : " + sum2);
	}
}
