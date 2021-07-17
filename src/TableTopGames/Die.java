package TableTopGames;

public class Die {
    int value;
    int numberOfSides;

    public Die() {
        this.value = 1;
        this.numberOfSides = 6;
    }

    public Die(int numberOfSides) {
        this.value = 1;
        this.numberOfSides = numberOfSides;
    }

    public void roll() {
        value = (int) Math.floor(Math.random() * numberOfSides) + 1;
    }
}