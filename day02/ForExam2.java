package day02;

public class ForExam2 {

	public static void main(String[] args) {
		
		//for(초기식; 조건식; 증감식){반복 수행문}
		//0에서 100까지 짝수들의 총합을 계산하여 출력
		
		int i, sum=0, h=0;
		for(i = 0 ; i <= 100 ; i++) {
			if(i % 2 == 0) {
				sum = sum+i;
			}
			else if(i % 2 != 0) {
				h = h+i;
			}

		}
		System.out.println("0에서 100까지 짝수들의 합 : "+sum);
		System.out.println("0에서 100까지 홀수들의 합 : "+h);

	}

}
