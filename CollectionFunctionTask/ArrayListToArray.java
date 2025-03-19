package CollectionFunctionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<Integer>arr=new ArrayList<>(Arrays.asList(10,20,30,40));
		System.out.println(Arrays.toString(convertListToArray(arr)));

	}
	public static int[] convertListToArray(List<Integer> list) {
		int[] arr2 = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
		    arr2[i] = list.get(i);
		}
		return arr2;
	}
}
