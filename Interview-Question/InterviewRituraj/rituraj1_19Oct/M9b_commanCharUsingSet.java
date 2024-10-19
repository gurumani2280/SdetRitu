package com.rituraj1;

import java.util.HashSet;
import java.util.Set;

public class M9b_commanCharUsingSet {

	public static void main(String[] args) {
		// input1 = "abcefc" input2 = "decha" output = aec (repeated Characters)
		
		String input1 = "abcefc";
		String input2 = "decha";
		Set<Character> output = new HashSet<Character>();
		for(int i =0; i < input1.length(); i++) {
			char ch = input1.charAt(i);
			
			if(input2.indexOf(ch) != -1 ) {
				System.out.println( output.add(ch));
			}
			
			
		}
		System.out.println(output);
	}

}
