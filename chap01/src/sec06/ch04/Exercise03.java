package sec06.ch04;

public class Exercise03 {

	public static void main(String[] args) {
		//for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는
		//코드를 작성해보세요.
		
		int sum = 0;
		for(int n=1; n<=100; n++) {
			if(n % 3 == 0) {
				sum += n; //3 + 6 + 9 + 12 + .... + 99
			}
		}
		System.out.println("1~100까지의 정수 중 3의 배수 총합  : " + sum);
	}

}
