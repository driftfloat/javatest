package base.string;

public class TestReplace {

	public static void main(String[] args) {
		String v ="j:\\mp3\\t";
		String a ="J:\\baidu\\df6\\411517\\";
		String b = "t:\\a\\";
		System.out.println(v.replace(a, b));
		System.out.println(v.replace("j:\\mp3\\", "t:\\a\\"));
		
		v="J:\\baidu\\df6\\411517\\mp3\\01.hotel califonia-joe walsh & don felder(eagles).mp3";
		System.out.println(v.replace(a, b));
	}

}
