package day04;

public class Human {
	
	String num;
	String name;
	int money;

	
	// 기본 생성자
	public Human() {
		
	}
	
	//메소드 getInfo()
	
	void getInfo() {
		System.out.print(this.num+"   ");
		System.out.print(this.name+"   ");
		System.out.println(this.money);
	}

}
