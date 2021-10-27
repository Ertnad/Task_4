package ru.vsu.sc.tretyakov_d_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sizeOfSequence = readNumber();

        if (sizeOfSequence > 2) {
            double sum = calculateSumOfSequence(sizeOfSequence);
            printResult(sum);
        }
    }

    private static double readNumber() {
        System.out.print("Enter the size of the numeric sequence - ");

        Scanner scn = new Scanner(System.in);
        double value = scn.nextDouble();

        if (value <= 2) {
            System.out.println("Sequence can be only more than 2");
            System.exit(1);
        }

        return value;
    }

    private static double calculateSumOfSequence(double sizeOfSequence) {
        double x1 = 1;
        double x2 = 0.3;
        double sum = x1 + x2;
        for (double i = 3; i <= sizeOfSequence; i++) {
            double xi = (i+1) * x1;
            x1 = x2;
            x2 = xi;
            sum += xi  ;
        }
        return sum;
    }

    private static void printResult(double sum) {
        System.out.printf("The result of adding a sequence = %s", sum);
    }
}