package sec06.ch07;

public abstract class Animal {
	private int age;
	private String name;
	
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
	public void breath() {
		System.out.println("숨쉰다.");
	}
	
	public abstract void howling();
}

class Cat extends Animal {
	
	public void howling() {
		System.out.println("야옹~~ 야옹~~");
	}	
}

class Dog extends Animal {

	
	public void howling() {
		System.out.println("멍~ 멍~");
	}
	
}






