package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class SampleFileWriter {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		FileWriter out1 = new FileWriter("out1.txt");
		try(out1) {
			out1.write("Hello, Java! - 1\n");
		}
		FileWriter out2 = new FileWriter("out1.txt",true);
		try(out2) {
			out2.write("Hello, Java! - 2\n");
		}
		
		FileWriter out3 = new FileWriter("out1.txt",true);
		BufferedWriter writer = new BufferedWriter(out3);
		try(writer) {
			writer.newLine();
			writer.write("buffering output");
			writer.flush();
		}
		//gold.png
		FileInputStream fis = new FileInputStream("gold.png");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("gold2.png");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		try (bis; bos) {
			byte[] data = null;
			while((data = bis.readNBytes(1024)).length !=0 ) {
				bos.write(data);
			}
			
		}
		bos.flush();

		
		
	}

}
