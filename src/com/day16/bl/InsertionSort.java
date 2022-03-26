package com.day16.bl;

public class InsertionSort {
	public static void main(String args []) {
		String[] arr ={"Nashik","Karjat","Pune","Mumbai","Thane","Jaipur","A`bad"};
		int count = 0;
		String sortedArray[] = sort_sub(arr, arr.length); 
		for(int i=0;i<sortedArray.length;i++){
		System.out.println(sortedArray[i]);
		}
	}

		public static String[] sort_sub(String array[], int a){
		String temp="";
		for(int i=0; i<a; i++){
		for(int j=i+1; j<a; j++){
		if(array[i].compareToIgnoreCase(array[j])>0){
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
				}
			}	
		}
		return array;
		}
	}