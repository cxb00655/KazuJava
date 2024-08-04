package local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class SampleDateTime {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		DateTimeFormatter isoFormat = DateTimeFormatter.ISO_DATE;
		System.out.println(isoFormat.format(LocalDate.now()));
		
		DateTimeFormatter isoFormat2 = DateTimeFormatter.BASIC_ISO_DATE;
		System.out.println(isoFormat2.format(LocalDate.now()));

		DateTimeFormatter isoFormat3 = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(isoFormat3.format(LocalDate.now()));

		DateTimeFormatter isoFormat4 = DateTimeFormatter.ISO_ORDINAL_DATE;
		System.out.println(isoFormat4.format(LocalDate.now()));

		DateTimeFormatter isoFormat5 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		System.out.println(isoFormat5.format(LocalDate.now()));

		//Locale.setDefault(Locale.JAPAN);
		Locale.setDefault(Locale.US);
		DateTimeFormatter isoFormat6 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(isoFormat6.format(LocalDate.now()));

		DateTimeFormatter isoFormat7 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(isoFormat7.format(LocalDate.now()));

		DateTimeFormatter isoFormat8 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(isoFormat8.format(LocalDate.now()));

		DateTimeFormatter isoFormat9 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(isoFormat9.format(LocalDate.now()));

	}

}
