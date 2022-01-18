package com.java.epam.guessanumber;



public class UserNumber {




    public static final String YOU_GUESSED = "Congratulations!"
            + " You guessed the number.";
    public static final String GUESS_THE_NUMBER = "Guess the number: ";
    public static final String OPENING_TITLE = "A number is chosen\"\n" +
            "            + \" between 1 to 100.\"\n" +
            "            + \"Guess the number\"\n" +
            "            + \" within 5 trials.\")";
    public static final String THE_NUMBER_IS_GREATER = " \"The number is greater than";
    public static final String THE_NUMBER_IS_LESS = "The number is less than ";
    public static final String YOU_HAVE_EXHAUSTED = "You have exhausted K trials.";
    public static final String THE_NUMBER_WAS = "The number was: ";
    public static final String WRONG_NUMBER = "Wrong number! Repeat please!";



    public void printMessage(String message) {
        System.out.println(message);
    }

}