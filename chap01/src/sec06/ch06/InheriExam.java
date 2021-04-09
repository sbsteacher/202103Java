package sec06.ch06;

public class InheriExam extends Object {
	public static void main(String[] args) {
		KoShort ks = new KoShort();
		ks.howling();
	}
}
class Animal extends Object {
	String name;
	int age;
	
	void howling() {
		System.out.println("운다");
	}
}

class Cat extends Animal {
	
	void lick() {
		System.out.printf("%s가 핥다\n", name);
	}
	
	@Override
	void howling() {
		System.out.println("야옹");
	}
}

class KoShort extends Cat {
	
	KoShort() {
		super();
		System.out.println("KoShort 생성자");
	}
	void pee() {
		System.out.printf("%s가 소변을 본다\n", name);
	}
}







