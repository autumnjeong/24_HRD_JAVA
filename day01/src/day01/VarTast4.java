package day01;
import java.util.Scanner;

public class VarTast4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("출생년도 : ");
        int year = scan.nextInt();
        System.out.println(" : ");
        String age_type = scan.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        }
        else if (age_type.equals("Year")) {
        	answer = 2030 - year;
        }

        System.out.println(answer);
	}

}
