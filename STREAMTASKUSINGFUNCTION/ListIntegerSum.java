package STREAMTASKUSINGFUNCTION;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListIntegerSum {

	public static void main(String[] args) {
		List<Integer>sum=Arrays.asList(2,3,7,4,8);
		Sum add = new Sum();
		System.out.println(add.getSum(sum));

	}
	
	

}

class Sum {
	public Integer getSum(List<Integer> sum) {
		Integer collect = sum.stream().collect(Collectors.summingInt(x->x));
		return collect;
	}
}
