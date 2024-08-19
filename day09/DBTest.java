package day09;

/*
 *  1. JDBC 드라이버 로드
 *  2. 데이터 베이스 연결
 */
import java.sql.*;

public class DBTest {

	public static void main(String[] args) {
		Connection con = null;
		try {
			// 1. JDBC 드라이버 로딩.....
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";

			// 2. 데이터 베이스 연결.....
			con = DriverManager.getConnection(url, id, pwd);

			System.out.println("DB 연결 성공~");

			// 3. sql 실행을 위한 Statement, PreparedStatement 객체 생성.....
			// String sql = "INSERT INTO person VALUES
			// ('정가을','010-9513-1398','ga1398@naver.com','23');";
			String sql2 = "insert into person (name, phone, email, age)" + "values(?,?,?,?)";

			PreparedStatement st = con.prepareStatement(sql2);

			st.setString(1, "한겨울");
			st.setString(2, "010-9999-9999");
			st.setString(3, "9999@gmail.com");
			st.setString(4, "30");
			
			// 4. 데이터 추가 명령 전송하기.....
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
