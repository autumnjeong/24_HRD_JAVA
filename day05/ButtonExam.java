package day05;
import java.awt.*;

class Button{
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}

public class ButtonExam {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭 하셨습니다.");
			}
			
		});
		
		
		btnOk.click();
		
		
		
		Button btncancel = new Button();
		
		btncancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭 하셨습니다.");
			}
			
		});
		
		
		btncancel.click();
		
	}

}
