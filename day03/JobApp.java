package day03;

public class JobApp {

	public static void main(String[] args) {

		//person 객체 생성
		Person jeong = new Person();
		jeong.age = 23;
		jeong.name ="정가을";
		jeong.먹다();
		jeong.웃다();
		
		
		System.out.println(jeong.age);
		System.out.println(jeong.name);

	}

}
