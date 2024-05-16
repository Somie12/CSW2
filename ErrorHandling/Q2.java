package ErrorHandling;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s == null || s.isEmpty()) {
            throw new NullPointerException("Error: Input string is null or empty.");
        }
        boolean found = false;
        for (int i = 2; i < s.length(); i++) {
            char prevChar = s.charAt(i - 2);
            char currChar = s.charAt(i);
            if (isVowel(prevChar) && Character.isAlphabetic(s.charAt(i - 1)) && Character.isDigit(currChar)) {
                System.out.print(currChar);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No numeric characters found that are preceded by a vowel and consonant.");
        }
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}