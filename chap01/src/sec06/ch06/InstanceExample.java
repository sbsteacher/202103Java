package sec06.ch06;

public class InstanceExample {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.name = "뽀삐";
		d2.name = "돌쇠";
		
		d1.bark();
		d2.bark();
	}
}

//멤버필드 (값을 저장할 수 있는 것) - 명사 담당, 
//멤버메소드 (값을 수정할 수 있는 것) - 동사 담당
class Dog {
	String name;
	String jong;
	int age;
	
	void bark() {		
		System.out.printf("%s가 멍멍\n", name);
	}
}












