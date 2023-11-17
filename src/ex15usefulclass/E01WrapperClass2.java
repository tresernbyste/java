package ex15usefulclass;

public class E01WrapperClass2 {
	public static void main(String[] args) {
		
		String strNumber = "1000";
		System.out.println("10+strNumber="+ (10+strNumber));
		System.out.println("10+strNumbe를 숫자로 변경 : "+ (10+Integer.parseInt(strNumber)));
		System.out.println("10+strNumbe를 숫자로 변경 : "+ (10+Integer.valueOf(strNumber)));
		
		String money = "120원";
//		System.out.println("120원 : "+ Integer.parseInt(money));
		
		String floatString = "3.14";
//		System.out.println(Integer.parseInt(floatString));   
		System.out.println("실수형(float)형으로 변경 : "+ Float.parseFloat(floatString));
		System.out.println("실수형(float)형으로 변경 : "+ Double.parseDouble(floatString));
		
		System.out.println("===codePointAt====");
		System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
		System.out.println(Character.codePointAt("ABCD", 3));
		
		System.out.println("===isDigit===");
		System.out.println(Character.isDigit('A')? "숫자임":"숫자아님");
		System.out.println(Character.isDigit(50)? "숫자임":"숫자아님");
		System.out.println(Character.isDigit('7')? "숫자임":"숫자아님");
		
		System.out.println("==== isLetter ====");
		System.out.println("isLetter()를 통한 문자판단");
		System.out.println(Character.isLetter('가'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('#'));
		System.out.println(Character.isLetter('9'));
		
		System.out.println("===== isWhitespace ====");
		System.out.println("공백문자 판단");
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace(' '));
		
		System.out.println("=== isLower and Upper Case");
		System.out.println("알파벳 대소문자 판단");
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('z'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isUpperCase('Z'));
		System.out.println(Character.isLowerCase('가'));
		
		
		String whiteString ="h e l l o";
		int whileCount = 0;
		char[] chArr =whiteString.toCharArray()	;
		for(int i =0; i<chArr.length; i++) {
			if(Character.isWhitespace(chArr[i])) {
				whileCount++;
			}
		}
		System.out.println(whileCount);
		
		
		
		
	}
}
