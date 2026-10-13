package WEEK_1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        //region PART 1 - Basic Setup

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0;
        int losses = 0;
        int draws = 0;

        //endregion


         //region PART 2 - Play 5 Rounds

        for (int i = 1; i <= 5; i++) {

            //region PART 2.1 - Get Player's Move

            System.out.print("Enter Rock, Paper or Scissors: ");
            String player = sc.nextLine();

            //endregion
            //region PART 2.2 - Generate Computer's Move

            String computer = moves[random.nextInt(3)];

            //endregion


            //region PART 2.3 - Determine the Winner

            String result;

            if (player.equalsIgnoreCase(computer)) {
                result = "Draw";
//                draws++;
            }
            else if (
                    (player.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) ||
                            (player.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ||
                            (player.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper"))
            ) {
                result = "Player Wins";
            }
            else {
                result = "Computer Wins";
            }

            //endregion

            //region PART 2.4 - Display Current Round

            System.out.println("Round: " + i);
            System.out.println("Player: " + player);
            System.out.println("Computer: " + computer);
            System.out.println("Result: " + result);

            //endregion


            //region PART 2.5 - Count Wins, Losses and Draws

            if (result.equals("Player Wins")) {
                wins++;
            }
            else if (result.equals("Computer Wins")) {
                losses++;
            }
            else {
                draws++;
            }
            System.out.println();
            //endregion
        }
        //endregion

        //region PART 3 - Calculate Win Percentage

        double winPercentage = (wins * 100.0) / 5;

        //endregion


        //region PART 4 - Print Final Result

        System.out.println("----- Final Result -----");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");

        //endregion


        //region PART 5 - Close Scanner

        sc.close();

        //endregion
    }
}