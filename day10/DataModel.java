package day10;

import java.sql.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class DataModel {

	// 1. 데이터 베이스 연결
	// 2. 데이터 입출력 담당 메소드 구현
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	ConnectDB cdb = null;
	Board board = null;
	Scanner scan = null;
	Statement st = null;
	User user = null;

	public DataModel() {
		cdb = new ConnectDB();
		
		con = cdb.getCon();
		if (con != null) {
			System.out.println("연결 성공!");
		} else {
			System.out.println("연결 실패!");
		}
		scan = new Scanner(System.in);
	}// 생성자............

	// 데이터 추가 메소드 InsertData() (Insert into~)
	public void insertData(Board board) throws SQLException {
		int num = 0;
		this.board = board;
		String sql = "INSERT INTO boards(btitle, bcontent, bwriter, bdate) VALUES (?,?,?,now())";
		pst = con.prepareStatement(sql);
		pst.setString(1, board.getBtitle());
		pst.setString(2, board.getBcontent());
		pst.setString(3, board.getBwriter());

		num = pst.executeUpdate();

		if (num > 0)
			System.out.println("저장 성공!");
		else
			System.out.println("저장 실패!");
	}
	
	public void insertData2(User user) throws SQLException {
		int num = 0;
		this.user = user;
		String sql = "INSERT INTO users(userid, username, userpassword, userage, useremail) VALUES (?,?,?,?,?)";
		pst = con.prepareStatement(sql);
		pst.setString(1, user.getUserid());
		pst.setString(2, user.getUsername());
		pst.setString(3, user.getUserpassword());
		pst.setInt(4, user.getUserage());
		pst.setString(5, user.getUseremail());

		num = pst.executeUpdate();

		if (num > 0)
			System.out.println("저장 성공!");
		else
			System.out.println("저장 실패!");
	}

	// 게시물 데이터 입력 받기
	public void create() throws SQLException {
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목: ");
		board.setBtitle(scan.nextLine());
		System.out.print("내용: ");
		board.setBcontent(scan.nextLine());
		System.out.print("작성자: ");
		board.setBwriter(scan.nextLine());
		///////////////////////////////////////
		insertData(board);
		///////////////////////////////////////
	}

	// 게시물 읽기 메소드 구현(bno를 입력 받아서 해당 게시글 읽어오기)
	public void read() throws SQLException {
		System.out.println("[게시물 읽기]");
		System.out.print("bno: ");
		int bno = Integer.parseInt(scan.nextLine());

		String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards where bno = ?";
		pst = con.prepareStatement(sql);
		pst.setInt(1, bno);
		rs = pst.executeQuery();

		while (rs.next()) {
			Board board = new Board();
			board.setBno(rs.getInt("bno"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("Bcontent"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBdate(rs.getDate("bdate"));
			System.out.println("###################");
			System.out.println("번호: " + board.getBno());
			System.out.println("제목: " + board.getBtitle());
			System.out.println("내용: " + board.getBcontent());
			System.out.println("작성자: " + board.getBwriter());
			System.out.println("날짜: " + board.getBdate());
			System.out.println("###################");

			System.out.println("-----------------------");
			System.out.println("보조 메뉴: 1.Update | 2.Delete | 3. List");
			System.out.print("메뉴 선택: ");
			String menuNum = scan.nextLine();
			System.out.println();

			if (menuNum.equals("1")) {
				update(board);
			} else if (menuNum.equals("2")) {
				delete(board);
			} else if (menuNum.equals("3")) {
				list();
			}
			exit();
		}
	}

	private void update(Board board) {
		System.out.println("[수정 내용 입력]");
		System.out.print("제목: ");
		board.setBtitle(scan.nextLine());
		System.out.print("내용: ");
		board.setBcontent(scan.nextLine());
		System.out.print("작성자: ");
		board.setBwriter(scan.nextLine());

		System.out.println("-----------------------");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = scan.nextLine();

		if (menuNo.equals("1")) {
			try {
				String sql = "UPDATE boards set btitle = ?, bcontent = ?, bwriter = ?" + "where bno=?";
				pst = con.prepareStatement(sql);
				pst.setString(1, board.getBtitle());
				pst.setString(2, board.getBcontent());
				pst.setString(3, board.getBwriter());
				pst.setInt(4, board.getBno());
				pst.executeUpdate();
				pst.close();

			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}

	private void delete(Board board) {
		try {
			String sql = "delete from boards where bno=?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, board.getBno());
			pst.executeUpdate();
			pst.close();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		list();
	}

	public void clear() {
		System.out.println("[게시물 전체 삭제]");
		System.out.println("-----------------------");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = scan.nextLine();
		if (menuNo.equals("1")) {
			try {
				String sql = "TRUNCATE TABLE boards";
				pst = con.prepareStatement(sql);
				pst.executeUpdate();
				pst.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}

	public void exit() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {

			}
		}
		System.out.println("** 게시판 종료 **");
		System.exit(0);
	}

	// 데이터 검색 list()
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s \n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------------------------");

		try {
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards order by bno desc";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("Bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s \n", board.getBno(), board.getBwriter(), board.getBdate(),
						board.getBtitle());
			}
			//rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}

	}
	
	public void join() throws SQLException {
		User user = new User();
		System.out.println("[새 사용자 입력]");
		System.out.print("아이디: ");
		user.setUserid(scan.nextLine());
		System.out.print("이름: ");
		user.setUsername(scan.nextLine());
		System.out.print("비밀번호: ");
		user.setUserpassword(scan.nextLine());
		System.out.print("나이: ");
		user.setUserage(scan.nextInt());
		System.out.print("이메일: ");
		user.setUseremail(scan.nextLine());
		///////////////////////////////////////
		insertData2(user);
		///////////////////////////////////////
	}

//	//데이터 조건 검색
//	public void list() {
//		System.out.println();
//		System.out.println("[게시물 목록]");
//		System.out.println("-----------------------------------------------------------------");
//		System.out.printf("%-6s%-12s%-16s%-40s \n", "no", "writer", "date", "title");
//		System.out.println("-----------------------------------------------------------------");
//		
//		try {
//			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards where bwriter = ?";
//			pst = con.prepareStatement(sql);
//			pst.setString(1, "winter");
//			rs = pst.executeQuery();
//			
//			while(rs.next()){
//				Board board = new Board();
//				board.setBno(rs.getInt("bno"));
//				board.setBtitle(rs.getString("btitle"));
//				board.setBcontent(rs.getString("Bcontent"));
//				board.setBwriter(rs.getString("bwriter"));
//				board.setBdate(rs.getDate("bdate"));
//				System.out.printf("%-6s%-12s%-16s%-40s \n",
//						board.getBno(),
//						board.getBwriter(),
//						board.getBdate(),
//						board.getBtitle());
//			}
//			rs.close();
//		}catch(SQLException e){
//			e.printStackTrace();
//			
//		}
//		
//	}

//	// 매개변수 사용 데이터 조건 검색
//	public void list(String name) throws SQLException {
//		System.out.println();
//		System.out.println("[게시물 목록]");
//		System.out.println("-----------------------------------------------------------------");
//		System.out.printf("%-6s%-12s%-16s%-40s \n", "no", "writer", "date", "title");
//		System.out.println("-----------------------------------------------------------------");
//
//		try {
//			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards where bwriter = ?";
//			pst = con.prepareStatement(sql);
//			pst.setString(1, name);
//			rs = pst.executeQuery();
//
//			while (rs.next()) {
//				Board board = new Board();
//				board.setBno(rs.getInt("bno"));
//				board.setBtitle(rs.getString("btitle"));
//				board.setBcontent(rs.getString("Bcontent"));
//				board.setBwriter(rs.getString("bwriter"));
//				board.setBdate(rs.getDate("bdate"));
//				System.out.printf("%-6s%-12s%-16s%-40s \n", board.getBno(), board.getBwriter(), board.getBdate(),
//						board.getBtitle());
//			}
//			rs.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//
//		}
//
//	}

	public static void main(String[] args) throws SQLException {
		DataModel dm = new DataModel();
		// dm.create();
		// dm.list("winter");
		dm.read();
	}

}
