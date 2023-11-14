package sunex07string;

public class E02StringMethod2
{

	public static void main(String[] args)
	{
		System.out.println("String 클래스의 주요 메소드2");
		
		String str1 = "Welcom to java";
		String str2 = "자바야 놀자!";
		
//		6. codePointAt()
		
		System.out.println("### 6 ###");
		System.out.println("str1 첫번째 문자의 아스키코드:" + str1.codePointAt(0));
		System.out.println("str2 세번째 문자의 유니코드:" + str2.codePointAt(2));
		
//		7. endsWith()
//		8. startsWith()
		
		System.out.println("### 7 8 ###");
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));

//		9.format()
		
		System.out.println("### 9 ###");
		System.out.printf("국어:%d,영어:%d,수학:%d\n",81, 92, 100);
		String formatStr = String.format("국어:%d,영어:%d,수학:%d\n",81, 92, 100);
		System.out.println(formatStr);
		
//		10. indexOf()
		
		System.out.println("### 10 ###");
		String email1 = "hong@daum.net";
		System.out.println(str1.indexOf("ava")); // 몇번째 인덱스인지. 확인 
		System.out.println(str1.indexOf("J"));	// 없다면 음의 정수 -1표현 
		System.out.println((email1.indexOf("@")!=-1)? "이메일형식맞음" :"이메일형식아님");
		
		
		
	}

}
