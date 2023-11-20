package ex15usefulclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class E06LocalDateTime {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("오늘날짜: "+ localDate);
	
		LocalTime localTime = LocalTime.now();
		System.out.println("오늘날짜: "+ localTime);
		
		
		LocalDateTime monent = LocalDateTime.now();
		System.out.println("오늘날짜: "+ monent);
	
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("오늘은 M월의 W번째주, d번째날, F번째 E요일");
		
		System.out.println("서식1 : "+ monent.format(format1));
		System.out.println("서식2 : "+ monent.format(format2));
		System.out.println("서식3 : "+ monent.format(format3));
		
		LocalDate xMas = LocalDate.of(localDate.getYear(), 12, 25);
		System.out.println("크리스마스"+ xMas.format(format1));
		
		Period period = Period.between(localDate, xMas);
		System.out.println(period.getMonths() + "개월" + period.getDays()+ "일 남음");
		
		System.out.println(ChronoUnit.MONTHS.between(localDate, xMas)+ "개월 남음");
		System.out.println(ChronoUnit.DAYS.between(localDate, xMas)+ "일 남음");
		
		System.out.println("5일전: "+ monent.minusDays(5));
		System.out.println("3일후: "+ monent.plusDays(5));
		System.out.println("2개월후: "+ monent.plusMonths(2));
		System.out.println("5일전: "+ monent.plusYears(1));
		System.out.println("1년2개월3일후 :" + monent.plusYears(1).plusMonths(2).plusDays(3));
		
		
		
		
				
	}

}
