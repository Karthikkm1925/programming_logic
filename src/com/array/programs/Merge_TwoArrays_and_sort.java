package com.array.programs;

import java.util.Arrays;

public class Merge_TwoArrays_and_sort {
  public static void main(String[] args) {
	int[] arr1 = {2,4,5,7,8};
	int[] arr2 = {1,9,6,3,0};
	int size = arr1.length+arr2.length;
	int[] temp = new int[size];
	int j=0;
	for(int i = 0; i<arr1.length;i++)
	{
		temp[j++]=arr1[i];
	}
	for(int i = 0; i<arr2.length;i++)
	{
		temp[j++]=arr2[i];
	}
	Arrays.sort(temp);
	System.out.println("Sorted Array Elements: "+Arrays.toString(temp));
}
}
