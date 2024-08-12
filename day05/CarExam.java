package day05;

class Car{
	class Tire{}
	static class Engine{}
}

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
		Car.Engine engine = new Car.Engine();

	}

}
