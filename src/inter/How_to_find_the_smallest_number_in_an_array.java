package inter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class How_to_find_the_smallest_number_in_an_array {
	Integer givern[] = { 2, 4, 5, 6, 7, 8, 9 };

	public void name() {

		int big = Integer.MAX_VALUE;

		for (int i = 0; i < givern.length; i++) {
			if (givern[i] < big) {
				big = givern[i];

			}
		}
		System.out.println(big);

	}public void name2() {
		
		
		List<Integer>list=Arrays.asList(givern);
		Collections.sort(list);
		int small=list.get(0);
		System.out.println(small);
		
	}

	public static void main(String[] args) {
		How_to_find_the_smallest_number_in_an_array a = new How_to_find_the_smallest_number_in_an_array();
		a.name2();
	}

}
