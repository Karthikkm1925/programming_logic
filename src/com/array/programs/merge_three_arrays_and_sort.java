package com.array.programs;
import java.util.Arrays;

public class merge_three_arrays_and_sort {
		 
		public static void main(String[] args) {
			 int[] arr1= {2,5,6,4};
			 int[] arr2= {1,3,7,8};
			 int[] arr3= {9,10,11,12};
			 int size = arr1.length+arr2.length+arr3.length;
			 int temp[] = new int[size];
			 int j=0; 
				
			for(int i=0;i<arr1.length;i++)
			{
				temp[j++] = arr1[i];
			}
			for(int i=0;i<arr2.length;i++)
			{
				temp[j++] = arr2[i];
			}
			for(int i=0;i<arr2.length;i++)
			{
				temp[j++] = arr3[i];
			}
			Arrays.sort(temp);
			System.out.println(Arrays.toString(temp));
		}
	}
