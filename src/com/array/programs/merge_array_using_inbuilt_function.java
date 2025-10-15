package com.array.programs;

import java.util.Arrays;

public class merge_array_using_inbuilt_function {

	public static void main(String[] args) {
		 
		 int[] arr1= {2,5,6,4};
		 int[] arr2= {1,3,7,8};
		 int size = arr1.length+arr2.length;
		 int temp[] = new int[size];
		 //int j=0; 
		  
		 System.arraycopy(arr1, 0, temp, 0,arr1.length);
		 System.arraycopy(arr2, 0, temp, arr1.length,arr2.length);
		 Arrays.sort(temp);
		 System.out.println(Arrays.toString(temp));
	}
}
