package sec06.ch07;

public class MyArrayList implements MyList {
	private int[] arr;
	
	public MyArrayList() {		
		arr = new int[0];
	}	
	@Override
	public void add(int val) {
		int[] temp = new int[arr.length + 1];		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}		
		temp[arr.length] = val;
		arr = temp;
	}
	@Override
	public void add(int idx, int val) {
		int[] temp = new int[arr.length + 1];
		for(int i=0; i<arr.length; i++) {
			int tIdx = i < idx ? i : i+1;
			temp[tIdx] = arr[i];
		}
		temp[idx] = val;
		arr = temp;
	}
	
	@Override
	public int size() {
		return arr.length;
	}
	@Override
	public int get(int idx) {
		return arr[idx];
	}
	
	@Override
	public int remove() {
		final int LEN = arr.length - 1;
		
		int[] temp = new int[LEN];
		for(int i=0;i<LEN; i++) {
			temp[i] = arr[i];
		}	
		int lastVal = arr[LEN]; 
		arr = temp;
		return lastVal;
	}
	
	@Override
	public int remove(int idx) {
		int delVal = arr[idx];
		
		int[] temp = new int[arr.length - 1];
		for(int i=0; i<temp.length; i++) {
			int tIdx = i < idx ? i : i+1;
			temp[i] = arr[tIdx];
		}
		arr = temp;
		return delVal;
	}
}













