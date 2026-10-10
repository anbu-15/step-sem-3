package WEEK_1;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueLetterHunt {


    //region PART B - Count Character Frequency

    public static HashMap<Character, Integer> countFrequency(String text) {

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char ch : text.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        return frequency;
    }

    //endregion


    //region PART C & D - Find First Non-Repeating Character

    public static char findFirstNonRepeatingChar(
            String text,
            HashMap<Character, Integer> frequency) {

        for (char ch : text.toCharArray()) {

            if (frequency.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    //endregion


    public static void main(String[] args) {


        //region PART A - Get Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        //endregion


        //region PART E - Call Methods

        HashMap<Character, Integer> frequency = countFrequency(text);

        char result = findFirstNonRepeatingChar(text, frequency);

        //endregion


        //region PART F - Display Result

        if (result != '\0') {
            System.out.println(
                    "First Non-Repeating Character: '" + result + "'"
            );
        } else {
            System.out.println(
                    "No Non-Repeating Character Found"
            );
        }

        //endregion

        //region PART G - Display Result
        sc.close();
        //endregion
    }
}