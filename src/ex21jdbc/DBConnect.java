package ex21jdbc;

import java.sql.Connection;
// Connection :
//  특정 데이터 원본과 연결된 커넥션을 나타낸다.
// SQL문장을 정의하고 실행시킬수 있는 statement 객체를 생성할 때 Connection 객체를 사용합니다.

// Driver Manager :
// data 원본에 JDBC드라이버를 통하여 커넥션을 만드는 역할을 합니다
// Class.forName 메소드를 통해서 생성된다.
import java.sql.DriverManager;

public class DBConnect {

	public static void main(String[] args) {
		
		// JDBC프로그래밍 절차
		//  1. 오라클용 JDBC드라이버를 메모리에 로드한다.
		//  : new 를 사용하지않고 클래스명으로 직접 객체를 생성한 후 메모리에 로드하는 forName이라는 정적메서드를 사용한다.
		//	  메모리에 로드된 드라이버가 DriverManager 라는 클래스에 등록한다.
		//  2. 오라클 연결을 위해 커넥션 URL, 계정아이디, 패스워드를 준비합니다. 
		//	: 커넥션 URL =>  jdbc:oracle:thin:@localhost:1521:xe  @오라클서버 호스트이름(IP주소):포트번호: SID명 
		//	## 서버환경에 따라 ip주소:포트번호:SID는 변경될수 있다. 
		//	3. DriverManager 클래스의 정적메서드인 getConnection()를 통해 데이터베이스에 연결을 시도하고 
		//                   연결에 성공하면 Connection 객체를 반환합니다. 
		//  4. 우리는 반환된 Connection 객체를 통해 DB작업 (CREATE READ UPDATE SELECT) CRUD를 처리하게 된다. 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pass = "1234";

			Connection con = DriverManager.getConnection(url, id, pass);
			if (con != null) {
				System.out.println("Oracle 연결성공");

			} else {
				System.out.println("Oracle 연결실패");
			}

		} catch (Exception e) {
			System.out.println("Oracle 연결시 예외발생");
			e.printStackTrace();
		}

	}

}
