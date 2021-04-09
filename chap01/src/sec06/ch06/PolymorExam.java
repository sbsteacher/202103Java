package sec06.ch06;

public class PolymorExam {
/*
1. 부모타입의 변수는 자식객체 가리킬 수 있다.
2. 자식타입의 변수는 부모객체 카리킬 수 없다.
3. 타입은 아는 메소드만 호출할 수 있다.
   호출이 되었다면 기준은 객체이다.   
*/
	public static void main(String[] args) {
		Animal ani_1 = new Cat();
		Cat cat = (Cat)ani_1;
		Animal ani_2 = cat;

		//Cat cat1 = new Animal("", 0);
		
		ani_1.howling();
		//ani_1.lick();
		cat.howling();
		cat.lick();	
		
		System.out.println("끝!");
	}
}


