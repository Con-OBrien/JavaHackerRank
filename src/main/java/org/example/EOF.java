package org.example;

import java.util.*;

public class EOF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lineNo = 1;
        while(s.hasNextLine()) {
            System.out.println(lineNo + " " + s.nextLine());
            lineNo++;
        }
    }
}
