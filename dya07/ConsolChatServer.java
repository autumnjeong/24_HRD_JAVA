package dya07;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ConsolChatServer implements Runnable {

	private static ServerSocket serverSocket = null;
	static Socket sock = null;

	public ConsolChatServer() throws Exception {
		serverSocket = new ServerSocket(12345);
		System.out.println("[서버] 시작됨");
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트] 연결 성공");

		// 클라이언트에게 메세지 입력 객체
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pout = new PrintWriter(socket.getOutputStream());
		//클라이언트에게 키보드로 메세지 전송
		Thread tr = new Thread(this);
		tr.start();
		String msg ="";
		
		while((msg = key.readLine())!=null) {
			pout.println(msg);
		}
		
		
	}

	public static void main(String[] args) throws Exception {
		try {
			
			new ConsolChatServer();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		try {
			InputStream is = sock.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			 String clientMsg = "";
			while(true) {
				clientMsg=br.readLine();
				System.out.println("From client>>"+clientMsg);
			}
		}catch(Exception e) {
			System.out.println("예외: "+e.getMessage());
		}
		
	}
}
