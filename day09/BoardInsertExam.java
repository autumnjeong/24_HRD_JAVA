package day09;

import java.sql.*;
import java.io.FileInputStream;

public class BoardInsertExam {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//1. JDBC 드라이버 로딩.....
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";

			// 2. 데이터 베이스 연결.....
			conn = DriverManager.getConnection(url, id, pwd);
			
			System.out.println("DB 연결 성공~");

			// 매개변수화된 SQL 문 작성
			String sql = "" + "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata) "
					+ "VALUES (?, ?, ?, now(), ?, ?)";
			// PreparedStatement 얻기 및 값 지정
			PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "눈");
			st.setString(2, "눈이 내려요.");
			st.setString(3, "winter");
			st.setString(4, "snow.jpg");
			st.setBlob(5, new FileInputStream("C:/Users/COMPUTER/snow.jpg"));

			
			int result = st.executeUpdate();

			if (result > 0) {
				System.out.println("데이터 저장 성공~");
			} else {
				System.out.println("데이터 저장 실패!");
			}

			// PreparedStatement 닫기
			st.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패!");
		} finally {
			if (conn != null)
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {

				}
		}
	}

}
