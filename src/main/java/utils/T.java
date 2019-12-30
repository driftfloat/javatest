package utils;

import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import org.springframework.format.datetime.joda.LocalDateTimeParser;

public class T {

	public static void main(String[] args) throws Exception {
		System.out.println(Double.valueOf("0.0")==0);
		Number a = 3 ;
		Number b = 4 ;
//		a = a + b ;
//		t2();
	}
	public static void t1()throws Exception {
		String name = URLDecoder.decode("%E4%B9%98%E5%AE%A2","UTF-8");
		System.out.println(name);
	}
	
	public static void t2()throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar instance = Calendar.getInstance();
		instance.setTime(new Date());
		Date time = instance.getTime();
		String date = sdf.format(time);
		System.out.println(date);
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now().truncatedTo(ChronoUnit.SECONDS));
		System.out.println(LocalDate.now()+" "+LocalTime.now().truncatedTo(ChronoUnit.SECONDS));
////		System.out.println(LocalDate.now()+" "+LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
////		System.out.println(LocalDate.now()+" "+LocalTime.now().format(DateTimeFormatter.ISO_TIME));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
////		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_INSTANT));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
////		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_ORDINAL_DATE));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_WEEK_DATE));
////		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
////		System.out.println(LocalDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
		
		
	}

}
