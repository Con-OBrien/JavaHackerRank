package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lines = scanner.nextLine();
        String[] arrays = new String[Integer.parseInt(lines)];
        ArrayList<int[]> arrs = new ArrayList<>();

        for(int i=0; i<Integer.parseInt(lines);i++) {
            String arr = scanner.nextLine();
            int[] intArray = Arrays.stream(arr.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            arrs.add(intArray);
        }

        String query = scanner.nextLine();

        for(int i=0; i<Integer.parseInt(query);i++) {
            String q = scanner.nextLine();
            int[] intArray = Arrays.stream(q.split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            int line = intArray[0];
            int index = intArray[1];
            int[] q_Arr = arrs.get(line);

            if(index<=q_Arr.length) {
                System.out.println(q_Arr[index]);
            }
            else {
                System.out.println("ERROR !");
            }
        }

    }
}
