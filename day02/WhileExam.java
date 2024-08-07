package day02;

public class WhileExam {

	public static void main(String[] args) {
		
		//0에서 100까지 짝수들의 총합을 계산하여 출력
		int i = 0, sum = 0; // 초기식
		
		while(i <= 100) { // 조건식
			if(i % 2 == 0) {
				sum = sum+i;
			}
			i++; // 증감식
		}
		System.out.println("0에서 100까지 짝수들의 합 : "+sum);
	}

}
