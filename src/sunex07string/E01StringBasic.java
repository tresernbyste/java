//   equals 는 각각의 문자열을, 값을 비교 확인
//  str == str 이란 참조형타입이기때문에 주소를 비교 



package sunex07string;

public class E01StringBasic
{
public static void main(String[] args)
{
	
	int num1=10, num2=20;
	String numResult = (num1==num2)?"데이터가같다":"데이터가다르다ㅇㅇ";
	System.out.println("비교결과:"+ numResult);
	
	String str1 = new String("Hello JAVA");  // new 를 사용시 항상 다른방, 다른주소임.
//	String str2 = new String("Hello JAVA");	//	위의 Hello JAVA와 같은 주소가 아니다 . 
	String str2 = "Hello JAVA";	//	new생성이후 new없이 사용해도 주소가 다르다.위에 new 선언후에  "";라는건 new생략
	
											//	단 문자열 자체는 같음.
											// 참조 주소값을 저장한다는 소리임.
	if(str1==str2) {	//	주소값을 비교하는것과 같아 String 이기에 	
		System.out.println("str1과 str2는 참조주소 같음");
	}
	else {
		System.out.println("str1과 str2는 참조주소 다름 둘다 new라서");
	}
	
	if(str1.equals(str2)) {			// 문자열을 비교 equals
		System.out.println("두 문자열은 동일하다ㅇㅇ");
	}else {
		System.out.println("두 문자열은 다르다");
		
	}
	String str3 = "자바개발자";		// new 가 없기때문에 같은 주소 사용 같은 단어
	String str4 = "자바개발자";
	
	System.out.println("equals()메소드로 문자열비교:"+str3.equals(str4));
	
	if(str3==str4) {
		System.out.println("주소가 같다");
	}
	else {
		System.out.println("주소가 다르다");
		
	}
	System.out.println("The end..!!");
	
}
}
