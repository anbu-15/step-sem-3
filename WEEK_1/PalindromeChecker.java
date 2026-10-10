package WEEK_1;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        //region PART A - Get Input

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        //endregion


        //region PART B - Call Methods and Print Results

        boolean iterativeResult = isPalindromeIterative(text);
        boolean recursiveResult = isPalindromeRecursive(text);
        boolean arrayResult = isPalindromeArrayReversal(text);

        System.out.println(
                "Iterative: " +
                        (iterativeResult ? "Palindrome" : "Not Palindrome")
        );

        System.out.println(
                "Recursive: " +
                        (recursiveResult ? "Palindrome" : "Not Palindrome")
        );

        System.out.println(
                "Array Reversal: " +
                        (arrayResult ? "Palindrome" : "Not Palindrome")
        );

        sc.close();

        //endregion
    }


    //region PART C - Iterative Palindrome Check

    public static boolean isPalindromeIterative(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    //endregion


    //region PART D - Recursive Palindrome Check

    public static boolean isPalindromeRecursive(String text) {

        return recursiveCheck(text, 0, text.length() - 1);
    }

    public static boolean recursiveCheck(String text, int left, int right) {

        // Base condition
        if (left >= right) {
            return true;
        }

        // Characters are different
        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }

        // Check next characters
        return recursiveCheck(text, left + 1, right - 1);
    }

    //endregion


    //region PART E - Array Reversal Palindrome Check

    public static boolean isPalindromeArrayReversal(String text) {

        char[] characters = text.toCharArray();

        int left = 0;
        int right = characters.length - 1;

        while (left < right) {

            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(characters);

        return text.equals(reversed);
    }

    //endregion
}