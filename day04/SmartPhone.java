package day04;

public class SmartPhone extends Phone{
	
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		super ();
		System.out.println("부모클래스생성자 실행입니다.");
	}
	
	@Override
	public void bell() {
		System.out.println("링딩동 링딩동 벨소리가 울립니다.....");
		super.bell();
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경하였습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}

}
