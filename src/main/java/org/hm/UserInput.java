package org.hm;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Input last name: ");
        String lastName = scanner.nextLine();

        System.out.printf("Hello %s!\n", (firstName + " " + lastName));

        System.out.println("Please input number1: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Please input number2: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        int num3 = num1 + num2;
        System.out.printf("Sum is: %s", num3);

    }
}
