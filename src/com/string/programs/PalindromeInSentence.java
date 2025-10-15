package com.string.programs;

public class PalindromeInSentence {

	public static void main(String[] args) {
		 String str = "MoM is always looks like wOw";
		 String[] s1=str.split(" ");
 
		 for (int j = 0; j < s1.length; j++) {
			 if(isPalindrome(s1[j])) {
				 
				 System.out.print(" "+s1[j]);
		} 
 
		}
	}
	static boolean isPalindrome(String str) {
		String res ="";
		for(int i=str.length()-1;i>=0;i--) {
			res+=str.charAt(i);
		}
		return res.equalsIgnoreCase(str);
	}
	
	
}
