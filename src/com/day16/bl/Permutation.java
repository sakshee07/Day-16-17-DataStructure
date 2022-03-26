package com.day16.bl;

public class Permutation {

	public static void main(String[] args) {
		String string = "XYZ";
		int n = string.length();
		Permutation permuataion = new Permutation();
		permuataion.permute(string,0,n-1);
		}

	private void permute(String string, int l, int r) {
		if(l == r) {
			System.out.println(string);
		}else {
			for(int  i=1; i<=r; i++) {
				string = swap(string,l,i);
				permute(string,1+l,r);
				string = swap(string,l,i);
			}
		}
	}

	private String swap(String a, int i ,int j) {
		char temp;
		char [] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i]= charArray[j];
		charArray[j] = temp;
		System.out.println();
		return String.valueOf(charArray);
	}
}
 