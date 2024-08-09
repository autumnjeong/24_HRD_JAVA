package day04;

import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;

public class JobApp {
	static Person p1;
	static Company c1;
	ArrayList<Person> arryList = new ArrayList<Person>();
	ArrayList<Company> arrList = new ArrayList<Company>();
	
	public void showMenu() {
		System.out.println("*******************JOB v1.1****************");
		System.out.println("*** 1. 구직 등록 ***");
		System.out.println("*** 2. 구인 등록 ***");
		System.out.println("*** 3. 구직자 정보 출력 ***");
		System.out.println("*** 4. 구인회사 정보 출력 ***");
		System.out.println("*** 5. 종료 ***");
		System.out.println("*******************************************");
		System.out.println("메뉴 번호를 입력하세요 > ");
		System.out.println("*******************************************");
	} //showMenu()-------------------------
	
	public void inputPerson() {
		//이름, 나이, 성별 전화번호를 입력 받아 Person객체에 저장
		Scanner sc = new Scanner(System.in);
		p1 = new Person();
		
		System.out.println("------구직 등록 start-------");
		System.out.print("이름 입력 > ");
		String nm = sc.next();
		p1.name = nm;
		System.out.print("나이 입력 >");
		int a = sc.nextInt();
		p1.age = a;
		
		//성별 전화번호 입력-----
		System.out.println("------성별 메뉴------");
		System.out.println("1. 남자, 2. 여자");
		System.out.println("---------------------");
		System.out.print("성별 메뉴 번호 입력 >");
		int s = sc.nextInt();
		if(s == 1) {
			p1.gender='M';
		} else if(s == 2) {
			p1.gender='F';
		} else {
			System.out.println("지원되지 않는 메뉴 번호 입니다");
		}
		System.out.print("전화번호 입력 >");
		String t = sc.next();
		p1.tel = t;
		
		arryList.add(p1);
		
		
	}
	
	public void inputCompany() {
	
		Scanner sc = new Scanner(System.in);
		c1 = new Company();
		
		System.out.println("------구인 등록 start-------");
		System.out.print("회사 명 입력 > ");
		String cn = sc.next();
		c1.name = cn;
		System.out.print("회사 소개 입력 >");
		String i = sc.next();
		c1.Introduction = i;
		System.out.print("구인 직종 입력 >");
		String ty = sc.next();
		c1.type = ty;
		System.out.print("예상 연봉 입력>");
		int s = sc.nextInt();
		c1.sear = s;
		System.out.print("전화번호 입력 >");
		String t = sc.next();
		c1.tel = t;
		
		arrList.add(c1);
		
		
	}
	
	// 구직자 정보 출력 메소드
	void showInfo() {
		for(Person p : arryList) {
			p.getInfo();
		}
	}
	
	void showCompanyInfo() {
		for(Company c : arrList) {
			c.getCompanyInfo();
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		JobApp ja = new JobApp();
		
		while(true) {
			ja.showMenu();
			int no=sc.nextInt();
			
			if(no==5) { //종료
				System.out.println("프로그램이 종료됩니다");
				System.exit(0); //프로그램종료
			} else if (no == 1) {
				ja.inputPerson();
			}else if (no == 2) {
				ja.inputCompany();
			} else if (no == 3) {
				ja.showInfo();
			} else if (no == 4) {
				ja.showCompanyInfo();
			}
					
		}

	}

}
