package com.anoopkrdev.ds.array;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] array = {1,1,2,3,3,4,3,5};
		for(int i : removeDuplicate(array)) {
			System.out.println(i);
		}
	}

	private static int[] removeDuplicate(int[] array) {
		Arrays.sort(array);
		int[] results = new int[array.length];
		int previous = array[0];
		results[0] = previous;
		
		for(int i = 1, j = 1; i < array.length; i++) {
			if(array[i] != previous) {
				results[j] = array[i];
				j++;
			}
			previous = array[i];
		}
		
		return results;
	}
}
