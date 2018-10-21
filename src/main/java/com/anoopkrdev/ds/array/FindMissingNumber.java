package com.anoopkrdev.ds.array;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] array = {1, 3, 2, 5};
		System.out.println(findSingleMissingNumber(array));
		findMisingNumberUsingBitSet(array, 6);
	}
	
	public static int findSingleMissingNumber(int[] array) {
		int length = array.length + 1;
		int sum = (length * (length + 1)) / 2;
		int arraySum = 0;
		for(int i : array) {
			arraySum += i;
		}
		return sum - arraySum;
	}
	
	public static void findMisingNumberUsingBitSet(int[] array, int count) {
		int missingCount = count - array.length;
		BitSet bitset = new BitSet(count);
		
		for(int number : array) {
			bitset.set(number - 1);
		}
		
		int lastMissingIndex = 0;
		for(int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitset.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}

}
