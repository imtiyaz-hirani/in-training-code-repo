package com.collections.utility;

import java.util.Comparator;

import com.collections.model.Employee;

public class IdSortUtility implements Comparator<Employee>{
	private String direction; 
	
	public IdSortUtility(String direction) {
		this.direction = direction;
	}

	@Override
	public int compare(Employee e1, Employee e2) { //[e1,e2]
		switch(this.direction) {
		case "ASC":
			 if(e1.getId() < e2.getId()) //[e1,e2]
				 return -1; 
			 if(e1.getId() > e2.getId()) //[e2,e1]
				 return 1; 
			return 0;
			 
		case "DESC":
			 if(e1.getId() < e2.getId()) //[e2,e1]
				 return 1; 
			 if(e1.getId() > e2.getId()) //[e1,e2]
				 return -1;  
			return 0;
		}
		return 0;
	}

}
