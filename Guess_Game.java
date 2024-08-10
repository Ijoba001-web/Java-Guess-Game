import java.util.Scanner;

public class Guess_Game {
    public static void main(String[] args) {

        Scanner allows = new Scanner(System.in);

        String storage = new String("emmanuel");

        System.out.println("WELCOME TO JUMANJI WORD GAME");
        System.out.println("1. CLICK START");
        System.out.println("2. EXIT");

        int x = 4;
        int i;
        int trial = 5;

        int decision = allows.nextInt();

        try {
            for (i = 1; i < x; i++) {

                if (decision == 1)

                {
                    System.out.println("HINT!:{HoD oF SoFtWaRe EnGiNeErInG} {guess should be in lowercase} ");
                    System.out.println("MAKE A GUESS: ");

                    String guess = allows.nextLine();

                    if (guess == storage) {
                        System.out.println("You Have Guessed Correctly");
                        break;
                    }

                    else {
                        System.out.println("You Guessed Wrongly");
                        i = i + 1;
                        trial = trial - 1;
                        System.out.println("You have" + " " + trial + ", " + "number of trials left");
                    }
                } else

                {
                    break;
                }
            }
        }

        catch (Exception e) {
            System.out.println("Wrong input, try again");
            trial = trial - 1;
            System.out.println("You have" + " " + trial + ", " + "number of trials left");

        }

        if (trial == 0) {
            System.out.println("You Have Ran Out Of Guesses");
            System.out.println("GAME OVER!");

        }

    }
}