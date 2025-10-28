package taskdaybyday;

import java.util.*;

class VowelPuzzleNoInbuilt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();

        if (isValid(word))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    static boolean isVowel(char ch) {
        // manually check without contains()
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }

    static boolean isValid(String w) {
        if (w.length() < 3)  // at least 3 letters to have inside vowels
            return false;

        // check start and end vowels
        if (!isVowel(w.charAt(0)) || !isVowel(w.charAt(w.length()-1)))
            return false;

        // count inside vowels
        int insideCount = 0;
        for (int i = 1; i < w.length()-1; i++) {
            if (isVowel(w.charAt(i))) {
                insideCount++;
            }
        }

        // must have exactly 2 vowels inside
        return insideCount == 2;
    }
}

