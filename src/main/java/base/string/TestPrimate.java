package base.string;

public class TestPrimate {

	public static void main(String[] args) {
		System.out.println(isPrototype("1"));
		System.out.println(isPrototype(1));
		System.out.println(isPrototype(1L));
		
		System.out.println(isPrototype('1'));
		System.out.println(isPrototype(1.0f));
		System.out.println(isPrototype(1.0d));
		
		System.out.println(isPrototype(false));
		System.out.println(isPrototype((byte)1));
		System.out.println(isPrototype((short)1));
		
		Integer my = 1;
		System.out.println(isPrototype(my));
		System.out.println(isPrototype(new Object()));
	}
	
	private static boolean isPrototype(Object key){
		boolean flag = false;
		if(key instanceof String) {
			flag = true ;
		}else if(key instanceof Integer) {
			flag = true ;
		}else if(key instanceof Long) {
			flag = true ;
		}else if(key instanceof Character) {
			flag = true ;
		}else if(key instanceof Float) {
			flag = true ;
		}else if(key instanceof Double) {
			flag = true ;
		}else if(key instanceof Boolean) {
			flag = true ;
		}else if(key instanceof Byte) {
			flag = true ;
		}else if(key instanceof Short) {
			flag = true ;
		}
		return flag;
	}

}
