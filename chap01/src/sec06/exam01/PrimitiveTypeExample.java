package sec06.exam01;

//원시타입 vs 참조타입(Reference Type)
public class PrimitiveTypeExample {
	public static void main(String[] args) {
		//총 8개
		
		//byte, short, int, long
		//float, double
		//byte < short < int < long < float < double
		byte var1 = 0; //MAX: 127
		short var2 = -129;
		var1 = (byte)var2;
		System.out.println("var1 : " + var1);
		
		float var3 = 10.123f;
		int var4 = (int)var3;
		System.out.println("var4 : " + var4);
		
		//char (문자형)
		//boolean
		//원시타입은 리터럴값을 저장한다.
		
	}
}
