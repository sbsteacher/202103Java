package sec06.ch05;

public class MethodMission9 {

	public static void main(String[] args) {
		int[] arr = {4, 34, 10, 11, 45, 66, 70};		
		//System.out.println(Arrays.toString(arr));
		String result = toString(arr);
		System.out.println(result);		
		//4, 8, 10, 11, 45, 66,
	}
	
	public static String toString(int[] arr) {		
		String str = Integer.toString(arr[0]);
		for(int i=1; i<arr.length; i++) {			
			str += ", " + arr[i];
		}
		return String.format("[%s]", str);
		//return "[" + str + "]";
	}
	
}





