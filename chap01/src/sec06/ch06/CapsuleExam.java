package sec06.ch06;

public class CapsuleExam {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		//h1 나이는 12, 이름은 "홍길동"
		//h2 나이는 20, 이름은 "신사임당"
		
		h1.setName("홍길동");
		h1.setAge(12);
		h2.setName("신사임당");
		h2.setAge(20);
		
		System.out.printf("My name is %s, age is %d.\n"
				, h1.getName(), h1.getAge());
		
		System.out.printf("My name is %s, age is %d.\n"
				, h2.getName(), h2.getAge());
		
		h1.whoAmI(); //내 이름은 홍길동 나이는 12살입니다.
		h2.whoAmI(); //내 이름은 신사임당 나이는 20살입니다.
	}

}
//생성자 vs 메소드
//1. 생성자 이름은 클래스 이름이랑 같아야 함
//2. 리턴 타입이 없음.
class Human {
	private int age;
	private String name;
		
	Human() {
		this(10);
	}
	Human(int age) {
		this("미상", age);
	}
	Human(String name) {
		this(name, 10);
	}
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d살입니다.\n", name, age);
	}
}















