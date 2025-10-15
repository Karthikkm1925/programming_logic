package com.array.programs;

import java.util.*; 
class  LeftRotateWithoutTemp_k_times {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Array Elements");
        for(int i =0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter K value");
        int k = sc.nextInt();
        
        if(k>size){
            k=k%size;
        }
        reverse(arr,0,k-1);
        reverse(arr,k,size-1);
        reverse(arr,0,size-1);
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] reverse(int[] arr, int start, int end )
    {
        while(start<end)
        {
            arr[start]=arr[start]+arr[end]-(arr[end]=arr[start]);
                start++;
                end--;
        }
        return arr;
    }
}
