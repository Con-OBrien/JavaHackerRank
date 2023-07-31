package builtinquestions;

public class FindFactorialRecursion {
    //Java program to find the factorial of a given positive integer using recursion
    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println(num + ": " + result);
    }
    private static int factorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        else {
            return num * factorial(num - 1);
        }
    }
}
