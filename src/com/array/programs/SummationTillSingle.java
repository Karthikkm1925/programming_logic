package com.array.programs;

public class SummationTillSingle {
public static void main(String[] args) {
	int [] arr = {1,2,4,5,7,3};
	int sum = 0;
	for(int i = 0; i<arr.length;i++) {
		sum+=arr[i];
	}
	System.out.println("Array Elements total sum is: "+sum);
	while(sum>9) {
		sum=numSum(sum);
	}
	System.out.println("Getting Single digit: "+sum);
}
	static int numSum(int no) {
		int sum=0;
		int rem = no%10;
		sum+=rem;
		no=no/10;
		return sum;
	}

}