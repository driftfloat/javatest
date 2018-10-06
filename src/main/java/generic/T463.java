package generic;

public class T463 {

	public static void main(String[] args) {
		printMsg("111",222,"aaaa","2323.4",55.55);
	}
	
	public static <T> void printMsg( T... args){
	    for(T t : args){
	        System.out.println("t is " + t);
	    }
	}

}
