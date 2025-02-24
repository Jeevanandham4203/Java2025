package STREAMTASK;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindingLetterCount {

	public static void main(String[] args) {
		String a="I am coding";
		Long lettercount=a.chars().filter(Character::isLetter).count();
		System.out.println(lettercount);

	}

} 
