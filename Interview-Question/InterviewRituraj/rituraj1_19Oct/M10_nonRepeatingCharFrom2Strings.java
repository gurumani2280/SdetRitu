package com.rituraj1;

public class M10_nonRepeatingCharFrom2Strings {

	public static void main(String[] args) {
		// input1 = "abcefc" input2 = "decha" output = bfdh (non-repeated Characters)  
		
		String input1 = "abcefc";
		String input2 = "decha";
		String output ="";
		for(int i =0; i < input1.length(); i++) {
			char ch = input1.charAt(i);
			
			if(input2.indexOf(ch) == -1) {
				output = output+ ch;
			}
		}
		
		for(int i =0; i < input2.length(); i++) {
			char ch = input2.charAt(i);
			
			if(input1.indexOf(ch) == -1) {
				output = output+ ch;
			}
		}
		System.out.println(output);
	}

}
