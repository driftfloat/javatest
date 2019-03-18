package base.string;

public class TestSplit {

	public static void main(String[] args) {
		String s ="Sms.SMS_CACHE";
		String[] sa = s.split("\\.");
		System.out.println(sa[0]);
	}

}
