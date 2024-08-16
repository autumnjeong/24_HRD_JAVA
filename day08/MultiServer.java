package day08;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MultiServer {
	ServerSocket ser;
	public ArrayList<MultiServerRunnable> arrlist;
	MultiServerRunnable mr;
	Socket socket;

	public MultiServer() {
		try {

			ser = new ServerSocket(12345);
			arrlist = new ArrayList<MultiServerRunnable>();
			System.out.println("서버 대기중 . . . ");

			while (true) {
				socket = ser.accept();
				System.out.println("연결 성공");
				mr = new MultiServerRunnable(socket);
				arrlist.add(mr);
				Thread tr = new Thread(mr);
				tr.start();
			}

		} catch (IOException e) {

		}
	}

	public static void main(String[] args) {
		new MultiServer();
	}

	class MultiServerRunnable implements Runnable {

		Socket sock;
		DataInputStream dis;
		DataOutputStream dos;

		public MultiServerRunnable(Socket sock) {
			this.sock = sock;
		}

		public void broadCasting(String msg) throws IOException {
			for (MultiServerRunnable mr : arrlist) {
				if (mr != this) {
					System.out.println("Massage: " + msg.toString());
					mr.send(msg);
				}
			}
		}

		public void send(String msg) throws IOException {
			System.out.println("sand[Massage]: " + msg);
			dos.writeUTF(msg);
			dos.flush();
		}

		@Override
		public synchronized void run() {

			boolean flag = false;
			try {

				dis = new DataInputStream(sock.getInputStream());
				dos = new DataOutputStream(sock.getOutputStream());

				while (!flag) {
					String msg = dis.readUTF().toString();
					System.out.println("Massage: " + msg);
					broadCasting(msg);
				}

			} catch (IOException e) {

			}

		}

	}

}
