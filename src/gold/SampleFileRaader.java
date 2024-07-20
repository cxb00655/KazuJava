package gold;

import java.io.FileReader;

public class SampleFileRaader {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		FileReader reader = null;
		try {
			reader = new FileReader("c:\\work\\test01.sh");
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

		
		FileReader reader2 = new FileReader("c:\\work\\test01.sh");
		try(reader2) {
			int i = 0;
			while((i = reader2.read()) != -1) {
				char c = (char)i;
				System.out.print(c);
			}
		}
		

		
		
	}

}
