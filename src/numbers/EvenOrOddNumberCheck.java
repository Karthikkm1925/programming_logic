package numbers;

import java.util.Scanner;

public class EvenOrOddNumberCheck {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int num = s.nextInt();
		
		System.out.println("Using % operator");
		System.out.println((num%2==0)?"Even":"Odd");
		
		System.out.println("using bitwise AND operator");
		System.out.println(((num&1)==0) ? "Even" : "Odd");
		
		System.out.println("XOR operator"); 
		System.out.println(((num^1)>num) ? "Even" : "Odd");
		
		System.out.println("Shift Operator");
		System.out.println((num == (num>>1)<<1)?  "Even" : "Odd");
	}
}
