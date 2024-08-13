package day06;

public class SmartTV extends Product{
		
		String resolution;
		
		public SmartTV(String pname, int price, String resolution) {
			this.resolution = resolution;
			this.pname = pname;
			this.price = price;
		}
		
		@Override
		public void printExtra() {
			System.out.println(" 해상도: "+ resolution);
		}
}
