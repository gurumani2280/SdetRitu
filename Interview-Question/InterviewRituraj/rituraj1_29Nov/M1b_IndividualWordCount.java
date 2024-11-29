package com.rituraj1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class M1b_IndividualWordCount {

	public static void main(String[] args) {
		// "Hello World", Output = "World Hello".
		//String input = "Hello World";
		//String input = "India  is  my   country";
		String input ="hi java hi c hi python";
		String[] inputArrayWithSpace = input.split("\\s+");
		System.out.println(Arrays.toString(inputArrayWithSpace));
		
		System.out.println("word count "+inputArrayWithSpace.length);
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < inputArrayWithSpace.length; i++) {
			String word = inputArrayWithSpace[i];
			if(map.containsKey(word)) {
				int value = map.get(word);
				map.put(word, value+1);
			} else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
		

	}

}
