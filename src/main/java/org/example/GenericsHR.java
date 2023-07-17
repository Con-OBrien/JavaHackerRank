package org.example;

public class GenericsHR {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        printArray(intArray);
        printArray(stringArray);
    }

    public static < E > void printArray(E[] inputArray) {
        for(E element: inputArray) {
            System.out.println(element);
        }
    }
}
