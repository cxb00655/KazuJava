package gold;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleConsoleSystemIn {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("System.in");
		try (BufferedReader br  
				= new BufferedReader( 
						new InputStreamReader(System.in))) {
			System.out.println(br.readLine());
			
		}
 		
		
		System.out.println("Console");
		Console console = System.console();
		String str = console.readLine();
		System.out.println(str);
		char[] pwd = console.readPassword();
		System.out.println(pwd);
		
		
	}

}
