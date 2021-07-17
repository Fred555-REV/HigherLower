package TableTopGames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to higher or lower");
        Cup cup = new Cup(3);

        System.out.println("What is your name?");
        String name = scan.next();

        Player player = new Player(name, cup);
        player.getCup(3);
        Cup.addDice(player.cup);
        Player.playHighLow(player);
    }
}
