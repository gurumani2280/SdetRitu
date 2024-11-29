package com.rituraj1;

import java.util.HashMap;
import java.util.Map;

public class M4b_charCountUsingMap {

	public static void main(String[] args) {
		// "aabbbcccc" output =a2b3c4
		String input = "aabbbcccc";
		//String input ="JAVA";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(map.containsKey(ch)) {
				int value = map.get(ch);
				map.put(ch, value+1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);

	}

}
