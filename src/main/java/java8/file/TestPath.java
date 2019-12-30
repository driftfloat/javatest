package java8.file;

import java.net.URL;

public class TestPath {

	public static void main(String[] args) throws Exception {
//		TestPath.class.getClassLoader().getResourceAsStream("whiteurl.tx");
		
//		BufferedWriter writer = Files.newBufferedWriter(Paths.get("test.txt"), StandardCharsets.UTF_8);
//		BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
//		BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8); 
//		writer.write("test path");
//		writer.close();
		URL u = TestPath.class.getResource("whiteurl.txt");
		System.out.println(u);
		u = TestPath.class.getResource("/whiteurl.txt");
		System.out.println(u);
		URL u2 = TestPath.class.getClassLoader().getResource("whiteurl.txt");
		System.out.println(u2);
		u2 = TestPath.class.getClassLoader().getResource("/whiteurl.txt");
		System.out.println(u2);
	}

}
