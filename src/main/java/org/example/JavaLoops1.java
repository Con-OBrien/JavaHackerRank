package org.example;

import java.io.*;

public class JavaLoops1 {
    public static void main(String[] args) throws IOException {
        //Create BufferedReader to read user input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //Translate user input to integer
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int m=1;

        //Loop through 1 to 10, get the multiplication value of each input * by each iterative value
        for(int i=1; i<=10;i++)
        {
            m=N*i;
            System.out.printf("%d x %d = %d %n",N,i,m);
        }
        //Close the BufferedReader
        bufferedReader.close();
    }
}