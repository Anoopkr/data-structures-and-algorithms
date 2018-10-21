package com.anoopkrdev.ds.array;

public class FindSingleMissingNumber {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 5};
		System.out.println(findMissingNumber(array, 5));
	}
	
	public static int findMissingNumber(int[] array, int length) {
		int sum = (length * (length + 1)) / 2;
		int arraySum = 0;
		for(int i : array) {
			arraySum += i;
		}
		return sum - arraySum;
	}
	
	

}
