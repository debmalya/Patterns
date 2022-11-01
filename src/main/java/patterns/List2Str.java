package patterns;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List2Str {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 3, 1, 4);
		String nums = numbers.stream().filter(n -> n > 4).map(n-> n+"d").collect(Collectors.joining(","));
		System.out.println(nums);
	}

}
