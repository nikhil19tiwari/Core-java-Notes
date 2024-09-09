package guessergame;

import java.util.Scanner;

public class Player {

    int playerNumber;

    public int playerNumber(int playerNumber){
        Scanner sc = new Scanner(System.in);

        System.out.println("Player " + playerNumber + " Guess your Number :- " );
        this.playerNumber = sc.nextInt();

        return this.playerNumber;
    }

}
