package org.example;

import java.util.Scanner;
import java.util.TreeMap;

public class JavaMapPhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine(); //Number of entries in a line

        TreeMap<String, String> A = new TreeMap<>();

        for(int i = 0; i < Integer.parseInt(n); i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();

            A.put(name, phoneNumber);
        }

        while(scanner.hasNextLine()) {
            String query = scanner.nextLine();
            if(A.containsKey(query)) {
                System.out.println(query+"="+A.get(query));
            }
            else {
                System.out.println("Not found");
            }
        }
    }

}
