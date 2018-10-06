package generic;

public class T45 {

	public static void main(String[] args) {
		Generic<Integer> gInteger = new Generic<Integer>(123);
		Generic<Number> gNumber = new Generic<Number>(456);

		showKeyValue(gNumber);

		// showKeyValue这个方法编译器会为我们报错：Generic<java.lang.Integer> 
		// cannot be applied to Generic<java.lang.Number>
		showKeyValue(gInteger);
	}
	
	public static void showKeyValue(Generic<?> gNumber){
	    System.out.println("key value is " + gNumber.getKey());
	}

}
