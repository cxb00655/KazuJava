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
		

	}

}
