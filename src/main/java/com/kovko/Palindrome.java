package com.kovko;

public class Palindrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindromeSuboptimal("kayak"));
    }


    public static boolean isPalindrome(String palindrome) {
        final int start = 0;
        final int end = palindrome.length() - 1;
        return isPalindrome(palindrome, start, end);
    }

    public static boolean isPalindrome(String palindrome, int start, int end) {
        if (palindrome.isEmpty()) {
            return false;
        }
        if (start == end) {
            return true;
        }
        if (palindrome.charAt(start) == palindrome.charAt(end)) {
            return isPalindrome(palindrome, start + 1, end - 1);
        } else {
            return false;
        }
    }

    public static boolean isPalindromeSuboptimal(String palindrome) {
        if (palindrome.length() <= 1) {
            return true;
        }
        final int lastElement = palindrome.length() - 1;
        if (palindrome.charAt(0) == palindrome.charAt(lastElement)) {
            return isPalindrome(palindrome.substring(1, lastElement));
        } else {
            return false;
        }
    }

}
