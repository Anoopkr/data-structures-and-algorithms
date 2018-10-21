package com.anoopkrdev.ds.array;

import java.util.HashSet;
import java.util.Set;

public class FindPairofGivenNumber {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,-5,10};
		findPairs(a, 5);

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

}
