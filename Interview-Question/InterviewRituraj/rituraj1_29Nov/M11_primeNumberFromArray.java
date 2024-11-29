package com.rituraj1;

public class M11_primeNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,5,8,12,17,21};
		for(int item : input) {
			if(isPrime(item)) {
				System.out.println("the given number "+ item + " is Prime");
			}
		}
		
	}
	
	public static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		boolean isPrime = true;
		for(int i = 2; i < number/2; i++) {
			if(number%i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
