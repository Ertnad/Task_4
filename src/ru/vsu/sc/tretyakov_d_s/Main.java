package ru.vsu.sc.tretyakov_d_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double n = readNumber();
        double sum = calculateSumOfSequence(n);
        printResult(sum);
    }

    private static double readNumber() {
        System.out.print("Enter the value of n - ");

        Scanner scn = new Scanner(System.in);
        double value = scn.nextDouble();

        if (value <= 0) {
            System.out.println("n can be only more than 0");
            System.exit(1);
        }

        return value;
    }

    private static double getFactorial(double n) {
        double result = 1;
        for (double i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    private static double pow(double index) {
        double result = 1;
        for (int i = 0; i < index; i++) {
            result *= -1;
        }
        return result;
    }

    private static double calculateSumOfSequence(double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            double numerator = pow(i) * (i + 1); // числитель
            double denominator = getFactorial(n); // знаменатель
            sum += numerator/denominator ;
        }
        return sum;
    }

    private static void printResult(double sum){
        System.out.printf("The result of adding a sequence = %s", sum);
    }
}
