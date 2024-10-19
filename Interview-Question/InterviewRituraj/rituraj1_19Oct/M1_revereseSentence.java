package com.rituraj1;

import java.util.Arrays;

public class M1_revereseSentence {

	public static void main(String[] args) {
		// "Hello World", Output = "World Hello".
		//String input = "Hello World";
		String input = "India  is  my   country";
		String[] inputArrayWithSpace = input.split("\\s+");
		System.out.println(Arrays.toString(inputArrayWithSpace));
		
		System.out.println("word count "+inputArrayWithSpace.length);
		String output = "";
		for(int i = inputArrayWithSpace.length-1; i >=0; i--) {
			output = output + inputArrayWithSpace[i] + " ";
		}
		System.out.println(output.trim());
		

	}

}
