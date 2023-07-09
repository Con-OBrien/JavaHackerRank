package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String listAsString = scanner.nextLine();

        String queries = scanner.nextLine();
        int queriesNum =Integer.parseInt(queries);

        String[] strings = listAsString.split(" ");
        List<Integer> list = new ArrayList<>();
        for(String string: strings) {
            list.add(Integer.parseInt(string));
        }
        for(int i=0; i < queriesNum; i++) {
            String operation = scanner.nextLine();
            String valueIndex = scanner.nextLine();
            String[] stringNums= valueIndex.split(" ");

            if(operation.equals("Insert")) {
                list.add(Integer.parseInt(stringNums[0]),Integer.parseInt(stringNums[1]));
            }
            else if(operation.equals("Delete")) {
                list.remove(Integer.parseInt(valueIndex));
            }
        }
        for(Integer num: list) {
            System.out.print(num+" ");
        }
        scanner.close();
    }
}
