package base.string;

public class Format {

	public static void main(String[] args) {
	    double d = 3.1415926;
	    
	    String result1 = String.format("%.0f", d);
	    String result = String.format("%.3f", d);
	    System.out.println(result1);
	    System.out.println(result);
	    String s = "3.1415926";
	    result1 = String.format("%.2f", Double.valueOf(s));
	    result = String.format("%.3f", Double.valueOf(s));
	    System.out.println(result1);
	    System.out.println(result);
	  }

}
