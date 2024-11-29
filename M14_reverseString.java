package com.rituraj1;

import java.util.Arrays;

public class M14_reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input "MOHAN" output "NAHOM"
		String input = "India is green land country";
//		String output = reverseString(input);
//		System.out.println(output);
		
		
		// reverse only 2nd word
		
		String[] words = input.split("\\s+");
		System.out.println(Arrays.toString(words));
		String reverse3rd = reverseString(words[2]);
		String reverse5th = reverseString(words[4]);
		
		String output = words[0] + " "+ words[1] + " " + reverse3rd + " " + words[3] + " "+ reverse5th; 
		System.out.println(output);
		

	}
	
	public static String reverseString(String input) {
		String output ="";
		for(int i = input.length() -1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		return output;
	}

}
