package day02;
import java.util.Scanner;
import java.util.Random;

public class Rock {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		boolean game = true;
		
		while(game) {
			System.out.println("------------Game start------------");
			System.out.println("가위 | 바위 | 보 | 게임종료");
			System.out.println("----------------------------------");
			System.out.print("입력(글자로 입력하세요): ");
			
			String num = scan.nextLine();
			System.out.println("유저 : "+num);
			int bot = random.nextInt(3)+1;			
			
			if(num.equals("가위")) {
				
				if(bot == 1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("비겼다");
				}
				else if(bot == 2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("졌다ㅠㅠ");
				}
				else if(bot == 3) {
					System.out.println("컴퓨터: 보");
					System.out.println("이겼다!!");
				}
			}
			
			else if(num.equals("바위")) {
				if(bot == 1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("이겼다!!");
				}
				else if(bot == 2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("비겼다");
				}
				else if(bot == 3) {
					System.out.println("컴퓨터: 보");
					System.out.println("졌다ㅠㅠ");
				}
			}
			else if(num.equals("보")) {
				if(bot == 1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("졌다ㅠㅠ");
				}
				else if(bot == 2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("이겼다!!");
				}
				else if(bot == 3) {
					System.out.println("컴퓨터: 보");
					System.out.println("비겼다");
				}
			}
			else if(num.equals("게임종료")) {
				game = false;
			}
			else {
				System.out.println("잘못된 입력 입니다");
			}
			
		}
		System.out.println("게임이 종료되었습니다");

	}

}
