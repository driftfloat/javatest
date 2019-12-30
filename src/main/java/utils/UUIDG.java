package utils;

import java.util.UUID;

public class UUIDG {

	public static void main(String[] args) {
//		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
//		System.out.println(uuid.length());
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());
		System.out.println(uuid.variant());
	}

}
