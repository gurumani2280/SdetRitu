package com.rituraj1;

public class M7_reverseStringWithSpacePostionIntact {

	public static void main(String[] args) {
		// input = "I am not A String" output = "g ni rts A notmaI"
		String input = "I am not A String";
		String output = "";
		System.out.println(input.length());
		for(int i = input.length()-1, j =0;i >=0; i--, j++) {
			char leftChar = input.charAt(j);
			char rightChar = input.charAt(i);
			if (leftChar == ' ') {
				output = output + ' '; 
			i--;
			}
			if(rightChar == ' ') {
				j++;
			} else {
				output = output + rightChar;
			}
			
			System.out.println(output+ " , - i = "+ i + "- "+leftChar+ ", j = "+j +"-"+ rightChar);
		}
		System.out.println(output);


	}

}
