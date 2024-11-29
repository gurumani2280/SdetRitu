package com.rituraj1;

public class M3_SumDigitsInString {

	public static void main(String[] args) {
		// "12hello23world output = // 1+ 2 +2+3 = 8
		String input = "12hello23world";
		if(input.matches("[a-zA-Z0-9]+")) {
			String replacedInput = input.replaceAll("[a-zA-Z]+", "");
			System.out.println(replacedInput);
			System.out.println(replacedInput.length());
			int sum = 0;
			for(int i = 0; i < replacedInput.length(); i ++) {
				int num = Integer.parseInt(replacedInput.charAt(i)+"");
				sum = sum + num;
			}
			System.out.println("sum of digits "+sum);
		} else {
			System.out.println("NOt a alphanumbric input");
		}
		

	}

}
