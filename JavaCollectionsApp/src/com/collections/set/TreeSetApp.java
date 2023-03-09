package com.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(4);
		set.add(8);
		set.add(1);
		set.add(7);
		set.add(null);
		/* Set, by default, is a sorted collection */
		System.out.println(set);//[1, 4, 7, 8]
		
	}
}
