package com.day16.bl;

public class PrimeNumbers {

	public static void main(String[] args) {
		int limit =100;
		System.out.println("prime numbers between 1 to "+ limit);
		
		for(int i=1; i<=100;i++) {
			boolean isprime = true;
			
			for(int j =2; j<i;j++) {
				if (i%j == 0) {
					isprime = false;
					break;
				}
			}
			if(isprime) {
				System.out.println(i + " ");
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
		