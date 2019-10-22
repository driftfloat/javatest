 public class T1{
	public static void main(String[] args){
		boolean flag = false;
		if("" instanceof CharSequence) {
			flag = true ;
		}
		System.out.println(flag);
	}
 }