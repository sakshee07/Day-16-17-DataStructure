package com.day16.bl;

import java.util.Arrays;

public class Anagram {
	public static void main(String []args) {
		String s1 = "abcd";
		String s2 ="dcba";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() == s2.length()) {
			
			char []array1 =s1.toCharArray();
			char []array2 = s2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			boolean result = Arrays.equals(array1, array2);
			
			if(result) {
				System.out.println("anagrams found : "+ s1 +" "+s2 );
			}else {
				System.out.println(s1+"and"+s2+"are not anagram");
			}
			}
		
	}
	
	
}

