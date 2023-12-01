package ex21jdbc.prepared;

import java.sql.SQLException;

import ex21jdbc.connect.IConnectImpl;

public class SelectSQL extends IConnectImpl{
	
	public SelectSQL() {
		super("education","1234");
		}
	
	@Override
	public void execute() {
		try {
			while(true) {
				
				// prepared 객체를 통해 인파라미터를 설정하면 문자인 경우 자동으로 싱글쿼테이션을 추가하게 되므로 
				// || 연산자를 추가해서 쿼리문을 작성해야합니다. 
				String sql ="SELECT * FROM member"
						//+ " WHERE name LIKE '%?%'";  부적합한 열인덱스 에러 단순문자열로 판단 와일드카드가아닌
						
						+ " WHERE name LIKE '%'||?||'%'";
						
				psmt = con.prepareStatement(sql);
				psmt.setString(1, scanValue("찾는 이름"));
				rs = psmt.executeQuery();
				while(rs.next()) {
					String id = rs.getString(1);
					String pass = rs.getString(2);
					String name = rs.getString(3);
					
					//날짜를 문자형으로 추출하면 시간까지 출력되므로 날짜부분까지만 잘라서 출력한다.
					String regidate = rs.getString(4).substring(0,10);
					System.out.printf("%s %s %s %s\n",id, pass, name, regidate);
				}
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		
	}
	public static void main(String[] args) {
		new SelectSQL().execute();
	}

}
