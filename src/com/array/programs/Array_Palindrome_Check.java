package com.array.programs;

import java.util.*;
class Array_Palindrome_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Array Elements");
        for(int i =0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        if(palindrome(arr))
        System.out.println("Yes, Array is Palindrome");
        else
        System.out.println("No , Array is Not Palindrome");
    }
    
    public static boolean palindrome(int[] arr){
        
        int i=0;
        int j=arr.length-1;
        boolean flag = true;
        while(i<j){
            if(arr[i]!=arr[j]){
            flag=false;
            break;
            }
            i++;
            j--;
        }
        return flag;
    }
}
