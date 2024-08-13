package day06;
import java.io.IOException;
import java.io.*;

public class DataInOutStream {
	
	static DataOutputStream dos = null;
	static DataInputStream dis = null;
	public static void main(String[] args) {
		
		try {
			dos = new DataOutputStream(System.out);
			dos.writeInt(10);
			dos.writeDouble(155.2);
			dos.writeBoolean(true);
			dos.writeChar('가');
			dos.writeUTF("문자열 입력하기");
			
			System.out.println("정수값: "+dis.readInt());
			System.out.println("실수값: "+dis.readDouble());
			System.out.println("논리값: "+dis.readBoolean());
			System.out.println("문자값: "+dis.readChar());
			System.out.println("문자열값: "+dis.readUTF());
			
			
		}catch(Exception e){
			e.getMessage();
		}
		
		
		
		
		
		
	}

}
