package sec06.ch07;

public class PolyMission {

	public static void main(String[] args) {
		Car car1 = new Car();
		Bus car2 = new Bus();
		LocalBus car3 = new LocalBus();
		Truck car4 = new Truck();
		
		//Bus, LocalBus 객체였다면 openDoor 메소드 호출
		//그외는 hoot 메소드 호출 
		blowKlaxon(car1);
		blowKlaxon(car2);
		blowKlaxon(car3);
		blowKlaxon(car4);
	}

	public static void blowKlaxon(Car c) {
		if(c instanceof Bus) {
			/*
			Bus bus = (Bus)c;
			bus.openDoor();
			*/
			((Bus)c).openDoor();
			return;
		}
		c.hoot();
			
	}
}






