package ARRAYLIST;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String[] arr = {"A", "B", "C"};
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		
		Integer []a= {1,2,3};
		List<Integer>l=Arrays.asList(a);
		System.out.println(l);
	}
	
}
