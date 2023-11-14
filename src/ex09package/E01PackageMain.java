package ex09package;


import java.util.Date;


//   ex09package.study.util.*  이와 같이 import 로 처리해도된다.   util 패키지안 모든 패키지,클래스,메서드를 전부 사용하고 싶다면 util.*
import ex09package.study.util.CommonUtil;    

public class E01PackageMain
{

	
	
	public static void main(String[] args)
	{
		Date utilDate = new Date();											// 하나의 패키지만 불러들인다면  간략하게 사용가능
		System.out.println("utilDate="+ utilDate);
		
		
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());		//  하나의 패키지를 간략하게 부른 후에 같은 date 패키지를 사용한다면 풀네임으로 이용해야한다
		System.out.println("sqlDate="+ sqlDate);
		
		
		String strValue = "987654321";
		boolean isNum = CommonUtil.isNumber(strValue);
		
		
		if(isNum==true)
			System.out.println("문자열은 숫자입니다.");
		else
			System.out.println("숫자가 아닙니다.");
		
		System.out.println(ex09package.study.util.CommonUtil.isNumber("백20"));
	}

}
