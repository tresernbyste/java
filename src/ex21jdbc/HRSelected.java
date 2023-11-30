package ex21jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



//  Statement : 단순한 정적 SQL문을 사용할 경우에 좋다.
//		장점 : SQL문을 직접적으로 작성하기 때문에 쉽게 분석 할수 있다.
import java.sql.Statement;

public class HRSelected {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pass = "1234";

			Connection con = DriverManager.getConnection(url, id, pass);
			if (con != null) {
				System.out.println("Oracle 연결성공");
				// ㅆㅂ  "department_id = 50"  d앞에 공백이 없으면 에러발생가능성 있음 
				// 쿼리문 작성시 줄바꿈 할 때 앞뒤로 스페이스를 삽입하는 것이 좋다 그렇지 않으면 문장이 서로 이어지게되어 
				// Syntex 오류발생
				String sql = " SELECT * FROM employees WHERE " + " department_id=50 " + " ORDER BY employee_id DESC ";
//				String sql = "SELECT * FROM employees WHERE" + "department_id=50" + " ORDER BY employee_id DESC";  --Syntex 에러발생
				
				
				// 쿼리문 전송을 위해 Statement 인터페이스를 통해 객체를 생성한
				Statement stmt = con.createStatement();
				
				// 쿼리문을 오라클 데이터베이스로 전송한다. 실행한 결과는 ResultSet 객체를 통해 반환받는다.
				ResultSet rs = stmt.executeQuery(sql);
				
				//반환된 결과를 갯수만큼 반복하여 출력한다. 
				//next() 출력할 레코드가 남았는지 확인하고 더이상 레코드가 남아있지 않다면 false 를 반환하여 while 문을 탈출한다. 
				while(rs.next()) {
					
					
					// getXX() 를 통해 각 컬럼에 접근합니다. 오라클의 자료형은 문자, 숫자, 날짜 3가지 형태이므로 메서드도 이와 동일한 
					// 형태를 가지고 있어야한다. 
					// 인덱스 2 를 써도된다????
					String emp_id = rs.getString(1);
					String f_name = rs.getString("first_name");
					String l_name = rs.getString("last_name");
					java.sql.Date h_date = rs.getDate("hire_date");
					int sal = rs.getInt("salary");
					System.out.printf("%s %s %s %s %s\n",emp_id, f_name, l_name, h_date, sal);
				}
				// 자원반납(해제) : 모든 작업을 마친후에는 메모리 절약을 위해 연결했는 자원을 반납(종료)합니다. 
				rs.close();
				stmt.close();
				con.close();
			}
			else {
				System.out.println("Oracle 연결실패");
			}

		} catch (Exception e) {
			System.out.println("Oracle 연결시 예외발생");
			e.printStackTrace();
		}

	}

}
