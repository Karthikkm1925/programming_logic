package com.array.programs;

import java.util.Arrays;

public class reverseArrayBySwapWithoutTemp {

	public static void main(String[] args) {
		
		int[] arr = {5,4,3,2,1};
		
		int i=0,j=arr.length-1;
		//without temp variable
		while(i<j) {
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
