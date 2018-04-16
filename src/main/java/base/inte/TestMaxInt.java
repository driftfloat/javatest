package base.inte;

public class TestMaxInt {

	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE + 1);
		System.out.println(Integer.valueOf(Integer.MAX_VALUE + 1).equals(Integer.MIN_VALUE));
		System.out.println(Long.valueOf(Long.MAX_VALUE + 1).equals(Long.MIN_VALUE));
//		System.out.println(Integer.valueOf(Integer.MAX_VALUE + 1).equals(Integer.MIN_VALUE));
		System.out.println(Character.valueOf( Character.MAX_VALUE  ) + 1);
		System.out.println( (char)(Character.MAX_VALUE + 1) );
		switch ("end") {
		case "a":
			break;
		case "end":
			System.out.println("The end.");
			break;
		default:
			break;
		}
	}
//
} 
