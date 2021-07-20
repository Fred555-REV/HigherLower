package TableTopGames;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to higher or lower");

        System.out.println("What is your name?");
        String name = scan.next();
        Player player = new Player(name);

        Player.playHighLow(player);
    }
}
