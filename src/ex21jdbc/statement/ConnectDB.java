package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//상속을 목적으로 생성하는 추상클래스 oracleDB 연결과 자원반납을 담당한다.
// 추상클래스는 객체를 생성할 수 없지만 참조변수 선언 상속등의 기능은 사용할수 있습니다.

public abstract class ConnectDB {
	// 멤버 변수
	// 상속관계에서 사용할수있는 protected 접근지정자 사용
	protected Connection con;	// DB연결담당
	protected Statement stmt;	// 정적쿼리문 전송 및 실행 담당
	protected ResultSet rs;		// select 쿼리 실행결과를 반환 받음
	
	// 생성자 1 계정, 아이디, 패스워드를 매개변수로 받은 후 DB연결 
	public ConnectDB(String id, String pw) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", id, pw);
			System.out.println("오라클 DB 연결성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패 ");
		} catch (Exception e) {
			System.out.println("알수 없는 예외 발생 ");
			e.printStackTrace();
		}
	}
	// 생성자 2 : 앞에서 선언한 생성자를 복사하여 선언된 생성자로 고정된 값으로 DB연결을 담당합니다.
	public ConnectDB() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "education", "1234");
			System.out.println("오라클 DB 연결성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패 ");
		} catch (Exception e) {
			System.out.println("알수 없는 예외 발생 ");
			e.printStackTrace();
		}
	}
	// 자원반납
	public void close() {
		try {
			// statement connection resultset 객체에 대한 자원반납쿼리 
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
			if (rs != null)
				rs.close();
			System.out.println("DB자원반납완료");

		} catch (SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	// 상속 관계에서 오버라이딩을 목정으로 생성한 추상메서드로 하위 클래스에서 각 업무 update delete select 등의 따라
	// 재정의 하게 될 것입니다. 
	
	// 추상메서드를 포함한 클래스는 반드시 추상클래스로 선언해야 에러가 발생하지 않는다. 
	// 따라서 해당 클래스는 abstract 로 선언해야한다.
	abstract void execute();

}
