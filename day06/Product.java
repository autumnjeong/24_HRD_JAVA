package day06;

public abstract class Product {
	String pname;
	int price;
	
	public void printDetail() {
		System.out.print("상품명 : "+pname+",");
		System.out.print("가  격 : "+price+",");
		printExtra();
	}
	//추상메소드
	public abstract void printExtra();
}
