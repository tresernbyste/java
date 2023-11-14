package ex07string;

public class E02StringMethod1
{

	public static void main(String[] args)
	{
		
		System.out.println("String 클래스의 주요 메소드1");
		
		String str1 = "Welcome to java"; // 공백포함  15, 7 
		String str2 = "자바야 놀자!";

//		1. length
		System.out.println("### 1 ###"); // 문자열안에 숫자가 포함되어있는가 확인할때 사용가능
		System.out.println("str1의 길이:"+ str1.length());
		System.out.println("str2의 길이:"+ str2.length());
		System.out.println();
		
//		2.charAt(인덱스)    str2.charAt(인덱스번호);
		
		System.out.println("### 2 ###");
		System.out.println("str1의 두번째 문자:"+ str1.charAt(1));
		System.out.println("str2의 두번째 문자:"+ str2.charAt(1));
		System.out.println();
		
//		3.compareTo
		
		System.out.println("### 3 ###");  // 아스키코드 B가 크다 
		String str3 = "A";
		String str4 = "B";
		System.out.println(str3.compareTo(str4));  // 앞의 문자열이 크면 양수 1 뒤의 문자열이 크면 음수 -1
		System.out.println(str4.compareTo(str3));  // 두 문자열이 같다면 0  a.compareTo(b)
		System.out.println("ABC".compareTo("ABC")==0 ?"문자열이같다" : "문자열이다르다.");
		System.out.println();
		
//		4. .concat == +
		
		System.out.println("### 4 ###");
		System.out.println("JAVA".concat("WORLD").concat("Go"));  // 이렇게 사용하는 경우가 있기 때문에 알고있으면 좋다.
		System.out.println("JAVA"+ "WORLD"+"Go");
		System.out.println();
		
		
//		5.contains  // 포함되어 있는지 확인.   확인하고싶은 문자열.contaings(" ")  이메일형식인지 특수문자 포함되어있는지 확인할때 많이 사용한다 
		
		System.out.println("### 5 ###");
		System.out.println(str1.contains("To"));
		System.out.println(str1.contains("to"));
		System.out.println(str1.contains("  "));
		System.out.println();
		
	}

}
