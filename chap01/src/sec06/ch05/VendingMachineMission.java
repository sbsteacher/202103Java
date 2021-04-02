package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission {

	public static void main(String[] args) {
		/* 아래는 콘솔에 출력해야 하는 내용입니다.
		 
		<메뉴>
		0. 종료
		1. 콜라 (1,000원)
		2. 사이다 (1,200원)
		3. 환타 (1,300원)
		선택> 1
		콜라를 선택하셨습니다.
		
		<메뉴>
		0. 종료
		1. 콜라 (1,000원)
		2. 사이다 (1,200원)
		3. 환타 (1,300원)
		선택> 3
		환타를 선택하셨습니다.
		
		<메뉴>
		0. 종료
		1. 콜라 (1,000원)
		2. 사이다 (1,200원)
		3. 환타 (1,300원)
		선택> 4
		잘 못 선택하셨습니다.
		*/
		Scanner scan = new Scanner(System.in);		
		String[] menuNmArr = {"콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000, 3000};		
		while(true) {
			System.out.println("\n<메뉴>");
			for(int i=0; i<menuNmArr.length; i++) {
				System.out.printf("%d. %s (%,d원)\n"
						, (i+1), menuNmArr[i], menuPriceArr[i]);
			}
			System.out.print("선택 > ");
			int choice = scan.nextInt();
			if(choice == 0) {
				break;
			} else if(choice >= 1 && choice <= menuNmArr.length) {
				System.out.printf("%s를 선택하셨습니다.\n", menuNmArr[choice-1]);
			} else {
				System.out.println("잘 못 선택하셨습니다.");
			}
		}		
		System.out.println("종료!!");
		scan.close();
		
		
		
		
	}

}
