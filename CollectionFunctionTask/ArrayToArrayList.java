package CollectionFunctionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		Integer arr[]= {10,20,30,40};
		System.out.println(ArraytoArrayListSeconmax(arr));

	}
	public static int ArraytoArrayListSeconmax(Integer[] arr) {
	    List<Integer> list = new ArrayList<>(Arrays.asList(arr));
	     Collections.sort(list,Collections.reverseOrder());
	     return list.stream().skip(1).findFirst().get();
	}
}
