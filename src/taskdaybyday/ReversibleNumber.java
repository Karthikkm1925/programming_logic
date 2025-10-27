package taskdaybyday;

import java.util.Scanner;

public class ReversibleNumber {

 
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }

    public static boolean allDigitsOdd(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) 
            	return false; 
            n /= 10;
        }
        return true;
    }

    public static boolean isReversible(int n) {
        int rev = reverse(n);
        int sum = n + rev;
        return allDigitsOdd(sum);
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter The Number");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(isReversible(n)); 
        // 63 -> 36 = 99 => true
    }
}

