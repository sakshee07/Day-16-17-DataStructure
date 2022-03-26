package com.day16.bl;

import java.util.Scanner;

class Binary{
	static String[] array = { "one", "two", "three", "four", "five"};
	static int min = 0;
	static int max = array.length - 1;
	static int mid;
	static Scanner sc = new Scanner(System.in);
	
	static String searchKey = sc.nextLine();

	public static void main(String[] args) {
		System.out.println("Key Found at : " + stringBinarySearch() + " position");
	}

	public static int stringBinarySearch() {
		while (min <= max) {
			mid = (min + max) / 2;
			if (array[mid].compareTo(searchKey) < 0) 
			{ min = mid + 1; 
			} else if (array[mid].compareTo(searchKey) > 0) {
				max = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}