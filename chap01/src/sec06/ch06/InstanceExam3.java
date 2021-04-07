package sec06.ch06;

public class InstanceExam3 {
	public static void main(String[] args) {
		int mainNum = 10;
		
		Box box1 = new Box();
		box1.num = 10;
		
		changeNum(mainNum);		
		System.out.println("mainNum : " + mainNum);
		
		changeBoxNum(box1);
		System.out.println("box.num : " + box1.num);
	}
	
	public static void changeNum(int num) {
		num = 20;
	}
	
	public static void changeBoxNum(Box box2) {		
		box2.num = 20;
	}
}

class Box {
	int num;
}














