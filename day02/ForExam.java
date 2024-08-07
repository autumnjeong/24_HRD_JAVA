package day02;

public class ForExam {

	public static void main(String[] args) {
		
		//for(초기식; 조건식; 증감식){반복 수행문}
		
		for(int i = 2 ; i < 10 ; i++) {
			System.out.println("### "+i+"단 ###");
			for(int y = 1 ; y < 10 ; y++) {
				System.out.println(i+" * "+y+" = "+(i*y));
			}
		}

	}

}
