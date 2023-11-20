package ex16exception;

public class Ex02PreDefineException6 {
	public static void main(String[] args) {

		Object object = new Object();	// 다른클래스와는 상속관계가 없는상태이므로 이상태에서는 형변환을 할수없다.
		try {
			String strObject = (String) object;  // 순수한 오브젝트 객체이므로 자식 타입으로 형변환 할수없다.
		} catch (ClassCastException e) {
			System.out.println("형변환 할 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("==ClassCastException발생후=="); // try catch예외 구문 사용시 시스템 종료가 아님.

		System.out.println("끝~~~");						//	try catch 예외 구문안에 예외발생될 실행문이 들어가면 이후 구문 ㄱ 

		
		
		
		String str = "형변환되나요?";
		boolean castFlag = myClassCasting(str);
		if (castFlag == true)
			System.out.println("됩니다요..");
		else
			System.out.println("안되네요..ㅜㅜ;");

	}//// end of main

	public static boolean myClassCasting(Object o) {
		if (o instanceof String) {    // instanceof 
			return true;
		} else {
			return false;
		}
	}

}
