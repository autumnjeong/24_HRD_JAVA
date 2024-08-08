package day03;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean scool = true;
		int x =0;
		int[] stu = null;
		
		
		while(scool) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");

			int num = scan.nextInt();
			
			if(num == 1) {
				System.out.print("학생수> ");
				x = scan.nextInt();
				stu = new int[x];
			}
			else if(num == 2) {
				for(int i = 0; i <= x-1; i++) {
					System.out.print("scores["+i+"]: ");
					stu[i] = scan.nextInt();
				}
			}
			else if(num == 3) {
				for(int i=0; i<stu.length;i++) {
					System.out.print("scores["+i+"]: ");
					System.out.println(stu[i]);
				}
			}
			else if(num == 4) {
				
				int sum = 0;
				for(int i = 0; i < stu.length; i++) {
					sum += stu[i];
				}
				System.out.println("최고 점수: "+sum);
				
				double Avg = (double) sum / stu.length;
				System.out.println("평균 점수: " + Avg);
			}
			else if(num == 5) {
				scool = false;
			}
			
		}
		System.out.println("프로그램 종료");
	}

}

