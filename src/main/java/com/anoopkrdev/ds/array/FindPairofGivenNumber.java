package com.anoopkrdev.ds.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindPairofGivenNumber {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,-5,10};
		findPairs(a, 5);
		findPairWithoutSet(a, 5);
	}

	private static void findPairs(int[] array, int sum) {
		Set<Integer> set = new HashSet<Integer>();
		for(int n : array) {
			int target =  sum - n;
			if(!set.contains(target)) {
				set.add(n);
			} else {
				System.out.println(n + ", " + target);
			}
		}
		
	}
	
	private static void findPairWithoutSet(int[] array, int n) {
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		while(left < right) {
			int sum = array[left] + array[right];
			if(sum == n) {
				System.out.println(array[left] + ", " + array[right]);
				left++;
				right--;
			} else if(sum < n) {
				left++;
			} else {
				right--;
			}
		}
	}

}
