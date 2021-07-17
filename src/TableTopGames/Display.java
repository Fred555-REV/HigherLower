package TableTopGames;

import java.util.ArrayList;
import java.util.List;

public class Display {
    public static List<Player> players = new ArrayList<>();

    public static void players() {
        for (Player player : players) {
            System.out.println(player.name);
        }
    }

    public static void score(Player player) {
        System.out.println(player.score);
    }

    public static int cupTotal(Player player) {
        int total = 0;
        for (Die die : player.cup.dice) {
            total += die.value;
        }
        return total;
    }
}
