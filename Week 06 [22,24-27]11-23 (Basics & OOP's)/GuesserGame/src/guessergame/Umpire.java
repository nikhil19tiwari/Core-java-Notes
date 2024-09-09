package guessergame;

public class Umpire {

    int guesserNumber;
    int playerNumber1;
    int playerNumber2;
    int playerNumber3;

    public void collectNumberFromGuesser(){

        Guesser guesser = new Guesser();
        guesserNumber = guesser.guessNumber();

    }

    public void collectNumberFromPlayers(){

        Player player1 = new Player();
        playerNumber1 = player1.playerNumber(1);

        Player player2 = new Player();
        playerNumber2 = player2.playerNumber(2);

        Player player3 = new Player();
        playerNumber3 = player3.playerNumber(3);
    }


    public void comparePlayerNumberWithGuesserNumber(){

        if (playerNumber1 == guesserNumber) {

            if(playerNumber2 == guesserNumber && playerNumber3 == guesserNumber){
                System.out.println("Player 1, Player 2 and Player 3 are winner");
            } else if(playerNumber2 == guesserNumber){
                System.out.println("Player 1 and Player 2 are winner");
            } else if(playerNumber3 == guesserNumber){
                System.out.println("Player 1 and Player 3 are winner");
            }else{
                System.out.println("Player 1 is winner");
            }

        } else if (playerNumber2 == guesserNumber) {

            if(playerNumber3 == guesserNumber){
                System.out.println("Player 2 and Player 3 are winner");
            }else{
                System.out.println("Player 2 is winner");
            }
        } else if (playerNumber3 == guesserNumber) {
            System.out.println("Player 3 is winner");
        } else {
            System.out.println("No one is winner");
        }
    }


}
