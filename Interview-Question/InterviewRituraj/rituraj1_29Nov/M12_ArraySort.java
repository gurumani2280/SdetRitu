package com.rituraj1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class M12_ArraySort {
	
	//https://stackoverflow.com/questions/1694751/java-array-sort-descending
	public static void main(String[] args) {
		Integer[] input = {1,5,8,12,17,21};
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		Arrays.sort(input, Collections.reverseOrder());
		System.out.println(Arrays.toString(input));
	}
}

/*
Arrays.sort() cannot be used directly to sort primitive arrays in descending order. If you try to call the Arrays.sort() method by passing reverse Comparator defined by Collections.reverseOrder() , it will throw the error

no suitable method found for sort(int[],comparator)

That will work fine with 'Array of Objects' such as Integer array but will not work with a primitive array such as int array.

The only way to sort a primitive array in descending order is, first sort the array in ascending order and then reverse the array in place. This is also true for two-dimensional primitive arrays.
*/