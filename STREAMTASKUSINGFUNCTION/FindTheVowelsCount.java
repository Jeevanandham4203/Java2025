package STREAMTASKUSINGFUNCTION;

import java.util.List;
import java.util.stream.Collectors;

public class FindTheVowelsCount {

	public static void main(String[] args) {
		String a="jEeva";
		Vowels v=new Vowels();
		System.out.println("Vowels of Given String:"+v.getName(a));
	}
}

class Vowels {
	
	public  List<Character> getName(String a) {
		List<Character> collect = a.chars().mapToObj(c->(char)c)
				.filter(x->(char)x=='a'||x=='e'||x=='i'||x=='o'||x=='u'&&x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
				.collect(Collectors.toList());
		return collect;
	}
}