package com.anoopkrdev.ds.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		firstNonRepeatingCharacter("hello");
	}
	
	private static void firstNonRepeatingCharacter(String text) {
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for(char c : text.toCharArray()) {
			charMap.put(c, charMap.containsKey(c) ? charMap.get(c) + 1 : 1);
		}
		
		for(Entry<Character, Integer> entry: charMap.entrySet()) {
			System.out.println(entry.getKey());
			break;
		}
	}

}
