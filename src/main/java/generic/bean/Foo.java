package generic.bean;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Foo<T extends  List> {
    public static void main(String[] args) {
         //上限 
		Foo<ArrayList> f =new Foo<>();
		Foo<LinkedList> f2 =new Foo<>();      
   }  
    
    public void test(List<? extends Fruit> list){ 
    	   list.add(new Fruit("f")); 
    	   list.add(new Pear("p"));
    	   list.add(new Apple("a")); 
    	}

} 

