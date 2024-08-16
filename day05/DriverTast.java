package day05;

interface Vehicle{
	//추상메소드
	public void run();
}

class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달린다.");
	}
}

class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달린다.");
	}
}

class Driver{
	//다형성 구현
	void driver(Vehicle v) {
		System.out.println("운전자 . . .");
		v.run();
	}
}




public class DriverTast {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		driver.driver(bus);
		driver.driver(new Taxi());
		
	}

}