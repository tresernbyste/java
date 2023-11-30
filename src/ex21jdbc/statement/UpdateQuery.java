package ex21jdbc.statement;

import java.sql.SQLException;
//추상클래스를 상속하여 클래스를 정의한다. 

// 부모클래스의 생성자 중 매개변수가 있는 것을 호출하기 위해 super(인수)와 같은 형태로 기술합니다. 
// 이를 통해 DB에 연결됩니다. 

public class UpdateQuery  extends ConnectDB{
	
	public UpdateQuery(String user, String pass) {
		super(user, pass);
	}
	
	@Override
	public void execute() {
		try {
			// 쿼리 실행을 위한 statement객체생성 및 쿼리문 작성 
			stmt = con.createStatement();
			// 쿼리문 실행 
			String sql = " UPDATE member "
					+"SET "
					+" pass='1111', "
					+" name='이순신',"
					+" regidate=sysdate "
					+" WHERE id = 'test' ";
			
			System.out.println(" sql = " + sql);
			
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected + "행이 업데이트 됨");
		} catch (SQLException e) {
			System.out.println("쿼리오류");
			e.printStackTrace();
		}catch( Exception e) {
			System.out.println("알수없는 예외발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
		
		
	}
	public static void main(String[] args) {
		new UpdateQuery("education","1234").execute();
	}

}

