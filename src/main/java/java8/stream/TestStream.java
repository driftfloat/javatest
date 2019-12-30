package java8.stream;

import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing; 
import static java.util.stream.Collectors.toList;

public class TestStream {

	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		List<Dish> menu = Arrays.asList(
				 new Dish("pork",    		false, 	800, Dish.Type.MEAT)
				,new Dish("beef",    		false, 	700, Dish.Type.MEAT)
				,new Dish("chicken", 		false, 	400, Dish.Type.MEAT)
				,new Dish("french fries", 	true, 	530, Dish.Type.OTHER)
				,new Dish("rice", 			true, 	350, Dish.Type.OTHER)
				,new Dish("season fruit", 	true, 	120, Dish.Type.OTHER)
				,new Dish("pizza", 			true, 	550, Dish.Type.OTHER)
				,new Dish("prawns", 		false, 	300, Dish.Type.FISH)
				,new Dish("salmon", 		false, 	450, Dish.Type.FISH)
		);
		
		List<String> names = menu.stream()
				.filter(d->d.getCalories()>300)
				.sorted(comparing(Dish::getCalories).reversed())
//				.sorted(comparing(Dish::getCalories))
				.map(Dish::getName)
//				.limit(3)
				.collect(toList());
		System.out.println(names);
	}

}
