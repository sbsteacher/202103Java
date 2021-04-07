package sec06.ch06;

public class ConstructorExam {
	//객체지향 언어는 모두 생성자를 사용한다. 
	//생성자는 객체가 만들어질 때 무조건 호출을 해야한다.
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.brand = "Samsung";
		tv1.inch = 100;
		tv1.maxChannel = 100;
		tv1.maxVolume = 100;
		tv1.displayState();
		//Samsung 100inch 100Channel 100Volume
		
		Tv tv2 = new Tv("LG", 200, 150, 200);
		tv2.displayState();
		//LG 200inch 150Channel 200Volume
	}
}
class Tv {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	Tv() {}
	
	Tv(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	
	
	void volumeUp() {		
		currentVolume++;
	}	
	
	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n"
				, brand, inch, maxChannel, maxVolume);
	}
}


//기본 생성자
//생성자 vs 메소드
//이름은 클래스명이랑 같다.
//리턴타입이 없다.

//생성자는 객체 생성할때만 사용할 수 있다.

//기본생성자는 컴파일러가 생성자가 하나도 없을시 넣어준다.