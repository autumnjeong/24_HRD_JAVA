package day01;
import java.util.Scanner;

public class VarTast1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		// 1. 정수 변수
		int x;
		
		//변수 초기화
		x = 5;
		System.out.print("첫번째 정수 입력:");
		
		x = scan.nextInt();
		
		
		
		int y = 8;
		System.out.print("두번째 정수 입력:");
		
		y = scan.nextInt();
		
		
		
		int result = x+y;
		
		System.out.println(result);

		
	
		// 2. 실수 변수
		//float(4byte), double(8byte)
		double height = 155.7;
		System.out.print("키 입력(실수): ");
		height = scan.nextDouble();
		
		float weight = 45.5f;
		System.out.print("몸무게 입력(실수): ");
		weight = scan.nextFloat();
		
		
		
		// 3. 문자형 변수
		// char(2byte)
		char blood = 'A';
		
		// 4. 문자열 변수
		// String
		String name = "염희균";
		System.out.print("이름 입력:");
		name = scan.next();
		
		
		
		System.out.println("키:"+ height+"\n몸무게:"+ weight);
		
		System.out.println("혈액형:"+blood+"형 입니다.");
		
		System.out.println("이름:"+name+" 입니다.");
		
		
		// 5. 논리형 변수
		// boolean형
		boolean stop = true;
		
				
		if (stop == true) {
			System.out.println("중지합니다.");
		
		}else {
			System.out.println("시작합니다.");
		}
				
	}

}
