package ex21jdbc.statement;

import java.sql.SQLException;

public class SelectQuery extends ConnectDB{
	
	//매개벼수가 없는 부모의 생성자를 호출하여 DB 연결  
	public SelectQuery() {
		super();
	}
	
	//ResultSet 인터페이스 
	// : select 문 실행시 쿼리의 실행결과를 ResultSet객체를 통해 받는다. 
	// 	  결과로 반환된 레코드의 처음부터 끝까지 next()를 통해 확인후 반복 인출한다
	// 	컬럼의 자료형이 number타입 : getInt
	//	      char,varchar타입 : getString
	//                date타입 : getDate  메서드를 통해 출력한다.
	//해당 메서드의 인수는 인덱스 (1부터시작) 혹은 컬럼명을 사용할 수 있다.
	// 오라클 자료형에 상관없이 getString()으로 모두 출력할 수 있습니다. 
	
	
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			String query = "SELECT id, pass, name, regidate,"
					+ " to_char(regidate, 'yyyy.mm.dd hh24:mi') d1 "
					+ " FROM member";
			//쿼리 실행시 사용하는 메서드  
//			  executeUpdate()
//				: 쿼리문이 insert, update, delete 와 같이 기존 레코드에 변화가 생기는 경우에 사용합니다.
//				 실행 후 적용된 행의 갯수를 INT 형으로 반환한다. 
//			  executeQuery()
//			  	: select 쿼리를 실행할 때 호출하는 메서드로 레코드에 영향을 미치지않고 조회만 하는 경우 사용합니다.
//			  	 조회한 레코드를 반환값으로 받아야 하므로 ResultSet 객체가 반환타입으로 정의되어 있다.
			  
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String id = rs.getString(1);		//id 컬럼
				String pw = rs.getString("pass");	//pass 컬럼
				String name = rs.getString("name");
				
//			오라클의 data 타입을 getDate()로 추출하면 0000-00-00 형태로 출력된다. 
//			또한 자료형이 date 이므로 java.sql 패키지에 class 를 사용해야 한다. 
				java.sql.Date regidate = rs.getDate("regidate");
				
				
//				날짜를 getString()으로 추출하면 시간까지 포함되서 출련된다.
//				0000-00-00 00:00:00 형식으로 적당한 크기로 자르고 싶다면 substring
				String regidate2 = rs.getString("regidate");
				String regidate3 = rs.getString("regidate").substring(0,13);
				
//				쿼리문에 별칭을 사용한 경우 별칭을 통해 출력할 수 있다. 
//				즉, 컬렴명 인덱스 별칭을 통해 컬럼의 저장된 값을 추출한다. 
				String regidate4 = rs.getString("d1");
				
				System.out.printf("%s %s %s %s %s %s %s\n",id, pw, name, regidate, regidate2, regidate3,regidate4);
			}
		} catch (SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close(); // DB자원반납
		}
	}
	
	public static void main(String[] args) {
		SelectQuery selectSQL = new SelectQuery();
		selectSQL.execute();
	}

}
