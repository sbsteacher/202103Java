package sec06.ch06;

public class PolymorMission {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster();
		
		Hamster hhh = (Hamster)hamster;
		
		System.out.println(hamster instanceof Hamster);
		System.out.println(pig instanceof Hamster);
		
		PolymorMission.cry(cat);
		PolymorMission.cry(pig);
		cry(hamster);
	}
	
	//ani로 Hamster 객체 주소값이 들어오면
	//howling 메소드 말고,
	//runRail 메소드 호출해 주세요.
	//다른 객체들은 howling 메소드 호출
	static void cry(Animal ani) { 
		ani.howling();
	}
}

class Animal {
	String name;
	int age;
	
	void howling() {
		System.out.println("운다");
	}
}
class Hamster extends Animal {
	public void runRail() {
		System.out.println("쳇바퀴를 굴린다.");
	}
}
class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~ 꿀~");
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





