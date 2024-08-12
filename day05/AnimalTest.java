package day05;

interface Soundable{
	public String sound();
}

abstract class Animal{
	//추상 클래스 : 적어도 한개 이상의 추상 메소드르르 가지는 클래스
	// 추상 메소드 : {}바디가 없는 메소드
	
	abstract void sound();	
}


class Dog implements Soundable{

	@Override
	public String sound() {
		return "멍멍";
		
	}
	
}
class Cat implements Soundable{

	@Override
	public String sound() {
		return "야옹";
		
	}
	
}

public class AnimalTest {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		
//		Animal animal = new Dog();
//		animal.sound();
		
//		AnimalTest at = new AnimalTest();
//		at.sound();
		
		AnimalTest.printSound(new Dog());
		AnimalTest.printSound(new Cat());

	}

}
