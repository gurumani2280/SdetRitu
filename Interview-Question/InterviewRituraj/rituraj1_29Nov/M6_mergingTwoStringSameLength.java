package com.rituraj1;

public class M6_mergingTwoStringSameLength {

	public static void main(String[] args) {
		// input1 = "aceg' Input2 = "bdfh' output = abcdefg
		String input1 = "aceg";
		String input2 = "bdfh";
		String output = "";
		if (input1.length() == input2.length()) {
			for(int i =0; i <input1.length(); i ++) {
				output = output + input1.charAt(i)+ input2.charAt(i);
			}
		} else {
			System.out.println("input lenghts different");
		}
		System.out.println(output);
		

	}

}
