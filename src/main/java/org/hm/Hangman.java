package org.hm;


import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = "MANNER";
        String usersAnswer = "------";
        boolean gameOngoing = true;

        while (gameOngoing) {

            System.out.println("Guess: ");
            String guessStr = (scanner.nextLine()).toUpperCase();
            char guessChar = (guessStr.charAt(0));

            for (int i = 0; i < answer.length(); i++) {
                char c = answer.charAt(i);

                if (guessChar == c) {
                    usersAnswer = usersAnswer.substring(0, i) + guessChar + usersAnswer.substring(i + 1);
                    System.out.println(usersAnswer);
                }

                if (usersAnswer.equals(answer)) gameOngoing = false;
            }

        }

    }

}
