package TableTopGames;

import java.util.Scanner;

public class Player {
    Cup cup;
    String name;
    int score;
    int winStreak;

    public Player(String name, Cup cup) {
        this.name = name;
        this.score = 0;
        this.winStreak = 0;
    }

    public void getCup(int diceAmount) {
        this.cup = new Cup(diceAmount);
    }

    public static void playHighLow(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The values go from " + player.cup.dice.length + " to " + (player.cup.dice.length * 6));
        boolean didLose = false;
        player.cup.rollAll();
        player.score = 0;
        while (!didLose) {
            System.out.println();
            int total = player.cup.total();
            int newTotal;
            System.out.println(total);
            System.out.println("Higher or lower? enter: h/l");
            String inputHL = scan.next();
            player.cup.rollAll();
            newTotal = player.cup.total();
            System.out.println(newTotal);
            boolean isLarger = newTotal > total;
            if (inputHL.equals("h")) { //guessed higher
                if (!isLarger) {
                    didLose = true;
                    System.out.println("Sorry you lost");
                } else {
                    System.out.println("\nYou won");
                    player.score += 1;
                }
            } else { //guessed lower
                if (isLarger || total == newTotal) {
                    didLose = true;
                    System.out.println("Sorry you lost");
                } else {
                    System.out.println("\nyou won");
                    player.score += 1;
                }

            }
            System.out.println("Your score is " + player.score);
            if (player.score > player.winStreak) {
                player.winStreak = player.score;
            }
            System.out.println("Your win streak is " + player.winStreak);
        }
        System.out.println("Want to play again? enter y/n");
        String playAgain = scan.next();
        if (playAgain.equalsIgnoreCase("y")) {
            Player.playHighLow(player);
        } else {
            System.out.println("Good Bye");
        }
    }
}
