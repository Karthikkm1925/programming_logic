package com.string.programs;

public class Remove_adjacent_repeatedwords {

	public static void main(String[] args) {
		String str = "hi hi hi how are are you you hi how are are you you";
		String[] s1 = str.split(" ");
		for(int i=0;i<s1.length-1;i++) {
			if(!s1[i].equals(s1[i+1])) {
				System.out.println(s1[i]);
		}
		}
		System.out.println(s1.length-1);
	}
}
