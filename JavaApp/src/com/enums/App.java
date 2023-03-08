package com.enums;

public class App {
	public static void main(String[] args) {
		
		String str ="US";
		/* Array of type Enum  */
		Country[] carry = new Country[Country.values().length];
		int i=0;
		/* add all enums in Enum Array using values()  */
		for(Country c : Country.values()){
			carry[i++] = c;
		}
		
		/* Convert given String to enum, and handle exception*/
		try { 
			Country country = Country.valueOf(str);
			System.out.println(country);
		}
		catch(Exception e) {
			System.out.println("Invalid value for country " + str + "\n" + 
					"Legal Values ");
			for(Country c : carry) {
				System.out.println(c);
			}
		}
		
		/*Convert enum into String  */
		System.out.println(Country.England.toString());
	}
}
