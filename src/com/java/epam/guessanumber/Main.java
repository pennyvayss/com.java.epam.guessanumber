package com.java.epam.guessanumber;

import static com.java.epam.guessanumber.TrysCount.guessingNumberGame;

public class Main {
    // Driver Code
    public static void main(String[] args) {
        UserNumber view = new UserNumber();
        TrysCount controller = new TrysCount(view);

            // Function Call
            guessingNumberGame();
        }
    }

