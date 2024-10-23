package org.hm;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s!\n", name);

        System.out.println("Please input number1: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Please input number2: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        int num3 = num1 + num2;
        System.out.printf("Sum is: %s", num3);

    }
}
