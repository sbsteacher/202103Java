package sec06.ch05;

import java.util.Arrays;

public class ArraySortExam {
	public static void main(String[] args) {
		int[] arr = {88, 65, 23, 1, 900, 42, 95};
		
		String str = new String("dd");
		
		
		
		int temp = arr[1];
		arr[1] = arr[0];
		arr[1] = temp;
		
		System.out.println(Arrays.toString(arr));
	}
}
