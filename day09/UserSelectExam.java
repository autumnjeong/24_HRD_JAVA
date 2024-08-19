package day09;

import java.sql.*;

public class UserSelectExam {
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

			String sql = "select * from users where userid = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, "kim");
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				System.out.println("데이터 조회 성공");
				String name = rs.getString("username");
				int age = rs.getInt("userage");
				System.out.println("이름: "+name);
				System.out.println("나이: "+age);
			}else {
				System.out.println("데이터 조회 실패");
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
