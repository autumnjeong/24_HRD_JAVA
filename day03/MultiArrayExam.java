package day03;

public class MultiArrayExam {

	public static void main(String[] args) {
		 
		// 2차원 배열
		int[][] scores = new int[2][3];
		
		scores[0][0] = 90;
		scores[0][1] = 50;
		scores[0][2] = 80;
		
		scores[1][0] = 100;
		scores[1][1] = 70;
		scores[1][2] = 90;
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
				System.out.println("scores["+i+"]"+"["+j+"]"+scores[i][j]);
			}
		}
		avg = sum / scores.length;
		System.out.println("총합 : " + sum + ", 평균 : " + avg);
		
	}

}
