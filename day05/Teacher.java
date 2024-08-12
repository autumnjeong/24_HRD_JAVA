package day05;

public class Teacher extends Person {
	private String id;
	private String subject;
	
	public Teacher(){
		
	}
	public Teacher(String id, String subject, String name, int age){
		super(name, age);
		this.id=id;
		this.subject=subject;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	
	@Override
	public String personInfo() {
		String info = super.personInfo();
		info += "\n교사 ID: "+ id + "\n담당 과목: " + subject;
		return info;
	}

}