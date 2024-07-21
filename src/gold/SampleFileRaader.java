package gold;

import java.io.BufferedReader;
import java.io.FileReader;

public class SampleFileRaader {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		FileReader reader = null;
		try {
			reader = new FileReader("test01.sh");
			int i = 0;
			while((i = reader.read()) != -1) {
				char c = (char)i;
				System.out.print(c);
			}
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		System.out.println("FileReader");
		
		FileReader reader2 = new FileReader("test01.sh");
		try(reader2) {
			int i = 0;
			while((i = reader2.read()) != -1) {
				char c = (char)i;
				System.out.print(c);
			}
		}
		
		System.out.println("BufferedReader");
		FileReader fr = new FileReader("test01.sh");
		BufferedReader br = new BufferedReader(fr);
		try (br) {
			String line = null;
			while((line = br.readLine()) !=null) {
				System.out.println(line);
			}
		}
		

		System.out.println("BufferedReader.lines");
		FileReader fr2 = new FileReader("test01.sh");
		BufferedReader br2 = new BufferedReader(fr2);
		try (br2) {
			br2.lines().forEach(System.out::println);
		}

		
		
	}

}
