package base.string;

public class TestSplit {

	public static void main(String[] args) {
		String s ="Sms.SMS_CACHE";
		String[] sa = s.split("\\.");
		System.out.println(sa[0]);
		s="01";
		sa = s.split("\\.");
		System.out.println(sa.length);
		s="01.01";
		sa = s.split("\\.");
		System.out.println(sa.length);
		s=" and w.channel_name like '%02%'  and 2 and  ifnull(w.flag,0) = 0 ";
		sa = s.split(" and ");
		System.out.println(sa.length);
		
		s=" and 2 and  ifnull(w.flag,0) = 0";
		sa = s.split(" and ");
		System.out.println(sa.length);
	}

}
