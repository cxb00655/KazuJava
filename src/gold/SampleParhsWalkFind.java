package gold;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class SampleParhsWalkFind {

	public static void main(String[] args) throws Exception {
		System.out.println("##### 開始 #####");
		Path base = Paths.get(".");
		
		System.out.println("------- list ---------------");
		Files.list(base).forEach(System.out::println);
		
		System.out.println("------- walk ---------------");

		Files.walk(base.resolve("src")).forEach(System.out::println);
		
		System.out.println("------- find ---------------");

		BiPredicate<Path, BasicFileAttributes> bp = (p, attr) -> {
			return p.toFile().getName().endsWith("r.java");
		};
		Files.find(base,3,bp).forEach(System.out::println);
		
		System.out.println("------- newDirectoryStream ---------------");
		
		DirectoryStream<Path> dirs
			= Files.newDirectoryStream(base);
		try(dirs) {
			for(Path p : dirs) {
				System.out.println(p.getFileName());
			}	
		}
		
		System.out.println("##### 終了 #####");
	}

}
