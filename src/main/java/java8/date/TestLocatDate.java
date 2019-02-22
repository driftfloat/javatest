package java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocatDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime today = LocalDateTime.now();
		System.out.println(date);		//	2018-10-24
		System.out.println(time);		//	12:06:54.816
		System.out.println(today);		//	2018-10-24T12:06:54.816
		String now = LocalDateTime.now().toString().replace(":", "");
		System.out.println(now);		//	2018-10-24T120654.817
		now = LocalDateTime.now().toString().replace(":", "").substring(0, 17);
		System.out.println(now);		//	2018-10-24T120654
		System.out.println(LocalDateTime.now().toString().replace("T", " ").substring(0, 19));	// 2018-10-24 12:06:54
		System.out.println(LocalDate.now().getYear());			//	2018
		System.out.println(LocalDate.now().getMonthValue());	//	10
		System.out.println(LocalDate.now().getMonth());			//	OCTOBER
	}

}
