package org.hm;


import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = "Manner";
        String usersAnswer = "------";

        System.out.println("Guess: ");
        String guessStr = scanner.nextLine();
        char guessChar = (guessStr.charAt(0);

        for (int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);

            if (guessChar == c){
                usersAnswer.charAt(i) = guessChar;
            }
        }

    }

}
