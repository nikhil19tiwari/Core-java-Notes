package guessergame;

import java.util.Scanner;

public class Guesser {

    int guesserNumber;

    public int guessNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Guesser Guess your Number :- " );
        guesserNumber = sc.nextInt();

        return guesserNumber;
    }


}
