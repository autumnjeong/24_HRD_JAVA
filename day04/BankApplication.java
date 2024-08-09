package day04;
import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	
	static Human a1;
	ArrayList<Human> arryList = new ArrayList<Human>();
	
	public void showMenu() {
		System.out.println("---------------------------은행-------------------------");
		System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("--------------------------------------------------------");
		System.out.print("선택 > ");
	}
	
	public void inputHuman() {
		Scanner sc = new Scanner(System.in);
		a1 = new Human();
		
		System.out.println("----------------------");
		System.out.println("계좌 생성");
		System.out.println("----------------------");
		System.out.print("계좌번호: ");
		String num = sc.next();
		a1.num = num;
		System.out.print("계좌 주: ");
		String na = sc.next();
		a1.name = na;
		System.out.println("초기 입금액: ");
		int mo = sc.nextInt();
		a1.money = mo;
		
		arryList.add(a1);
	}
	
	void showInfo() {
		for(Human h : arryList) {
			h.getInfo();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankApplication bal = new BankApplication();
		
		while(true){
			bal.showMenu();
			int no =sc.nextInt();
			
			if (no == 1) {
				bal.inputHuman();
			} else if (no == 2) {
				bal.showInfo();
			} else if (no == 3) {
				bal.showInfo();
			} else if(no==5) { //종료
				System.out.println("프로그램이 종료됩니다");
				System.exit(0);
			}
		}
	}

}
