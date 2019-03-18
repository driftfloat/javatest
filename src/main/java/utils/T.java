package utils;

import java.net.URLDecoder;

public class T {

	public static void main(String[] args) throws Exception {
		String name = URLDecoder.decode("%E4%B9%98%E5%AE%A2","UTF-8");
		System.out.println(name);
	}

}
