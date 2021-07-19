package TableTopGames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to higher or lower");

        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("How many dice do you want to play Higher or Lower with?");
        int diceAmount = scan.nextInt();
        Cup cup = new Cup(diceAmount);
        Player player = new Player(name, cup);
        player.getCup(diceAmount);
        Cup.addDice(player.cup);
        Player.playHighLow(player);
    }
}
