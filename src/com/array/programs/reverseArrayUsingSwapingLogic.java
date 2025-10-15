package com.array.programs;
import java.util.Arrays;

public class reverseArrayUsingSwapingLogic {

	public static void main(String[] args) {
	int[] arr = {1,4,5,3,6,7,8,2};
	
	 
	int i=0,j=arr.length-1;
	
	while(i<j) {

	//using temp variable	
	int temp = arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	i++;
	j--;
 	}
	System.out.println(Arrays.toString(arr));
	}
}
