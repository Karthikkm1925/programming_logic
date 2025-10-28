package taskdaybyday;

import java.util.*;

public class VowelPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();

        if (isValid(word))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    static boolean isValid(String w) {
        String vowels = "aeiou";

        // Rule 1: start and end with vowel
        if (w.length() < 3 || !vowels.contains(w.charAt(0)+"") || !vowels.contains(w.charAt(w.length()-1)+""))
            return false;

        // Rule 2: count vowels inside (excluding first and last)
        int insideCount = 0;
        for (int i = 1; i < w.length()-1; i++) {
            if (vowels.contains(w.charAt(i)+""))
                insideCount++;
        }

        return insideCount == 2;
    }
}

