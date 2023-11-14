package ex09package.study.util;

public class CommonUtil
{
	public static boolean isNumber(String strValue) {
		
		
		// 전달된 문자열이 빈 문자열이라면 검사할필요가없다.  length가 0이라면 빈문자열이라는것 
		if(strValue.length()==0)
			return false;
		
		for(int i=0; i<strValue.length(); i++) {
			int acode = strValue.codePointAt(i);
			if( !(acode>='0' && acode<= '9')) {
				return false;
			}
		}
		
		return true;
		
	}
}
