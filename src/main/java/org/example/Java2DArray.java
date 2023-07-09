package org.example;

import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) {
        int[][] grid = new int[5][5];

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String[] line = scanner.nextLine().replaceAll("\\s+$","").split(" ");
            System.out.println(line);
        }

        System.out.println(grid[0][0]);


    }
}
