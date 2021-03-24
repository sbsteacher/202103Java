package sec06.exam01;

public class PrintExample {
	public static void main(String[] args) {
		System.out.println("하하");
		System.out.println("호호");
		System.out.println("후후");
		System.out.println(); //개행
		System.out.print("하하");
		System.out.print("호호");
		System.out.print("후후");
		System.out.println(); //개행
		System.out.println(); //개행
		System.out.print("하하\n");
		System.out.print("호호\n");
		System.out.print("후후\n");
		
		//TODO: System.out.printf 나중에 설명
		char bloodType = 'A';
		int age = 9;
		float weight = 50.4f;
		String name = "장보고";
		
		//제 이름은 홍길동이며, 나이는 14살이고, 혈액형은 O형 이고, 몸무게는 30.4kg입니다.
		//하드코딩!!!
		System.out.println("제 이름은 홍길동이며, 나이는 14살이고, 혈액형은 O형 이고, 몸무게는 30.4kg입니다.");
		System.out.println("제 이름은 " + name + "이며, 나이는 " + age + 
				"살이고, 혈액형은 " + bloodType + "형 이고, 몸무게는 " 
				+ weight + "kg입니다.");
		System.out.printf("제 이름은 %s이며, 나이는 %10d살이고, 혈액형은 %c형 이고, 몸무게는 %015.3fkg입니다.\n"
				, name, age, bloodType, weight);
		
		char ch = 'c';
		System.out.printf("%d : %c", (int)ch, ch);
		
	}
}







