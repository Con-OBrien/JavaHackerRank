package org.example;

import java.io.IOException;
import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String []argh) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // number of queries
        int q = scanner.nextInt();

        // loop through each query
        for (int i = 0; i < q; i++) {
            // values for each query as per equation
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            // calculate, a is constant, 2^each iterative version * b is added each time loop is run
            int result = a;
            for (int j = 0; j < n; j++) {
                result += Math.pow(2, j) * b;
                System.out.print(result + " ");
            }

            System.out.println(); // next query
        }
        scanner.close();
    }
}
