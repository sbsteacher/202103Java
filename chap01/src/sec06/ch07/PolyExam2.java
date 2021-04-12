package sec06.ch07;

public class PolyExam2 {

	public static void main(String[] args) {
		//instanceof는 상속관계일때 사용하는 기능
		System.out.println("---------------- (1) ");
		Car car1 = new LocalBus();
		LocalBus lb1 = (LocalBus)car1;		
		System.out.println(car1 instanceof LocalBus);
		
		Bus bus1 = (Bus)car1;
		System.out.println(car1 instanceof Bus);
		
		System.out.println("---------------- (2) ");
		
		Car car2 = new Bus();
		//LocalBus lb2 = (LocalBus)car2;
		System.out.println(car2 instanceof LocalBus); //false, false

		System.out.println("---------------- (3) ");
		
		Car car3 = new Truck();
		Bus bus3 = (Bus)car3;
		Truck truck = new Truck(); //Truck
		//Bus bus4 = (Bus)truck; //Bus, LocalBus
		System.out.println(car3 instanceof Bus);
		
	}

}





