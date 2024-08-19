package day09;

/*
 *  1. JDBC 드라이버 로드
 *  2. 데이터 베이스 연결
 */
import java.sql.*;
import java.util.ArrayList;

public class PersonSelect {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

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
			// String sql2 = "select name, phone from person";

			// 이름이 강아지와 같은 사람의 모든 정보를 검색해서 출력하기
			String sql2 = "select * from person";

			// 4. 데이터 조회 명령 sql실행.....
			st = con.createStatement();
			rs = st.executeQuery(sql2);

			String name = "";
			String phone = "";
			String email = "";
			String age = "";
			Person person = null;
			ArrayList<Person> arList = new ArrayList<Person>();
			while (rs.next()) {

				name = rs.getString("name");
				phone = rs.getString("phone");
				email = rs.getString("email");
				age = rs.getString("age");
				person = new Person(name, phone, email, age);
				
				arList.add(person);
				
			}
			for(Person p : arList) {
				System.out.println("이름: " + p.getName());
				System.out.println("전화번호: " + p.getPhone());
				System.out.println("이메일: " + p.getEmail());
				System.out.println("나이: " + p.getAge());
				System.out.println(" ");
			}
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패!");
		} finally {
			if (con != null)
				try {
					rs.close();
					st.close();
					con.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {

				}
		}
	}

}
