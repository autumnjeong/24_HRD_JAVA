package day02;
import java.util.Scanner;
import java.util.Random;

public class RockTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		boolean game = true;
		
		while(game) {
			System.out.println("------------Game start------------");
			System.out.println("1. 가위 | 2. 바위 | 3. 보 | 0. 게임종료");
			System.out.println("----------------------------------");
			System.out.print("선택(숫자로 입력하세요): ");
			int no = scan.nextInt();
			int com = random.nextInt(3)+1;
			
			if(no ==0) break;
			
			System.out.println("유저측 : "+no);
			System.out.println("컴퓨터측 : "+com);
			
			if (no == 0) System.exit(0);
			if (no == com) {
				System.out.println("비겼군요");
			}
			else if((no ==1)&&(com == 3)||
					(no ==2)&&(com == 1)||
					(no ==3)&&(com == 2)) {
				System.out.println("유저 승");
			}
			else {
				System.out.println("유저 패");
			}
		}

	}

}
