package com.generic;

import java.util.List;

public class MyService {

	public <T> void iterateList(List<T> list) {
		for(T t : list) {
			System.out.println(t);
		}
	}
	
	
	public <T> void compareObject(T t1, T t2) {
		
	}
}
