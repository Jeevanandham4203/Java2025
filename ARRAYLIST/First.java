package ARRAYLIST;

import java.util.ArrayList;
import java.util.List;


public class First {

	public static void main(String[] args) {
		List<Integer>num=new ArrayList<>();
		num.add(10);
		num.add(30);
		num.add(56);
		//System.out.println(num.get(2));
		//System.out.println(num.get(1));
		//num.remove(2);
		//System.out.println(num.get(2));
		num.add(56);
		num.add(2, 34);
		System.out.println(num);
//		System.out.println("Size is:"+num.size());
//		for(int i=0;i<num.size();i++) {
//			System.out.println(num.get(i));
//		}
//		System.out.println("-------------------");
//		for(Integer x:num) {
//			System.out.println(x);
//		}
		
		
	}

}
