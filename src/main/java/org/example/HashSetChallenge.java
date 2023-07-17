package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input - First line = integer denoting # of pairs
        int n = scanner.nextInt();
        HashSet<String> set = new HashSet<>();

        //each next pair is marked by first and second
        //if our set doesn't contain the pair, then we add it
        //at the end of each pair, prints how many unique pairs there are
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
