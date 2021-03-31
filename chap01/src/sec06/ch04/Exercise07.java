package sec06.ch04;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {		
		int balance = 0; //잔고
		Scanner scan = new Scanner(System.in);
		
		MAIN:
		while(true) {
			System.out.println("------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:		
				System.out.print("입금액 > ");				
				balance += scan.nextInt();
				break;
			case 2:
				System.out.print("출금액 > ");
				balance -= scan.nextInt();				
				break;
			case 3:
				System.out.println("잔고 : " + balance);
				break;
			case 4:				
				break MAIN;
			default :
				System.out.println("1~4번만 입력해 주세요.");
			}
		}
		//scan.close();
		//System.out.println("프로그램 종료");
	}

}
