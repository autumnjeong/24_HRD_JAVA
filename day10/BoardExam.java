package day10;

import java.sql.SQLException;
import java.util.Scanner;

public class BoardExam {
	
	private Scanner scanner = new Scanner(System.in);
	DataModel dm = null;
	
	public BoardExam() {
		dm = new DataModel();
	}
	
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s \n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s \n", "1", "writer", "2202.01.27", "게시판에 오신것을 환영합니다");
		System.out.printf("%-6s%-12s%-16s%-40s \n", "2", "writer", "2202.01.27", "올 겨울은 많이 춥습니다");
		
	}
	
	public void mainMenu() throws SQLException {
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit | 5.Join");
		System.out.print("메뉴선택: ");
		String menuNo = scanner.nextLine();
		System.out.println();
		
		switch(menuNo) {
			case "1" : 
				dm.create();
				break;
			case "2": 
				dm.read();
				break;
			case "3": 
				dm.clear();
				break;
			case "4": 
				dm.exit();
				break;
			case "5": 
				dm.join();
				break;
		}
		
	}
	

	public void create() {
		System.out.println("*** create()메소드 실행됨");
		list();
	}
	
	public void read() {
		System.out.println("*** read()메소드 실행됨");
		list();
	}
	
	public void clear() {
		System.out.println("*** clear()메소드 실행됨");
		list();
	}
	
	public void exit() {
		System.exit(0);
	}


	public static void main(String[] args) throws SQLException {
		BoardExam boardExam = new BoardExam();
		boardExam.mainMenu();
	}

}
