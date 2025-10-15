package com.array.programs;
import java.util.*; 
class  KthRootOfArrayElements {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Array Elements");
        for(int i =0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the root value ");
        int k = sc.nextInt();
        for(int i=0;i<size;i++){
        System.out.print(Heroins(arr[i],k)+",");
        }        
    }
        public static double Heroins(double n,int k){
            
            double x=n;
            if(n==0||n==1){
                return n;
            } 
            // adjust presion with range properly 10 - 20 is fine
            for(int i=0;i<15;i++){
                //x=0.5*(x+n/x); //for square root 
            x = ((k-1)*x+n/Math.pow(x,k-1))/k ;//K th root k=2,3..
            }
            return x;
        } 
}
