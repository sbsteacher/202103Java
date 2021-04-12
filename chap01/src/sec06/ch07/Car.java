package sec06.ch07;

public class Car {
	public void hoot() {
		System.out.println("빵! 빵!");
	}
}
class Bus extends Car {
	public void openDoor() {
		System.out.println("버스 승객문을 열다.");
	}
}
class LocalBus extends Bus {
	public void openDoor() {
		System.out.println("로컬버스 승객문을 열다.");
	}
}
class Truck extends Car {
	@Override
	public void hoot() {
		System.out.println("Truck Bang! Bang!");
	}
}