package com.kovko;

public class RevertString {

    public static void main(String[] args) {
        System.out.println(revertString("hello"));
    }

    public static String revertString(String string) {
        if (string.isEmpty()) {
            return "";
        }
        return revertString(string.substring(1)) + string.charAt(0);
    }

}
