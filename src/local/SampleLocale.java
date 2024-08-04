package local;

import java.util.Locale;

public class SampleLocale {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Locale locale = Locale.getDefault();
		System.out.println("getCountry is  " + locale.getCountry());
		System.out.println("getLanguage is  " + locale.getLanguage());
		
		
		Locale loca_fr_CA = new Locale("fr", "CA");
		System.out.println("getCountry is  " + loca_fr_CA.getCountry());
		System.out.println("getLanguage is  " + loca_fr_CA.getLanguage());

		
		Locale l1  = Locale.CANADA;
		Locale l2  = Locale.CANADA_FRENCH;
		Locale l3  = Locale.CHINA;
		Locale l4  = Locale.CHINESE;
		Locale l5  = Locale.ENGLISH;
		Locale l6  = Locale.FRANCE;
		Locale l7  = Locale.FRENCH;
		Locale l8  = Locale.GERMAN;
		Locale l9  = Locale.GERMANY;
		Locale la  = Locale.ITALIAN;
		Locale lb  = Locale.ITALY;
		Locale lc  = Locale.JAPAN;
		Locale ld  = Locale.JAPANESE;
		Locale le  = Locale.KOREA;
		Locale lf  = Locale.KOREAN;
		Locale lg  = Locale.PRC;
		Locale lh  = Locale.ROOT;
		Locale li  = Locale.SIMPLIFIED_CHINESE;
		Locale lj  = Locale.TAIWAN;
		Locale lk  = Locale.TRADITIONAL_CHINESE;
		Locale ll  = Locale.UK;
		Locale lm  = Locale.US;
		
		
		
		Locale localJp = new Locale.Builder()
				.setLanguage("ja")
				.setRegion("JP")
				.setScript("Jpan")
				.build();
		
		Locale tag = Locale.forLanguageTag("en-US-x-lvariant-POSIX");
		System.out.println(tag);
		
		
	}

}
