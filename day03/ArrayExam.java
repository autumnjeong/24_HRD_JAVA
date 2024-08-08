package day03;

public class ArrayExam {

	public static void main(String[] args) {
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		for(int j=0; j<4; j++) {
			System.out.println("season[j] : " + season[j]);
		}
		
		season[1] = "여름";
		for(int j=0; j<4; j++) {
			System.out.println("season[j] : " + season[j]);
		}
		
		
		
		
		
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double)sum / 3;
		System.out.println("평균 : " + avg);
		
		
		//이름 문자열 3개를 저장한 배열 선언 및 초기화 
		String[] names = null;
		
		
		names = new String[] {"정가을", "김여름", "이겨울"};
		
		
	}

}
