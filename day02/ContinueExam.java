package day02;

public class ContinueExam {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 10) {
			i++;
			
			if(i % 2 != 0) {
				continue; //무시
			}
			System.out.print(i+" ");
			
		}
		
	}

}