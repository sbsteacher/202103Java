package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuNmArr = {"콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000, 3000};		
		
		printMenu(menuNmArr, menuPriceArr);
	}
	
	public static void printMenu2(String[] nmArr, int[] priceArr) {
		String str = "<메뉴>\n";
		for(int i=0; i<nmArr.length; i++) {
			str += String.format("%d. %s (%,d원)\n", i+1, nmArr[i], priceArr[i]);
		}
		System.out.println(str);
	}
	
	public static void printMenu(String[] nmArr, int[] priceArr) {
		System.out.println("<메뉴>");
		for(int i=0; i<nmArr.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", i+1, nmArr[i], priceArr[i]);
		}
	}
}









