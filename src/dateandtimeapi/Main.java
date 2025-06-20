package dateandtimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Date: " + LocalDate.now());
		System.out.println("First Day Of Month: " + LocalDate.now().withDayOfMonth(1));
		System.out.println("First Day of Year: " + LocalDate.now().withDayOfYear(1));
		System.out.println("Date: " + LocalDate.now().with(DayOfWeek.MONDAY).minusDays(1));
		System.out.println("Day of year: " + LocalDate.now().getDayOfYear());
		System.out.println("Month value: " + LocalDate.now().getMonthValue());
		System.out.println("Month name: " + LocalDate.now().getMonth());
		System.out.println("Year: " + LocalDate.now().getYear());
		System.out.println("Days Month: " + LocalDate.now().lengthOfMonth());
		System.out.println("Month: " + LocalDate.now().getMonthValue());
		System.out.println("Hour: " + LocalTime.now().getHour());
		System.out.println("Hour: " + LocalTime.now().getSecond());
		
		System.out.println();
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
		DateTimeFormatter f4 = DateTimeFormatter.ofPattern("yy-MM-dd");
		DateTimeFormatter f5 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//		LocalDate.now().format(f);
		System.out.println("Formatted date: " + LocalDate.now().format(f1));
		System.out.println("Formatted date: " + LocalDate.now().format(f2));
		System.out.println("Formatted date: " + LocalDate.now().format(f3));
		System.out.println("Formatted date: " + LocalDate.now().format(f4));
		System.out.println("Formatted date: " + LocalDate.now().format(f5));
		Period p = Period.between(LocalDate.of(1998, 05, 19), LocalDate.now());
		System.out.println(p);
		System.out.println(p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + " days ");

	}

}
