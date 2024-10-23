package org.hm;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class Hangman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rn = new Random();
        int randN = rn.nextInt(4000) + 1;

        //String answer = "";
        try {
            String answer = Files.readAllLines(Paths.get("4000-most-common-english-words-csv.txt")).get(randN);

            StringBuilder dashes = new StringBuilder();
            for (int i = 0; i < answer.length(); i++){
                dashes.append("-");
            }

            String dashesStr = dashes.toString();

            boolean gameOngoing = true;

            while (gameOngoing) {
                System.out.println(dashesStr.length());
                System.out.println("Guess: ");
                String guessStr = (scanner.nextLine()).toUpperCase();
                char guessChar = (guessStr.charAt(0));

                for (int i = 0; i < answer.length(); i++) {
                    char c = answer.charAt(i);

                    if (guessChar == c) {
                        dashesStr = dashesStr.substring(0, i) + guessChar + dashesStr.substring(i + 1);
                        System.out.println(dashesStr);
                    }

                    if (dashesStr.equals(answer)) gameOngoing = false;
                }

            }
        }
        catch(IOException e){
            System.out.println(e);
        }

    }

}
