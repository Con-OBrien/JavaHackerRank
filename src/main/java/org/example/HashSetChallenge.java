package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String first = scanner.next();
            String second = scanner.next();

            String pair = first + " " + second;
            if (!set.contains(pair)) {
                set.add(pair);
            }

            System.out.println(set.size());
        }


    }
}
