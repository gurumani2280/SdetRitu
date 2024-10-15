package com.rituraj1;

public class M4 {

	public static void main(String[] args) {
		// "aabbbcccc" output =a2b3c4
		String input = "aabbbcccc";
		String output ="";
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if( output.indexOf(ch) == -1) {
				String reg = "[^"+ch+"]";
				String replacedInput = input.replaceAll(reg, "");
				output = output + ch + +replacedInput.length();
			}
		}
		System.out.println(output);

	}

}
