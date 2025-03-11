package STREAMTASK;

import java.text.Collator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateInString {

	public static void main(String[] args) {
//		String a="JEEVA";
//		Set<Character>duplicate=new HashSet<>();
//		List<Character>DuplicateValue=a.chars()
//				.filter(x->!duplicate.add(x))
//				.distinct().collect(Collectors.toList());
		//System.out.println(DuplicateValue);
		List<Integer>one= Arrays.asList(10,20,10,30,40,20);
		Set<Integer> collect = one.stream().collect(Collectors.toSet());
		System.out.println(collect);
		

	}

}
