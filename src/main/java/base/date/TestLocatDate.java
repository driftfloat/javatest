package base.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocatDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime today = LocalDateTime.now();
		System.out.println(date);
		System.out.println(time);
		System.out.println(today);
		String now = LocalDateTime.now().toString().replace(":", "");
		System.out.println(now);
		now = LocalDateTime.now().toString().replace(":", "").substring(0, 17);
		System.out.println(now);
		System.out.println(LocalDateTime.now().toString().replace("T", " ").substring(0, 19));
		System.out.println(LocalDate.now().getYear());
		System.out.println(LocalDate.now().getMonthValue());
	}

}
