package sec06.ch03;

public class Exercise04 {

	public static void main(String[] args) {
		int penciles = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = penciles / students;
		System.out.println("pencilsPerStudent : " +  pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = penciles % students;
		System.out.println("pencilsLeft : " + pencilsLeft);

	}

}
