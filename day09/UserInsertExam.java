package day09;

import java.sql.*;

public class UserInsertExam {
	public static void main(String[] args) {
		Connection con = null;
		try {
			// 1. JDBC 드라이버 로딩.....
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 연결하기
			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";

			// 2. 데이터 베이스 연결.....
			con = DriverManager.getConnection(url, id, pwd);

			System.out.println("DB 연결 성공~");

			String sql = "INSERT INTO users VALUES (?, ?, ?, ?, ?)";

			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, "kim");
			st.setString(2, "김겨울");
			st.setString(3, "11111");
			st.setInt(4, 20);
			st.setString(5, "winter@gmail.com");

			int result = st.executeUpdate();

			if (result > 0) {
				System.out.println("데이터 저장 성공~");
			} else {
				System.out.println("데이터 저장 실패!");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패!");
		} finally {
			if (con != null)
				try {
					con.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {

				}
		}
	}

}
