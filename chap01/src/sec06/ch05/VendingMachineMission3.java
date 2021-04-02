package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission3 {

	public static void main(String[] args) {
		/*
		돈을 주입해 주세요 : 3000		
		<메뉴>
		0. 종료
		1. 콜라 (1,000원)
		2. 사이다 (1,200원)
		3. 환타 (1,300원)
		선택> 1
		콜라를 선택하셨습니다. (남은 금액 2,000원)
		
		선택> 3
		환타를 선택하셨습니다. (남은 금액 700원)
		
		선택> 4
		잘 못 선택하셨습니다.
		
		선택> 3
		금액이 부족합니다. (남은 금액 700원)
		
		선택> 0
		종료 (남은 금액 700원)
		*/ 
		Scanner scan = new Scanner(System.in);		
		String[] menuNmArr = {"콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000, 3000};
		boolean run = true;
		
		System.out.print("돈을 주입해 주세요 : ");
		int insertMoney = scan.nextInt();
		
		System.out.println("<메뉴>");
		System.out.println("0. 종료");
		for(int i=0; i<menuNmArr.length; i++) {
			System.out.printf("%d. %s (%,d)\n", (i+1), menuNmArr[i], menuPriceArr[i]);
		}	
		System.out.println("------------");		
		while(run) {
			System.out.print("선택 > ");
			int choice = scan.nextInt();			
			if(choice < 0 || choice > menuNmArr.length) {
				System.out.println("잘 못 선택");
				continue;
			}			
			int selectedIdx = choice - 1;
			if(choice == 0) {
				run = false;
				System.out.print("종료 ");
			} else if(insertMoney < menuPriceArr[selectedIdx]) {
				System.out.print("금액이 부족합니다. ");
			} else {
				System.out.printf("%s를 선택하셨습니다.", menuNmArr[selectedIdx]);
				insertMoney -= menuPriceArr[selectedIdx];
			}
			System.out.printf(" (남은 금액 : %,d)\n", insertMoney);
		}
		scan.close();
	}

}
