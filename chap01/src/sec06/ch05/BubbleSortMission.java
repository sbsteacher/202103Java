package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {

	public static void main(String[] args) {
		int[] arr = {8, 7, 3, 1, 6, 0};				
		System.out.println(Arrays.toString(arr));
				
		for(int i=arr.length-1; i>0; i--) {
			for(int z=0; z<i; z++) {
				if(arr[z] > arr[z+1]) {
					int temp = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}


