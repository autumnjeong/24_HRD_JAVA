package day04;
import java.util.ArrayList;

public class Main {
	
	// 구성 요소
	// 필드 : 객체의 데이터를 저장하는 역할
	
	// 생성자 : 객체 생성시 초기화 역할 (기본 생성자, 인자 생성자)
	
	// 메소드 : 객체의 동작으로 호출시 실행하는 블록
	
	public static void main(String[] args) {
		
		House house1 = new House("정가을", 3, "대전 동구 용운동");
		house1.showOwner(house1.ownerName);
		System.out.println("방의 갯수: "+house1.getRoomNum());
		System.out.println("집의 정보 1: "+house1.showInfo());
		house1.showInfo2();
		
		ArrayList<House> arrList = new ArrayList<House>();
		arrList.add(house1);
		arrList.add(new House("홍길동",4,"대전 서구 갈마동"));
		arrList.add(new House("이자바",5,"대전 중구 대흥동"));
		
		for(House house : arrList) {
			house.showInfo2();
		}
		
	}

}

// 집 클레스 모델링
// 추상화

class House{
	//has -a
	
	String ownerName;
	int roomNum;
	String address;
	
	// 인자 생성자
	public House() {
		
	}
	
	public House(String ownerName, int roomNum, String address) {
		this.ownerName = ownerName;
		this.roomNum = roomNum;
		this.address = address;
	}
	
	// 1. 반환 없고, (주인이름을 매개변수로 전달 받아 이름)을 같이 출력하는 메소드 showOwner()정의 
	void showOwner(String name) {
		System.out.println("현재 전달받은 집 주인의 이름은 "+name+"입니다.");
	}
	
	// 2. 방의 갯수를 반환하는 getRoomNum()메소드 정의
	int getRoomNum() {
		return roomNum;
	}
	
	
	// 3. 모든 멤버 변수의 값을 반환하는 showInfo()메소드 정의
	 String showInfo() {
		String result = "집주인 이름: "+ ownerName + "\n방의 갯수 : " + roomNum + "\n집 주소: " + address;
		return result;
	}
	 
	 void showInfo2() {
		 System.out.println("집주인 이름: "+ ownerName + "\n방의 갯수 : " + roomNum + "\n집 주소: " + address);
	 }
	
}





