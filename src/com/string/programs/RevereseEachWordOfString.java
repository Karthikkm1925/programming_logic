package com.string.programs;

public class RevereseEachWordOfString {
	String res="";
	public static void main(String[] args) {
		String str="hi this is me";
		String res ="";
		String[] s1 = str.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
		 res = res+reverse(s1[i]);
		}
System.out.println("Rverced each word in String Given:"+"\""+res+" \"");
	}

	 static String reverse(String str) {
		 String res=" ";
		 for(int i=str.length()-1;i>=0;i--) {
			res = res+str.charAt(i); 
		 }
		 return res;
	 }
}
