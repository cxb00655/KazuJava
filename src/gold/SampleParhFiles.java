package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class SampleParhFiles {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("##### 開始 #####");
		
		Path path = Paths.get("out1.txt");
		System.out.println(path);
		System.out.println(path.getFileName());
		
		Path  d = Paths.get(".", "work");
		if (!Files.exists(d)) {
			Files.createDirectories(d);
			System.out.println(d + " 作成しました。");
		}

		Path  d2 = Paths.get("work", "towork");
		if (!Files.exists(d2)) {
			Files.createDirectories(d2);
			System.out.println(d + " 作成しました。");
		}

		
		System.out.println("> ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		Path  p = Paths.get("work", name);
		if (!Files.exists(p)) {
			Files.createFile(p);
			System.out.println(p + " 作成しました。");
		}
		
		System.out.println(Files.getLastModifiedTime(p));
		//System.out.println(Files.getPosixFilePermissions(p));
		
		System.out.println("delete y/n? >");
		if ("y".equals(scan.nextLine())) {
			Files.delete(p);
			System.out.println(p + " 削除しました。");
		}
		
		Path f1 = d.resolve(Paths.get("SampleParhFiles1.txt"));
		System.out.println("resolve " + f1);
		Path f2 = d.resolve(Paths.get("SampleParhFiles2.txt"));
		System.out.println("resolve " + f2);
		Path f3 = d.resolve(Paths.get("SampleParhFiles3.txt"));
		System.out.println("resolve " + f3);
	
		Path sample = Paths.get("work","SampleParhFilesCopy.txt");
		if (!Files.exists(sample)) {
			Files.createFile(sample);
			System.out.println(sample + " 作成しました。");
		}
		
		Path outFile = Paths.get("work","SampleParhFilesCopy_Back.txt");
		Files.deleteIfExists(outFile);
		Files.copy(sample,outFile);
		System.out.println(sample + "を" + outFile + " にコピーしました。");
		
		Path todir = Paths.get("work","towork");
		Path dest = todir.resolve(Paths.get("SampleParhFilesCopy.txt"));
		Files.deleteIfExists(dest);
		Files.move(sample, dest);
		System.out.println(sample + "を" + dest + " に移動しました。");
		
		
		Path out3 = Paths.get("work","SampleParhFilesCopy_BufferedReader.txt");
		BufferedWriter outbr = Files.newBufferedWriter(out3,StandardOpenOption.APPEND);
		try(outbr) {
			outbr.write("hello1!\n");
			outbr.write("hello2!\n");
			outbr.write("hello3!\n");
			outbr.write("hello4!\n");
			outbr.newLine();
		}
		
		
		BufferedReader br = Files.newBufferedReader(out3);
		try(br) {
			br.lines().forEach(System.out::println);
		}
		
		System.out.println("##### 終了 #####");
	}

}
