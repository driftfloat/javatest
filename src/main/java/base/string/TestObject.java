package base.string;

import java.util.ArrayList;
import java.util.List;

import model.Person;

public class TestObject {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		String toString = p.getClass().getName() + '@' + Integer.toHexString(p.hashCode());
		System.out.println(toString);
		List l = new ArrayList();
	}

}
