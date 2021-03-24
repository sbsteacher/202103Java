package sec06.exam01;
/*
 * 정수 모두 정리 (4가지)
 */
public class IntExample {
	public static void main(String[] args) {
	
		
		int ddd = 'a'+'a';
		System.out.println("ddd : " + ddd);
		
		
		//short aa = c;
		//System.out.println("z : " + aa);
		char ggggg = 'a';
		byte b = 10; 	//5ml
		short s = 20; 	//1L
		int i = 30; 	//4L
		long l = 4_000_000l; 	//8L
				
		s = b; //자동형변환
		s = (short)i; // 문제가 될 경우에는 안 쓰시거나 
		              // 강제형변환
	}
}







