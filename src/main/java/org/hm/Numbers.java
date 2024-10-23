package org.hm;

public class Numbers {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;

        System.out.println(num1+num2);

        double result = (double) num1 / (double) num2;

        System.out.println(result);

        int num3 = 8;

        System.out.printf("Predicted 8, actual: %s\n", num3++);
        System.out.printf("Predicted 9, actual: %s\n", num3);
        System.out.printf("Predicted 10, actual: %s\n", ++num3);

    }
}
