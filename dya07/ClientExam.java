package dya07;
import java.io.*;
import java.net.*;

public class ClientExam {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",12345);
			
			System.out.println("[클라이언트] 연결 성공");
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
			
		}catch(UnknownHostException e) {
			
		}catch(IOException e) {
			
		}
	}

}
