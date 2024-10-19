package com.rituraj1;

import java.util.Arrays;

public class M2_SumNumbersInString {

	public static void main(String[] args) {
		// "12hello23world output = 35 // 12+23 =35 
		String input = "12hello23world";
		String testAlphnumberic= input.replaceAll("[a-zA-Z0-9]+", ""); // to test input is alpha numberic
		System.out.println("-- =="  + testAlphnumberic);
		if(testAlphnumberic.equals("")) {
			String[] inputArraywithMultipleDigit2 = input.split("[a-zA-Z]+");
			System.out.println(Arrays.toString(inputArraywithMultipleDigit2));
			System.out.println(inputArraywithMultipleDigit2.length);
			int sum = 0;
			for(int i = 0; i < inputArraywithMultipleDigit2.length; i ++) {
				int num = Integer.parseInt(inputArraywithMultipleDigit2[i]);
				sum = sum + num;
			}
			System.out.println("sum of digits "+sum);
		} else {
			System.out.println("NOt a alphanumbric input");
		}
		
		
		
		
		
		/*
		 * 
		 String[] inputArraywithMultipleDigit = input.split("\\d+");
		System.out.println(Arrays.toString(inputArraywithMultipleDigit));
		System.out.println(inputArraywithMultipleDigit.length);
		/*
		 [, hello, world]
			3
		 
		 *[12, 23]
2
sum of digits 35
		 */
		
		

	}

}
