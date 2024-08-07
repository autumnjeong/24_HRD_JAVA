package day02;
import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean bank = true;
		
		int money = 0; //총금액
		int x = 0; // 입금액
		int y = 0; //출금액
		
		
		while(bank) {
			System.out.println("------------------은행---------------");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔액 | 0. 종료");
			System.out.println("--------------------------------------");
			System.out.print("선택(숫자로 입력하세요): ");

			int num = scan.nextInt();
			
			if(num == 1) {
				System.out.print("얼마를 입금하시겠습니까?");
				x = scan.nextInt();
				System.out.println(x+"원이 입금되었습니다");
				money = money + x;
			}
			else if(num == 2) {
				System.out.print("얼마를 출금하시겠습니까?");
				y = scan.nextInt();
				if(y <= money) {
					System.out.println(y+"원이 출금되었습니다");
					money = money - y;
				}
				else {
					System.out.println("잔액이 모자랍니다");
				}
			}
			else if(num == 3) {
				System.out.println("현재 잔액은 "+money+"원 입니다");
			}
			else if(num == 4) {
				bank = false;
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
