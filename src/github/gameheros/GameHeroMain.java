package github.gameheros;

import java.util.Random;

public class GameHeroMain {

    public static void main(String[] args) throws InterruptedException {

        Hero King = new Knight("KING");
        Hero Queen = new Wizard("Queen");

        Random random = new Random();
        while (King.hp > 0 && Queen.hp > 0) {
            Boolean KingTurn = random.nextBoolean();
            Hero attacker = KingTurn ? King : Queen;
            Hero defender = KingTurn ? Queen : King;


            attacker.Attack(defender);
            Thread.sleep(1000);
        }
    }

}
