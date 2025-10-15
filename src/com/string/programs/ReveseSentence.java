package com.string.programs;

import java.util.Arrays;

public class ReveseSentence {

	public static void main(String[] args) {
		String str = " Winner always Developer";
		String[] s1=str.split(" ");
		int i =0,j=s1.length-1;
	/*	String res= " ";
		for (int i = s1.length-1;i>=0; i--) {
			 res = res +" "+ s1[i];
			
		}
System.out.println("Reversed Sentence is :"+"\""+res+" \"");*/
		while(i<j) {
			String temp = s1[i];
			s1[i]=s1[j];
			s1[j]=temp;
			i++;
			j--;
		}
		System.out.println(String.join(" ", s1));
	}

}
