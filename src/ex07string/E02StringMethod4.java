//  String method  응용편 

/*
시나리오] 주민등록번호를 이용하여 성별을 판단하는
프로그램을 charAt()을 이용해서 작성하시오.
190419-3000000 => 남자
190419-4000000 => 여자
*/
/*
시나리오] 해당 문자열이 이메일 형식인지 검사하는
프로그램을 contains()를 이용해서 작성하시오.
hong@daum.net => 이메일형식임
not@naver => 이메일형식이아님
*/
/*
시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
이용해서 작성하시오.
*/	
/*
시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
작성하시오. 
파일명 : 2023.03.30.르세라핌.안티프레져.mp3
*/


package ex07string;

public class E02StringMethod4
{

	public static void main(String[] args)
	{
	 System.out.println("#### 시나리오1 ####");
	 String juminNum = "010419-2000000";
//	 주민번호의 인덱스[7]에 해당하는 문자가 성별을 표현하므로 이를통해서 판단할수 있습니다.
//	 이때 문자를 비교해야 하므로 '(싱글쿼테이션)'을 사용해야한다.
	 
	 if(juminNum.charAt(7)=='1' || juminNum.charAt(7)=='3'){
		 System.out.println("남성입니다.");
	 }else if(juminNum.charAt(7)=='2' || juminNum.charAt(7)=='4'){
		 System.out.println("여성입니다.");
	 }else if(juminNum.charAt(7)=='5' || juminNum.charAt(7)=='6') {
		 System.out.println("외국인입니다.");
	 }else {
		 System.out.println("주민번호가 잘못되었습니다.");
	 }
	 
	 
	 System.out.println("#### 시나리오2 ####");
	 
	 String email1 = "hong@daum.net";
	 String email2 = "hong@naver";
	 
//	 이메일에 @와 .이 동시에 포함된 경우에만 이메일 형식이라고 볼 수 있습니다.
	 
	 if(email1.contains("@") && email1.contains(".")) {
		 System.out.println("이메일형식임");
		 
	 }else {
		 System.out.println("이메일형식이아님");
	 }
	 
	 if(email2.contains("@") && email2.contains(".")) {
		 System.out.println("이메일형식임");
		 
	 }else {
		 System.out.println("이메일형식이아님");
	 }
	 
	 System.out.println("#### 시나리오3 ####");
//	 주민번호에서 하이픈 -의 위치를 찾아 1을 더한다. 그다음이 성별이기때문 
	 
	 String juminNum1 = "930925-1484845";
	 String juminNum2 = "930925-2484845";
	 
	 int index = juminNum.indexOf("-")+1; //  == 7  indexof 
	 
	 if(juminNum1.charAt(index)=='1' || juminNum1.charAt(index)=='3'){
		 System.out.println("남성입니다.");
	 }else if(juminNum1.charAt(index)=='2' || juminNum1.charAt(index)=='4'){
		 System.out.println("여성입니다.");
	 }else if(juminNum1.charAt(index)=='5' || juminNum1.charAt(index)=='6') {
		 System.out.println("외국인입니다.");
	 }else {
		 System.out.println("주민번호가 잘못되었습니다.");
	 }
	 
	 System.out.println("#### 시나리오4 ####");
//	 파일확장명으로 찾는  프로그램.
//	 파일명은 중간에 .이 몇개든 들어갈 수가 있기 때문에 확장명같은 경우 뒤에서부터 찾는다.
	 
	 String fileName = "2023.03.30.르세라핌.안티프레져.mp3";
	 
	 int beginIndex = fileName.lastIndexOf(".") + 1; 
	 System.out.println("파일의 확장자는:"+ fileName.substring(beginIndex));
	 
	 
	 
	 

	 
	 
		
	}

}
