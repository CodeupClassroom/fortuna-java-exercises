import util.Input;

import java.util.Scanner;

/**
 * This is a class to test the Input utility
 */
public class InputTest {
    public static void main(String[] args) {
        String prompt;
        Scanner scanner = new Scanner(System.in);
        Input.setScanner(scanner);

        try {
            System.out.println();
            prompt = "Enter a String: ";
            String s = Input.getString(prompt);
            System.out.printf("getString(prompt): %s%n", s);
            System.out.print(prompt);
            s = Input.getString();
            System.out.printf("getString(): %s%n", s);

            System.out.println();
            prompt = "Enter Yes or No: ";
            boolean b = Input.yesNo(prompt);
            System.out.printf("yesNo(prompt): %b%n", b);
            System.out.print(prompt);
            b = Input.yesNo();
            System.out.printf("yesNo() no prompt: %b%n", b);

            System.out.println();
            prompt = "Enter an Integer: ";
            int anInt = Input.getInt(prompt);
            System.out.printf("getInt(prompt): %d%n", anInt);
            System.out.print(prompt);
            anInt = Input.getInt();
            System.out.printf("getInt(): %d%n", anInt);

            System.out.println();
            int iMin = 5, iMax = 12;
            prompt = String.format("Enter an Integer between %d and %d: ", iMin, iMax);
            anInt = Input.getInt(iMin, iMax, prompt);
            System.out.printf("getInt(iMin, iMax, prompt): %d%n", anInt);
            System.out.print(prompt);
            anInt = Input.getInt(iMin, iMax);
            System.out.printf("getInt(iMin, iMax): %d%n", anInt);

            System.out.println();
            prompt = "Enter a number: ";
            double aDouble = Input.getDouble(prompt);
            System.out.printf("getDouble(prompt): %f%n", aDouble);
            System.out.print(prompt);
            aDouble = Input.getDouble();
            System.out.printf("getDouble(): %f%n", aDouble);

            System.out.println();
            double dMin = 5.3, dMax = 12.7;
            prompt = String.format("Enter an number between %.2f and %.2f: ", dMin, dMax);
            aDouble = Input.getDouble(dMin, dMax, prompt);
            System.out.printf("getDouble(dMin, dMax, prompt): %f%n", aDouble);
            System.out.print(prompt);
            aDouble = Input.getDouble(iMin, iMax);
            System.out.printf("getDouble(dMin, dMax): %f%n", aDouble);
        } catch (Exception e) {
            System.out.print("The scanner is not open!");
        }
    }
}
