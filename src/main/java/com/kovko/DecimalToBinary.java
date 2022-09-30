package com.kovko;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
    }

    public static String decimalToBinary(int number) {
        if (number == 0) {
            return "";
        }
        return "" + decimalToBinary(number / 2) + number % 2;
    }
}
