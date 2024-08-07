package day02;

public class RefType {

	public static void main(String[] args) {

		RefType ref = new RefType();
		RefType ref2 = new RefType();
		
		if(ref == ref2) {
			System.out.println("동일한 주소를 갖는 객체이다.");
		}
		else {
			System.out.println("서로 다른 주소를 갖는 객체이다.");
		}
		
	}

}
