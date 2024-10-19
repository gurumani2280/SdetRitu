package com.rituraj1;

import java.util.Arrays;

public class M8_mergingTwoArrays {
	public static void main(String[] args) {
		// a[] ={1,3,5,7,9}; b[] ={2,4,6,8}; output = c[] = {1,2,3,4,5,6,7,8,9}.
		int[] a ={1,3,5,7,9};
		int[] b ={2,4,6,8};
		int[] output = new int[a.length + b.length];
		for (int i = 0, aIndex=0, bIndex =0; i < output.length; i ++) {
			//System.out.println(Arrays.toString(output));
			if(aIndex == bIndex) {
				output[i] = a[aIndex++];
			} else if ( bIndex < aIndex) {
				output[i] = b[bIndex++];
			}
			//System.out.println(Arrays.toString(output));
		}
		System.out.println(Arrays.toString(output));
	}

}
