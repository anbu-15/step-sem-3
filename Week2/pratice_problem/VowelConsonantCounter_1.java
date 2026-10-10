package Week2.pratice_problem;

import java.util.Scanner;

public class VowelConsonantCounter_1 {

    // Method to count vowels and consonants
    public static void countVowelsAndConsonants(String text) {
        text = text.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch != ' ' || ch != '@') {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        //Java Programming
        String text = sc.nextLine();
        countVowelsAndConsonants(text);
        sc.close();
    }
}