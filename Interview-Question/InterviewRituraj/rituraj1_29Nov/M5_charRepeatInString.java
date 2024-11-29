package com.rituraj1;

public class M5_charRepeatInString {

	public static void main(String[] args) {
		// "a2b3c4" output = aabbcccc
		String input = "a2b0c4d5";
		String output = "";
		for(int i =0; i< input.length(); i = i +2) {
			char ch1 = input.charAt(i);
			int ch2 = Integer.parseInt(input.charAt(i+1)+"");
			output = output + (ch1+"").repeat(ch2);
		}
		System.out.println(output);
	}

}
