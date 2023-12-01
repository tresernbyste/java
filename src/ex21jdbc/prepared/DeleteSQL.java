package ex21jdbc.prepared;

import ex21jdbc.connect.IConnectImpl;

public class DeleteSQL extends IConnectImpl{
	
	//오라클 연결 접속
	public DeleteSQL() {
		super ("education","1234");
	}
	
	@Override
	public void execute() {
		try {
			
//			delete를 위한 쿼리문 생성. PK로 지정된 아이디컬럼에 인파라미터를 설정한다. 
			String query = "DELETE FROM member WHERE id=?";
			// 2. 동적쿼리문을 인수로 prepared 객체를 생성한다. 
			psmt = con.prepareStatement(query);
			psmt.setString( 1, scanValue("삭제할아이디"));
			
			// 3. 입력값을 받은 후 인파라미터를 세팅합니다. 
			
			// 4. 쿼리실행 및 결과 출력 
			System.out.println(psmt.executeUpdate()+"행이 삭제되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		finally {
			close();
		}
	}
	public static void main(String[] args) {
		new DeleteSQL().execute();
	}

}
