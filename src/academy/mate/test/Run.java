package academy.mate.test;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        String first;
        String second;
        String symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write first value: ");
        first = scanner.nextLine().trim();
        System.out.print("Write symbol: ");
        symbol = scanner.nextLine().trim();
        System.out.print("Write second value: ");
        second = scanner.nextLine().trim();
        if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
            if (!Character.isDigit(first.charAt(0))) {
                if (!Character.isDigit(second.charAt(0))) {
                    new RomanCalculator(first, symbol, second);
                    scanner.close();
                } else {
                    System.err.println("Use the same type of numbers!!!");
                }
            } else {
                if (Character.isDigit(second.charAt(0))) {
                    new ArabicCalculator(first, symbol, second);
                    scanner.close();
                } else {
                    System.err.println("Use the same type of numbers!!!");
                }

            }
        } else {
            System.err.println("Wrong symbol!!");
        }
    }
}
