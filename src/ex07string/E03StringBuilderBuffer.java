package ex07string;

public class E03StringBuilderBuffer
{

	public static void main(String[] args)
	{
		StringBuffer strBuf = new StringBuffer("AB");  // AB
		strBuf.append(25);	// AB25 
		strBuf.append("Y").append(true);  // AB25Ytrue
		System.out.println("strBuf="+ strBuf);
		
		strBuf.insert(2, false);  // index 2이후에 false(string)를 추가한다.  AB'false'25Ytrue 출력가능
		strBuf.insert(strBuf.length(),'Z');
		System.out.println("strBuf="+ strBuf);
		
		System.out.println("String 과 StringBuffer의"+ "참조값비교");
		
		String str1 = "Java%JSP";			// 이 스트링이 들어갈만큼의 공간의 주소
		String str2 = "Java%JSP";			// &스트링 추가가 된다면 더 큰공간이 필요하기때문에 같은 주소를 쓰는게 아니라 다른 주소가 새로 생성됨
		if(str1==str2)
			System.out.println("연결전:주소값동일"); // 주소값은 동일
		else
			System.out.println("연결전:주소값다름");
		
		str1 = str1 + "%Spring";					// 수정하면 주소값이 바뀐다.
		if(str1 == str2)
			System.out.println("연결후:주소값동일");
		else
			System.out.println("연결후:주소값다름");
			
		StringBuffer buf = new StringBuffer();     // StringBuffer 사용시에는 주소값이 변하지 않음.
		System.out.println("buf="+ buf);			//	 문자열의 
		System.out.println("저장된 문자열크기:"+ buf.length());
		System.out.println("기본버퍼크기:" + buf.capacity());
		
		buf.append("Java 공부중...");			// 자동으로 공간의 주소가 추가적으로 생성됨.
		System.out.println("buf="+ buf);		// 주소값은 동일한다.
		System.out.println("저장된 문자열크기:"+ buf.length());
		System.out.println("기본버퍼크기:" + buf.capacity());
		
		buf.append("금일은 StringBuffer 학습중..!!");		// Java 공부중... 에서 사용된 공간보다 자동으로 공간의 주소가 추가 되어 35의 만큼 버퍼의 크기가 자동으로 생성된다.
		System.out.println("buf="+ buf);					// 주소값은 동일하다.
		System.out.println("저장된 문자열크기:"+ buf.length());
		System.out.println("기본버퍼크기:" + buf.capacity());
		
//		문자열의 변경이 많은 경우에는 StringBuffer를 사용해서 자동으로 공간의 주소값이 추가되게 한다. 주소값은 동일하다.
		
		
		}


}
