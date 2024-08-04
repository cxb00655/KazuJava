package local;

import java.text.NumberFormat;
import java.util.Locale;

public class SampleNumberFormat {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Locale.setDefault(Locale.JAPAN);
		
		NumberFormat a = NumberFormat.getInstance();  
		NumberFormat b = NumberFormat.getIntegerInstance();
		NumberFormat c = NumberFormat.getCurrencyInstance();
		NumberFormat d = NumberFormat.getPercentInstance();
		NumberFormat e = NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.println(a.format(1000.1));
		System.out.println(b.format(1000.1));
		System.out.println(c.format(1000.1));
		System.out.println(d.format(0.1));
		System.out.println(e.format(1000.1));
		

	}

}
