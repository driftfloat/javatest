package temp;

import java.time.LocalTime;

public class Main {

	public static void main( String[] args) {
		System.out.println(LocalTime.now()+"\t"+TestSingleton.class);
		TestSingleton.getInstance();
	}

}
