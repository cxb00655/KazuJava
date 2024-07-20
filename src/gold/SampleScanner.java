package gold;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SampleScanner {

	private String code;
	private String prefecture;
	private String district;
	private String town;
	
	public SampleScanner(String code,
						String prefecture,
						String district,
						String town) {
		this.code = code;
		this.prefecture = prefecture;
		this.district = district;
		this.town = town;
		
		
		
		
	}
	
	@Override
	public String toString() {
		return "SampleScanner [code=" + code + ", prefecture=" + prefecture + ", district=" + district + ", town="
				+ town + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



	public static void main(String[] args) throws Exception {
		List<SampleScanner> list = createList("c:\\work\\SampleScanner.csv");
		list.forEach(System.out::println);

	}

	private static List<SampleScanner> createList(String file) throws FileNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		List<SampleScanner> list = new ArrayList<SampleScanner>();
		FileInputStream fis = new FileInputStream(file);
		Scanner scanner = new Scanner(fis);
		scanner.useDelimiter(",|\n");
		
		try(scanner) {
			while(scanner.hasNext()) {
				scanner.next();
				scanner.next();
				String code = scanner.next().replaceAll("\"", "");
				scanner.next();
				scanner.next();
				scanner.next();
				String pref = scanner.next().replaceAll("\"", "");
				String dist = scanner.next().replaceAll("\"", "");
				String town = scanner.next().replaceAll("\"", "");
				list.add(new SampleScanner(code, pref,dist,town));
			}
		}
		
		return list;
	}

}
