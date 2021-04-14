package sec06.ch07;

public class ArrayListMission {

	public static void main(String[] args) {
		MyList list = new MyArrayList();
		
		list.add(10);
		list.add(20);		
		list.add(40);
		list.add(50);			
		list.add(2, 30);
		
		int delVal = list.remove(1);
		System.out.println("delVal : " + delVal); //20
				
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d : %d\n", i, list.get(i));
		}
		
		//10, 30, 40, 50

	}
}





