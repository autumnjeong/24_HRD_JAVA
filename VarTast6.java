package day01;
import java.util.Scanner;
/*
 *  4칙연산과 나머지 연산을 하는 간단한 계산기 예제
 */
public class VarTast6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int answer = 0;
		
		while(answer != -1){
			// 1. 4칙 연산을 입력받아 저장하는 변수 선언
			System.out.print("연산자를 입력하세요(+,-,*,/,%) :");
			String calculate = scan.next();
		
			
			// 2. 2개 정수 입력 받아 계산하는 변수 선언
			System.out.print("첫번째 정수를 입력하세요 :");
			int x = scan.nextInt();
			System.out.print("두번째 정수를 입력하세요 :");
			int y = scan.nextInt();
		
			// 3. "+" 덧셈연산, "-" 뺄셈연산, "*" 곱셈연산, "/" 나누기연산, "%" 나머지 연산
			if (calculate.equals("+")) {
     	      answer = x + y;
			}
			else if (calculate.equals("-")) {
				answer = x - y;
			}
			else if (calculate.equals("*")) {
				answer = x * y;
			}
			else if (calculate.equals("/")) {
				answer = x / y;
			}
			else if (calculate.equals("%")) {
				answer = x % y;
			}
		
		//결과 출력
		System.out.println(answer);
		}

	}

}
