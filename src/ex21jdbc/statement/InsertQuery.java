package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {

	Connection con;
	Statement stmt;

	public InsertQuery() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "education";
			String pass = "1234";
			con = DriverManager.getConnection(url, id, pass);

		} catch (Exception e) {
			System.out.println("연결실패");
		}
	}// end of InsertQuery
	
	
	// DB 자원해제
	
	private void close() {
		try {
			// 연결 확인 후 자원을 해제한다.
			if(stmt !=null) stmt.close();
			if(con !=null) con.close();
			System.out.println("DB자원반납완료");

		} catch (Exception e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
		}
	}// end of close
	
	// 쿼리작성 및 전송, 실행을 위한 메서드 
	private void execute() {
		try {
			// statement 객체 생성 메서드를 호출합니다.
			stmt = con.createStatement();
			//정적 insert 쿼리문 작성 ( 인파라미터 없는 쿼리문 )
			String sql = "INSERT INTO member VALUES " + " ('test3', '3333', '테스터3', SYSDATE) ";
			// 쿼리문 전송 및 실행 
			int affected = stmt.executeUpdate(sql);
			// insert문 실행에 대한 결과 출력 
			System.out.println(affected + "행이 입력되었습니다.");
			close();
			
		} catch (SQLException e) {
			System.out.println("쿼리실행에 문제가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		InsertQuery iSQL = new InsertQuery();
		iSQL.execute();
		
		
		}
}
