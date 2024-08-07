package day02;
import java.util.Scanner;

/* 기본 틀
 * public class IfExam3 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("## 로그인 (admin혹은 임의 아이디) ##");
		System.out.print("# 로그인 아이디 : ");
		
		String name = "";
		name = scan.next();
		
		int menu = 1;
		
		if (name .equals("admin") ) {
			System.out.println("관리자 로그인!!");
		}
		else {
			System.out.println(name+"로그인!!");
		}
		
		System.out.println("## 메뉴를 선택하세요 (1~2) ##");
		System.out.print("# 메뉴 선택 : ");
		
		
		menu = scan.nextInt();
		
		if (menu == 1 ) {
			System.out.println(name + " " + menu + "번 선택함!!");
		}
		else if (menu == 2) {
			System.out.println(name + " " + menu + "번 선택함!!");
		}
		else {
			System.out.println("잘못된 입력 입니다");
		}
		
	}

}
*/


/*admin이 아닌 "관리자"라고 표현하기 위한 수정
 * public class IfExam3 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("## 로그인 (admin혹은 임의 아이디) ##");
		System.out.print("# 로그인 아이디 : ");
		
		String name = "";
		name = scan.next();
		
		int menu = 1;
		
		if (name .equals("admin") ) {
			System.out.println("관리자로 로그인 하셨습니다.");
			
			System.out.println("## 메뉴를 선택하세요 (1~2) ##");
			System.out.print("# 메뉴 선택 : ");
			
			menu = scan.nextInt();
			
			if (menu == 1 ) {
				System.out.println("관리자 " + menu + "번 선택함!!");
			}
			else if (menu == 2) {
				System.out.println("관리자 " + menu + "번 선택함!!");
			}
			else {
				System.out.println("잘못된 입력 입니다");
			}
		}
		else {
			System.out.println(name+"로그인!!");
			
			
			System.out.println("## 메뉴를 선택하세요 (1~2) ##");
			System.out.print("# 메뉴 선택 : ");
			
			menu = scan.nextInt();
			
			if (menu == 1 ) {
				System.out.println(name + " " + menu + "번 선택함!!");
			}
			else if (menu == 2) {
				System.out.println(name + " " + menu + "번 선택함!!");
			}
			else {
				System.out.println("잘못된 입력 입니다");
			}
		}
		
	}

}
*/


// 논리연산자 사용 추가
public class IfExam3 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("## 로그인 (admin혹은 임의 아이디) ##");
		System.out.print("# 로그인 아이디 : ");
		
		String name = "";
		name = scan.next();
		
		int menu = 1;
		
		if (name .equals("admin") ) {
			System.out.println("관리자 로그인!!");
		}
		else {
			System.out.println(name+"로그인!!");
		}
		
		System.out.println("## 메뉴를 선택하세요 (1~2) ##");
		System.out.print("# 메뉴 선택 : ");
		
		
		menu = scan.nextInt();
		
		if (menu == 1 && name .equals("admin")) {
			System.out.println("관리자 " + menu + "번 선택함!!");
		}
		else if (menu == 1 && !name .equals("admin")) {
			System.out.println(name + " " + menu + "번 선택함!!");
		}
		else if (menu == 2 && name .equals("admin")) {
			System.out.println("관리자 " + menu + "번 선택함!!");
		}
		else if (menu == 2 && !name .equals("admin")) {
			System.out.println(name + " " + menu + "번 선택함!!");
		}
		else {
			System.out.println("잘못된 입력 입니다");
		}
		
	}

}
