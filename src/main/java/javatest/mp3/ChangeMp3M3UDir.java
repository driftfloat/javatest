package javatest.mp3;

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
//	private String oldmp3dir;
//	
//	@Value("${newmp3dir}")
//	private String newmp3dir;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring-config.xml");
		PropertiesUtils propertiesUtils = context.getBean("propertiesUtils",PropertiesUtils.class);
		
		String oldmp3dir = "${oldmp3dir}";
		oldmp3dir = propertiesUtils.getPropertiesValue(oldmp3dir);
		System.out.println(oldmp3dir);  // J:baidudf6411517mp3newmp3dir=T:mp3
//		System.out.println(oldmp3dir);
		
		String newmp3dir = "${newmp3dir}";
		newmp3dir = propertiesUtils.getPropertiesValue(newmp3dir);
		System.out.println(newmp3dir);
		
		
	}

}
