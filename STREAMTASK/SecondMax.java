package STREAMTASK;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondMax {

	public static void main(String[] args) {
		List<Integer>max=Arrays.asList(10,30,45,78,67,90,65);
//		Integer find=max.stream().max(Integer::compare).get();
//		System.out.println(find);
		Integer s=max.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println("Second Max is:"+s);
		 
	}

}
