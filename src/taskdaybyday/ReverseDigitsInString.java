package taskdaybyday;

public class ReverseDigitsInString {
    public static String reverseDigits(String s) {
        // Step 1: collect all digits
        String digits = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                digits += ch; // collect digits
            }
        }

        // Step 2: reverse digits
        String reversedDigits = "";
        for (int i = digits.length() - 1; i >= 0; i--) {
            reversedDigits += digits.charAt(i);
        }

        // Step 3: build output string
        String result = "";
        int digitIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                result += reversedDigits.charAt(digitIndex);
                digitIndex++;
            } else {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str1 = "a1b2c3";
        String str2 = "ab12cd34";

        System.out.println(reverseDigits(str1)); // Output: "a3b2c1"
        System.out.println(reverseDigits(str2)); // Output: "ab43cd21"
    }
}

