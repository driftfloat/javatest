package base.math;

public class TestRound {

	public static void main(String[] args) {
		String t = "1000";
		t="1";
		System.out.println(t+"\t:"+incrment(t));
		t="9";
		System.out.println(t+"\t:"+incrment(t));
		t="10";
		System.out.println(t+"\t:"+incrment(t));
		t="99";
		System.out.println(t+"\t:"+incrment(t));
		t="100";
		System.out.println(t+"\t:"+incrment(t));
		t="999";
		System.out.println(t+"\t:"+incrment(t));
		t="1000";
		System.out.println(t+"\t:"+incrment(t));
		t="9999";
		System.out.println(t+"\t:"+incrment(t));
		t="10000";
//		System.out.println(Math.round(Math.ceil( Math.log10(t+1)) ));
		System.out.println(t+"\t:"+incrment(t));
	}
	
	
	private static String incrment(String v) {
		Integer t = Integer.valueOf(v);
		t++;
		if(t<100) {
			return String.format("%02d", t);
		}else {
//			long n = Math.round(Math.ceil( Math.log10(t+1)) );
//			return String.format("%0"+n+"d", t);
			return t.toString();
		}
	}

}
