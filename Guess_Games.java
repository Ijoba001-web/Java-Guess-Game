import java.util.Scanner;

public class Guess_Games {
    public static void main(String[] args) {

        int i;
        int x = 4;
        int trial = 4;

        System.out.println("WELCOME TO JUMANJI WORD GAME");
        System.out.println("1. CLICK START");
        System.out.println("2. EXIT");

        Scanner accepts = new Scanner(System.in);

        int decision = accepts.nextInt();

        String storage = "Emmanuel";

        for (i = 0; i < x; i++) {

            if (decision == 1) {
                System.out.println("HINT!:{HoD oF SoFtWaRe EnGiNeErInG} {guess should be in Upper.lowercase} ");
                System.out.println("MAKE A GUESS: ");

                String guess = accepts.nextLine();

                if (guess != storage) {
                    System.out.println("You Guessed Wrongly");
                    trial = trial - 1;
                    System.out.println("You have" + " " + trial + ", " + "number of trials left");

                }

                if (guess == storage) {
                    System.out.println("You Have Guessed Correctly");
                    break;
                }

            }

            else

            {
                break;
            }
        }

    }
}