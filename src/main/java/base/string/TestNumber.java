package base.string;

import java.text.DecimalFormat;

public class TestNumber {

	public static void main(String[] args) {
		String a = "001";
//		String str = a(a);
//		System.out.println(str); // 0001a();
		System.out.println(haoAddOne_2(a));
	}

	public static String inc(String a) {
		String rtn = "";
		int i = Integer.valueOf(a) + 1;
		// StringUtils.
		// String rtn = "0" String.valueOf(i).length();
		return rtn;
	}

	public static String a(String a) {
//		int youNumber = 1;
		int i = Integer.valueOf(a) + 1;
		// 0 代表前面补充0
		// 4 代表长度为4
		// d 代表参数为正数型
		String str = String.format("%03d", i);
		return str;
	}
	
	private static final String STR_FORMAT = "000";   
	public static String haoAddOne_2(String liuShuiHao){  
		Integer intHao = Integer.parseInt(liuShuiHao);  
        intHao++;  
        DecimalFormat df = new DecimalFormat(STR_FORMAT);  
        return df.format(intHao);  
	}

}
