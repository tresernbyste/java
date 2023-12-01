package ex21jdbc.prepared;

import java.util.Date;
import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;
//DB연결을 위한 클래스를 상속한다. 
public class InsertSQL extends IConnectImpl{

	// 생성자 : 부모클래스의 생성자를 호출하여 연결한다. 
	public InsertSQL() {
		super(ORACLE_DRIVER, "education", "1234");
	}
	// 쿼리 실행을 위한 멤버메서드 
	@Override
	public void execute() {
		try {
			// 1. 쿼리문 준비 : 값의 세팅이 필요한 부분을 ?(인파라미터)로 기술한다.
			String query = "INSERT INTO member VALUES (?, ?, ?, ?)";
			
			// 2.prepare객체 생성 : 객체 생성시 준비한 쿼리문을 인수로 전달합니다.
			
			psmt = con.prepareStatement(query);
			
			// 3. 사용자로부터 insert 할 내용을 입력받습니다.
			Scanner scan = new Scanner(System.in);
			System.out.println("아이디: ");
			String id = scan.nextLine();
			System.out.println("패스워드: ");
			String pw = scan.nextLine();
			System.out.println("이름: ");
			String name = scan.nextLine();
			
			
			// 4. 인파라미터 설정 : ? 의 순서대로 설정하고, 인덱스는 1부터 시작한다.(오라클이기때문에)
			// 자료형이 숫자면 setInt
			//		  문자면 setString
			//		  날짜면 setDate
			// 입력값이 문자 혹은 날짜면 자동으로 싱글쿼테이션이 추가된다. 
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			//날짜입력 1 날짜를 문자열로 입력하는 경우
			psmt.setString(4, "2018-11-20");
			//날짜 입ㄹ력 2: Date 형으로 입력하는경우
//			현재날짜를 JAVA에서 입력하는 경우 아래와 같이 변환과정을 거쳐야한다.
//			UTIL 패키지로 시간을 얻어온 후 SQL 패키지로 타입을 변환한다.
//			이때는 date 형으로 입력되므로 setDate()로 인파라미터를 설정해야한다. 
			
			Date utilDate = new Date();
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());  // 51번이 있기때문에 풀데이터네임을 써줘야한다. 
			psmt.setDate(4,sqlDate);
			
			// 5. 쿼리실행 및 결과값 반환  
			int affected = psmt.executeUpdate();
			System.out.println(affected + "행이 입력되었습니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
		
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new InsertSQL().execute();
		
	}

}
