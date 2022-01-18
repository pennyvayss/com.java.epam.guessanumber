package com.java.epam.guessanumber;

import java.util.Scanner;


public class TrysCount {

    public static UserNumber view;


    public TrysCount(UserNumber view) {
        this.view = view;
    }
    //Work method
    // Function that implements the
    // number guessing game
    public static void
    guessingNumberGame()
    {
         //Scanner Class
        Scanner sc = new Scanner(System.in);
        //Generate the numbers
        int number = 1 + (int) (100 * Math.random());

            //Given 10 trials
        int K = 10;

        int i, guess;

        view.printMessage(UserNumber.OPENING_TITLE);

        // Iterate over K Trials
        for (i = 0; i < K; i++) {
            view.printMessage(UserNumber.GUESS_THE_NUMBER );
            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                view.printMessage(UserNumber.YOU_GUESSED);
                break;
            }
            else if (number > guess
                    && i != K - 1) {
                view.printMessage((UserNumber.THE_NUMBER_IS_GREATER)+ guess);

            }
            else if (number < guess
                    && i != K - 1) {
               view.printMessage((UserNumber.THE_NUMBER_IS_LESS) + guess);
            }
            else if ( !sc.hasNextInt()) {
                view.printMessage( UserNumber.WRONG_NUMBER +guess);
            }
        }
        if (i == K) {
            view.printMessage(UserNumber.YOU_HAVE_EXHAUSTED);
            view.printMessage((UserNumber.THE_NUMBER_WAS) + number);
        }

    }


}
