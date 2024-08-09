package day04;

public class Company {
	
	String name;
	String Introduction;
	String type;
	int sear;
	String tel;

	
	// 기본 생성자
	public Company() {
		
	}
	
	//메소드 getInfo()
	
	void getCompanyInfo() {
		System.out.println("---------------------");
		System.out.println("회사 명: " + this.name);
		System.out.println("회사 소개: " + this.Introduction);
		System.out.println("구인 직종:  " + this.type);
		System.out.println("예상 급여:  " + this.sear);
		System.out.println("전화 번호: " + this.tel);
		System.out.println("---------------------");
	}
	

}
