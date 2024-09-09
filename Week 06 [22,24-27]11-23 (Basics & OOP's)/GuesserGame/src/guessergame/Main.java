package guessergame;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Guesser Game");

        Umpire umpire = new Umpire();
        umpire.collectNumberFromGuesser();
        umpire.collectNumberFromPlayers();
        umpire.comparePlayerNumberWithGuesserNumber();

        System.out.println("Thank you for playing Guesser Game");

    }
}