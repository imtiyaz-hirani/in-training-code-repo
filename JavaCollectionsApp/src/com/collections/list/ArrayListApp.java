package com.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListApp {
	public static void main(String[] args) {
		/* Instead of Pure Object, prefer Polymorphic object */
		// ArrayList list = new ArrayList();
		
		List<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(1);
		list.add(null);
		
		System.out.println(list); //[3, 2, 6, 1]
		
		/* Access element using index */
		System.out.println("Element at index 2: " + list.get(2)); //6
		
		/* Size of the list */
		System.out.println("Size of list is " + list.size()); //4
		
		/* Remove an Element */
		list.remove(2);
		
		/* Access element using index */
		System.out.println("Element at index 2: " + list.get(2)); //1
		
		/* Size of the list */
		System.out.println("Size of list is " + list.size()); //3
		
		System.out.println(list);
		
		/* Sorting in Natural ordering : ASC*/
		Collections.sort(list); 
		System.out.println(list);
		
		/* Reverse the List */
		Collections.reverse(list);
		System.out.println(list);
		
		/* Searching the list: binarySearch */
		Collections.sort(list); 
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 1) >= 0? "Found": "Not Found");
		System.out.println(Collections.binarySearch(list, 4) >= 0? "Found": "Not Found");

	}
}
