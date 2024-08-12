package day05;

public class Student extends Person {
	
	// id, 학급 변수 cName 추가
	private String id;
	private String cName;
	
	// 생성자
	public Student(){
		
	}
	public Student(String id, String cName, String name, int age){
		super(name, age);
		this.id=id;
		this.cName=cName;
	}
	
	//getter, setter
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setcName(String cName) {
		this.cName=cName;
	}
	public String getcName() {
		return cName;
	}
	
	
	//메소드 오버라이딩
	@Override
	public String personInfo() {
		String info = super.personInfo();
		info += "\nID: "+ id + "\n학급 이름: " + cName;
		return info;
	}
	
}
