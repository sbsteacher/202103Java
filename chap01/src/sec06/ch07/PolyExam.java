package sec06.ch07;

public class PolyExam {
/*
	1. 부모타입은 자식 객체 가리킬 수 있다. (참조, 저장)
	2. 자식타입은 부모 객체 가리킬 수 없다. 
	3. 변수타입은 메소드 호출 여부만 결정!! 
	   (자기가 아는 것만 호출가능)
	   호출이 되었다면 실행되는 것은 객체 기준!!!
	
 */
	public static void main(String[] args) {
		Car car1 = new Bus();
		Car car2 = new Car();
		Car car3 = new LocalBus();
		
		Bus bus1 = (Bus)car1;
		bus1.openDoor();
		bus1.hoot();		
		Car carP = bus1;
		carP.hoot();
		
		System.out.println("------------------- (1) ");
		Car carP2 = new Truck();
		Truck truck1 = (Truck)carP2;
		Car carP3 = truck1;
		carP3.hoot();
		
		System.out.println("------------------- (2) ");
		Car carP4 = new LocalBus();
		Bus bus2 = (Bus)carP4;
		LocalBus lb = (LocalBus)bus2;
		lb.hoot(); //빵빵, 빵빵
		
		
		System.out.println("끝!");
	}

}










