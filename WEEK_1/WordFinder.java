package WEEK_1;

public class WordFinder {

    public static String[] findShortestAndLongestWord(String text) {


        //region PART B -Removing Punctuation and Unwanted Spaces

        // Remove punctuation/special characters so they are not treated
        // as part of a word while calculating the word length
        text = text.replaceAll("[^a-zA-Z0-9\\s]", "");

        // Remove unwanted spaces from the beginning and end of the text
        // so that we can safely split the text into individual words
        text = text.trim();

        //endregion


        //region PART C - Convert the Sentence into Individual Words for Comparison

        // Split the sentence wherever one or more spaces are present
        // and store all the individual words inside a String array
        String[] words = text.split("\\s+");

        //endregion


        //region PART D - Assume the First Word is Both the Shortest and Longest Initially

        // We need starting values before comparing the remaining words.
        // Therefore, use the first word as the initial shortest word.
        String shortest = words[0];

        // Use the same first word as the initial longest word.
        // These values will change when we find shorter or longer words.
        String longest = words[0];

        //endregion


        //region PART E - Compare Every Word and Update the Shortest and Longest Words

        // Visit every word in the array one by one
        // and compare its length with the current shortest and longest words
        for (String word : words) {

            // If the current word is smaller than the shortest word found so far,
            // update shortest with the current word
            if (word.length() < shortest.length()) {
                shortest = word;
            }

            // If the current word is bigger than the longest word found so far,
            // update longest with the current word
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        //endregion


        //region PART F - Return Both the Shortest and Longest Words to the Caller

        // Store both answers in an array:
        // index 0 = shortest word
        // index 1 = longest word
        return new String[]{shortest, longest};

        //endregion
    }


    public static void main(String[] args) {


        //region PART A - Provide the Sentence in Which We Want to Find the Shortest and Longest Words

        // This is the input sentence that will be processed by our program
        String text = "Java is an object oriented programming language";

        //endregion


        //region PART G - Send the Input Text to the Method and Store the Returned Result

        // Call our method and pass the complete sentence.
        // The returned array contains both the shortest and longest words.
        String[] result = findShortestAndLongestWord(text);

        //endregion


        //region PART H - Display the Shortest and Longest Words Along with Their Lengths

        // result[0] contains the shortest word
        System.out.println(
                "Shortest: \"" + result[0] + "\" (" + result[0].length() + ")"
        );

        // result[1] contains the longest word
        System.out.println(
                "Longest: \"" + result[1] + "\" (" + result[1].length() + ")"
        );

        //endregion
    }
}