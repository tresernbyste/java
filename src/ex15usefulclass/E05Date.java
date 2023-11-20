// 달력 사용   혹은 적용법0

package ex15usefulclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E05Date {

	public static String myDateFormat(Calendar c , String formatStr) {
		Date date = c.getTime();
		return new SimpleDateFormat(formatStr).format(date);
		
		}
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
				String nowStr1 = myDateFormat(calendar, "yyyy-MM-dd HH:mm:ss");
		System.out.println("현재1: "+ nowStr1);
		String nowStr2 =  myDateFormat(calendar, "오늘은 M월의 W번째주, d번째날 , F번째 E요일");
		System.out.println("현재2:"+ nowStr2);
		
		calendar.add(Calendar.DATE	,3);
		calendar.add(Calendar.MONTH	,2);
		calendar.add(Calendar.YEAR	,3);
		String nowStr3 = myDateFormat(calendar, "yyyy년 MM월 dd일");
		System.out.println("1년2개월3일후:" + nowStr3);
		
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String future = "2023/12/25";
		long result = myDiffDate(today, future);
		System.out.println(today+"에서"+future+"까지 남은날짜"+ result);
	
	}
	
	public static long myDiffDate(String today, String future) {
		long diffDays = 0;
		try {
			Date formatToday = new SimpleDateFormat("yyyy-MM-dd").parse(today);
			Date formatFuture = new SimpleDateFormat("yyyy/MM/dd").parse(future);
			System.out.println(formatFuture.getTime());
			System.out.println(formatToday+ "<> "+formatFuture);
			
			diffDays = (formatFuture.getTime() - formatToday.getTime()) / (24*60*60*1000);
		}
		catch (Exception e) {}
		return diffDays;
	}
	}

