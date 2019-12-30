package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import static java.nio.file.Files.readAllBytes;  
import java.nio.file.Files;
import java.nio.file.Paths;

public class Txt2Html {

	public static void main(String[] args) throws Exception{
		String path = "T:/nec4note";
//		txt2html(path);
		StringBuffer s ;
	}
	public static void txt2html(String path) throws Exception{
//		File file = new File(path);
////		file.listFiles(file.)
//		File[] files=file.listFiles((f)->!f.isDirectory()&&f.getName().endsWith(".txt"));
//		System.out.println(files.length);
//		
////		String content = "Hello World !!";  
////		Files.write(Paths.get("c:/output.txt"), content.getBytes());  
//		
////		Files.lines(Paths.get("D:\\jd.txt"), StandardCharsets.UTF_8).forEach(System.out::println); 
////		readAllBytes(Paths.get("d:/jd.txt"));
////		new String(readAllBytes(Paths.get("d:/jd.txt")));
//		for(File f:files) {
//			String fp = f.getAbsolutePath();
//			String str = new String(readAllBytes(Paths.get(fp)));
//			StringBuilder sb = new StringBuilder();
//			sb.append("<pre>").append(str).append("</pre>");
//			fp=fp.replace(".txt", ".html");
//			BufferedWriter w = new BufferedWriter(new FileWriter(fp));
//			w.write(sb.toString());
//			w.close();
//			f.delete();
//		}
////		new String(readAllBytes(Paths.get("d:/jd.txt")));
	}

}
