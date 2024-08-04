package local;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class SampleProperties {

	public static void main(String[] args) throws Exception, IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		Properties prop = new Properties();
		prop.load(new FileReader("sample.properties"));
		
		
		Set keys = prop.keySet();
		for(Object key : keys ) {
			System.out.println(prop.get(key));
		}
		prop.forEach((k,v) -> System.out.println(k + "=" + v));
		
		
        prop.list(System.out);
        
        System.out.println("Key1 is "+prop.getProperty("Key1"));
        
		Properties prop2 = new Properties();
		prop2.load(new FileReader("sample2.properties",Charset.forName("UTF-8")));       
		System.out.println("Key1 is "+prop2.getProperty("Key1"));
		
		ResourceBundle resource =ResourceBundle.getBundle("sample3");
		System.out.println(resource.getString("Key3"));
		
		
        
	}

}
