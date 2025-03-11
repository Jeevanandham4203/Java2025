package ARRAYLIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoArrayListIntoOneArrayList {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		list1.addAll(list2);//without Stream
		List<List<Integer>> res=Arrays.asList(list1,list2);
		System.out.println(list1);
		System.out.println(res);
		List<Integer> collect = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println();

	}

}
