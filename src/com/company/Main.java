package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] usersDigits = getUsersFourDigits().toCharArray();
        int sum = -1;
        if (checkRow(usersDigits)) {
            sum = 0;
            for (char c : usersDigits) {
                sum += Character.getNumericValue(c);
            }
            System.out.println("Sum of your digits is: " + sum);
        }


    }

    public static String getUsersFourDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your four digits(****): ");
        return scanner.nextLine();
    }

    public static boolean checkRow(char[] digits) {
        if (digits.length != 4) {
            System.out.println("You made a mistake! You wrote a wrong number of symbols.");
            return false;
        }
        for (char c : digits) {
            if (!Character.isDigit(c)) {
                System.out.println("There is a spy among our digits!");
                return false;
            }
        }
        return true;
    }
}
