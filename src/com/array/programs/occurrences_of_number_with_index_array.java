package com.array.programs; 

import java.util.*;
class  occurrences_of_number_with_index_array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Array Elements");
        for(int i =0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        int occurance =0;
        for(int i=0; i<size;i++){
            if(arr[i]==num)
            occurance++;
        }
        System.out.print("The given Number "+num+" is repeated for "+occurance+" time at index ");
       for(int i=0; i<size;i++){
            if(arr[i]==num)
            System.out.print(i+" ");
        }
    }
}