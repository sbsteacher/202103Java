package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] menuNmArr = {"콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000, 3000};		

		Drink[] drinkArr = new Drink[menuNmArr.length];
		
		for(int i=0; i<drinkArr.length; i++) {
			Drink a = new Drink();
		
			a.nm = menuNmArr[i];
			a.price = menuPriceArr[i];
			
			drinkArr[i] = a;
		}
		
		printMenu3(drinkArr);
	}
	
	public static void printMenu3(Drink[] arr) {
		String str = "<메뉴>\n0. 종료\n";
		for(int i=0; i<arr.length; i++) {
			Drink item = arr[i];
			str += String.format("%d. %s (%,d원)\n"
					, i+1, item.nm, item.price);
		}
		System.out.println(str);
	}
	
	public static void printMenu2(String[] nmArr, int[] priceArr) {
		String str = "<메뉴>\n";
		str += "0. 종료\n";
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









