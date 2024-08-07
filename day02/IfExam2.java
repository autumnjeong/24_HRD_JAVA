package day02;
import java.util.Scanner;

/*public class IfExam2 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("## 메뉴선택 ##");
		System.out.println("[1] 구매자  [2] 판매자");
		System.out.println("메뉴를 선택하세요 ->");
		
		int manu = 1;
		manu = scan.nextInt();
		
		if (manu == 1 ) {
			System.out.println("환영합니다! 구매자로 로그인 하셨습니다.");
		}
		else if (manu == 2) {
			System.out.println("환영합니다! 판매자로 로그인 하셨습니다.");
		}
		else {
			System.out.println("잘못된 입력 입니다");
		}
		
	}

}
*/


public class IfExam2 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("## 메뉴선택 ##");
		System.out.println("[1] 구매자  [2] 판매자");
		System.out.println("메뉴를 선택하세요 ->");
		
		int manu = 1;
		manu = scan.nextInt();
		
		String stor = "";
		
		if (manu == 1 ) {
			stor = "구매자";
		}
		else if (manu == 2) {
			stor = "판매자";
		}
		else {
			System.out.println("잘못된 입력 입니다");
		}
		System.out.println("환영합니다! "+stor+"로 로그인 하셨습니다.");
	}

}