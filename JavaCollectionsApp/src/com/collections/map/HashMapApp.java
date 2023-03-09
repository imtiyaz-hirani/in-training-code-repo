package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "apple");
		map.put(2, "mango");
		map.put(3, "banana");
		
		System.out.println("========all keys==========");
		/* Iterate over the keys */
		for( int key: map.keySet()) {
			System.out.print(key + "  ");
		}
		System.out.println("\n========all values==========");
		/* Iterate over the values */
		for(String value : map.values()) {
			System.out.print(value + "  ");
		}
		
		System.out.println("\n========entry set==========");
		/* Iterate over the entrySet<key,value> */
		
		for(Map.Entry<Integer,String> entry: map.entrySet()) {
				System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		System.out.println("\n========Searching==========");
		/* Find the key in the map  */
		System.out.println(map.containsKey(4)?"Present":"Not Present");
		System.out.println(map.containsKey(3)?"Present":"Not Present");
		
		/* Fetch the value on the basis of key */
		System.out.println(map.get(2)); //mango
		System.out.println(map.get(4)); //null
	}
}









