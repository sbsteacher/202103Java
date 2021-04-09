package sec06.ch06;

public class PolymorMission {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
		
		PolymorMission.cry(cat);
		PolymorMission.cry(pig);
		cry(hamster);
	}
	
	static void cry(Animal cat) {
		cat.howling();
	}
}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~ 꿀~");
	}
}

class Hamster extends Animal {
	
}