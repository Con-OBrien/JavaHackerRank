package org.example;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {

        //Scan
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        //String conversion
        String s = Integer.toString(n);

        //Check
        if(s.equals(Integer.toString(n))) {
            System.out.println("Good job"); }
        else {
            System.out.println("Wrong answer"); }

    }
}
