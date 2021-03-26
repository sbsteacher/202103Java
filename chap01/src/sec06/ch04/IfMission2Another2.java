package sec06.ch04;

public class IfMission2Another2 {

	public static void main(String[] args) {
		//IfMission2Another를 참고하여 해결하시오. (응용하려고 노력하시오)
		//결과에 성별도 나타나도록 하시오.
		
		//남, 174 >>>    남자 평균 미만 
		//남, 175 >>>    남자 평균
		//남, 176 >>>    남자 평균 초과
		
		//여, 162 >>>    여자 평균 미만
		//여, 163 >>>    여자 평균
		//여, 164 >>>    여자 평균 초과

		String gender = "남"; //"여", "남";
		int height = 176;
		
		String displayGender = "남자", displayResult = "평균";
		
		final int MAN_STAND = 176;
		final int WOMAN_STAND = 163;		
		int stand = MAN_STAND;		
		
		if (gender.equals("여")) {
			stand = WOMAN_STAND;
			displayGender = "여자";
		}		
				
		if(height < stand) {
			displayResult = "평균 미만";
		} else if(height > stand) {
			displayResult = "평균 초과";
		}				
		System.out.printf("%s - %dcm : %s\n"
				, displayGender, height, displayResult);
	}

}





