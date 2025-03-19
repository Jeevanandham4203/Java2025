package CollectionFunctionTask;

import java.util.Arrays;
import java.util.List;

public class ListIntegerSum {

	public static void main(String[] args) {
		List<Integer>sum=Arrays.asList(2,3,7,4,8);
		System.out.println(sumOfList(sum));
		int total=0;
		for(int num : sum) {
			total=total+num;
		}
		System.out.println(total);
	}

	public static int sumOfList(List<Integer> num) {
	    int sum = 0;
	    for (int nums : num) {
	        sum += nums;
	    }
	    return sum;
	}

}
