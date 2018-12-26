package base.static1;
/*  Author: kevin
 *	Date: 2018年11月27日
**/
public class Static3 {
	public static String staticField = "静态变量";

	static {
	    System.out.println("静态语句块");
	}

	public String field = "实例变量";

	{
	    System.out.println("普通语句块");
	}
	
	

	public static void main(String[] args) {
		new Static3();
		System.out.println(staticField);
		
		
	}

}
