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
		
		String name = new String("정가을");
		System.out.println(name);
		
		String name2 = "오늘도 수고하셨습니다";
		System.out.println(name2.length());
		
		
		//배열 선언
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int sum = 0;
		
		for(int i =0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("총합: "+sum);
	}

}
