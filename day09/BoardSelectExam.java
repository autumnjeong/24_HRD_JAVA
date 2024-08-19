package day09;

import java.sql.*;

//import javax.sound.sampled.TargetDataLine;

//import java.io.*;

public class BoardSelectExam {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			// 1. JDBC 드라이버 로딩.....
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";

			// 2. 데이터 베이스 연결.....
			conn = DriverManager.getConnection(url, id, pwd);

			System.out.println("DB 연결 성공~");

			// 매개변수화된 SQL 문 작성
			String sql = "select * from boards where bwriter = ?";
			// PreparedStatement 얻기 및 값 지정
			PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "winter");

			ResultSet rs = st.executeQuery();

			/*if (rs.next()) {
				System.out.println("데이터 조회 성공");
				int no = rs.getInt("bno");
				String title = rs.getString("btitle");
				
				System.out.println("번호: " + no);
				System.out.println("타이틀: " + title);
			} else {
				System.out.println("데이터 조회 실패");
			}
			st.close();
			rs.close();*/
			
			while(rs.next()) {
				System.out.println("데이터 조회 성공");
				
				int no = rs.getInt("bno");
				String title = rs.getString("btitle");
				String content = rs.getString("bcontent");
				String writer = rs.getString("bwriter");
				String d = rs.getDate("bdate").toString();
				String fname = rs.getString("bfilename");
				//String fdata = null;
//				Blob blob = rs.getBlob("bfiledate");
//				InputStream is = blob.getBinaryStream();
//				OutputStream os = new FileOutputStream("C:/Users/COMPUTER/snow.jpg");
//				is.transferTo(os);
				
				System.out.println("번호: "+no);
				System.out.println("제목: "+title);
				System.out.println("내용: "+content);
				System.out.println("작성자: "+writer);
				System.out.println("작성일: "+d);
				System.out.println("파일이름: "+fname);
				//System.out.println("파일정보: "+fdata);
				
//				os.flush();
//				os.close();
//				is.close();
			}
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
