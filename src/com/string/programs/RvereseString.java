package com.string.programs;

public class RvereseString {

	public static void main(String[] args) {
		String str = "Hello";
		String res = "";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		System.out.println("Reversed String is : "+res);

	}

}
