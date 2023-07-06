package org.example;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        int lineCount = 0;

        while (scanner.hasNextLine()) {
            String inputLine = scanner.nextLine().trim();
            String[] inputsArray = inputLine.split("\\s+");

            if (inputsArray.length == 2) {
                String inputString = inputsArray[0];
                int inputNumber = Integer.parseInt(inputsArray[1]);

                // Width of 15 for strings, minimum of 3 characters wide, pad with 0s instead of spaces, break after each line
                System.out.printf("%-15s%03d%n", inputString, inputNumber);
                lineCount++;
            }
        }
        System.out.println("================================");
        scanner.close();
    }
}
