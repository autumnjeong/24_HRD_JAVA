package day03;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		Car yourCar = new Car();
		
		
		myCar.company = "현대";
		myCar.color = "검정";
		myCar.model = "제네시스";
		myCar.maxSpeed = 200;
	
		yourCar.company = "기아";
		yourCar.color = "흰색";
		yourCar.model = "카니발";
		yourCar.maxSpeed = 180;
		
		
		//매소드 호출
		myCar.CarInfo();
		
		yourCar.CarInfo();
		
		Car myCar2 = new Car("기아","K7","검정",190);
		
		myCar2.CarInfo();

	}

}