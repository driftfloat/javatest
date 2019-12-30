package javatest.mp3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/*  Author: 陈荣凯
 *	Date: 2018年3月30日
**/
//J:\baidu\df6\411517\mp3\播放列表\*.m3u
//T:/mp3/*.m3u

@Component
public class ChangeMp3M3UDir {
//	@Value("${oldmp3dir}")
	static  String oldmp3dir;
//	
//	@Value("${newmp3dir}")
	static String newmp3dir;
	
	public static void main(String[] args)  throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring-config.xml");
		PropertiesUtils propertiesUtils = context.getBean("propertiesUtils",PropertiesUtils.class);
		
		oldmp3dir = "${oldmp3dir}";
		oldmp3dir = propertiesUtils.getPropertiesValue(oldmp3dir);
		System.out.println(oldmp3dir);  // J:baidudf6411517mp3newmp3dir=T:mp3
//		System.out.println(oldmp3dir);
		
		newmp3dir = "${newmp3dir}";
		newmp3dir = propertiesUtils.getPropertiesValue(newmp3dir);
		System.out.println(newmp3dir);
		
		changePathInPlaylist();
	}

	public static void changePathInPlaylist()  throws Exception{
		String filepath = newmp3dir + "播放列表/" ;
		File m3uDir = new File(filepath);
//		f.listFiles(new FilenameFilter());
		String[]  files= listM3u(m3uDir);
		for(String  f : files) {
			changePathFile(f);
		}
	}
	static void changePathFile(String filename) throws Exception{
		String newFilename = newmp3dir + filename ;
		newFilename = "t:/" + filename ;
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newFilename),"gbk"));
		String filepath = newmp3dir + "播放列表/" ; 
		BufferedReader r = new BufferedReader(new FileReader(filepath+filename)) ;
		r = new BufferedReader(new InputStreamReader(new FileInputStream(filepath+filename),"gbk"));

		String line ;
		while( ( line = r.readLine())!=null) {
//			line = line.replace(oldmp3dir, newmp3dir) ;
//			line = line.replace("j:\\baidu\\", "t:\\a\\");
//			line = new String(line.getBytes("gbk"),"iso8859-1");
			
			String a ="J:\\baidu\\df6\\411517\\";
			String b = "t:\\a\\";
			
			a = oldmp3dir;
			b = newmp3dir;
			line = line.replace(a, b);
			System.out.println(line);
			
			w.write(line);
			w.newLine();
		}
		r.close();
		w.close();
	}
	
	static void listTxt(File file) {  
        File[] files = file.listFiles(new FileFilter() {  
            @Override  
            public boolean accept(File pathname) {  
                String name = pathname.getName();  
                if (name.endsWith("txt")) {  
                    return true;  
                }  
                return false;  
            }  
        });  
        for (File f : files) {  
            System.out.println(f.getName());  
        }  
    }  
	
	static String[]  listM3u(File file) {  
        File[] files = file.listFiles(new FileFilter() {  
            @Override  
            public boolean accept(File pathname) {  
                String name = pathname.getName();  
                if (name.endsWith("m3u")) {  
                    return true;  
                }  
                return false;  
            }  
        });  
        String[] names = new String[files.length];
        int row = 0;
        for (File f : files) {  
        	names[row] = f.getName();
            System.out.println(f.getName());  
            row++;
        }
        
        return names;
    }  
}
