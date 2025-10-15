package com.array.programs;
import java.util.*;
public class merge_arrays_alternativly {
	
	public static void main(String[] args) {
		
		//Note if all arrays size is same then do this 
	
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		int[] c = {11,12,13,14,15};
		
		int[] finalArray = new int[a.length+b.length+c.length];
		int j=0;
		
		for(int i = 0;i<a.length;i++) {
			if(j<finalArray.length)
			finalArray[j++]=a[i];
			finalArray[j++]=b[i];
			finalArray[j++]=c[i];
		}
		
		System.out.println(Arrays.toString(finalArray));
	}
		
}
