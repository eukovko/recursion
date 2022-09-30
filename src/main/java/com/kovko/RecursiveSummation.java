package com.kovko;

public class RecursiveSummation {

    public static void main(String[] args) {
        System.out.println(sumRecursively(10));
    }

    public static int sumRecursively(int number) {
        if (number <= 1) {
            return number;
        }
        return number + sumRecursively(number - 1);
    }
}
