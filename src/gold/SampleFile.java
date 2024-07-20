package gold;

import java.io.File;
import java.io.IOException;

public class SampleFile {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		File file = new File("c:\\work\\SampleFile.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		System.out.println("getAbsolutePath : "+file.getAbsolutePath());
		System.out.println("getFreeSpace : "+file.getFreeSpace());
		System.out.println("getCanonicalPath : "+file.getCanonicalPath());
		System.out.println("getName : "+file.getName());
		System.out.println("getParent : "+file.getParent());
		System.out.println("getPath : "+file.getPath());
		
		File currentDir = new File("c:\\work");
		showTree(currentDir,"");
		
	}

	private static void showTree(File dir, String indent) {
		File[] files = dir.listFiles() ;
		for(File f : files) {
		   System.out.println(indent + f.getName());
		   if (f.isDirectory()) {
			   showTree(f,indent + " ");
		   }
		   
		   
		}
		
	}

	
}
