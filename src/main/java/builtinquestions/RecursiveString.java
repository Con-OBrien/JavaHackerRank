package builtinquestions;

public class RecursiveString {
    public static void main(String[] args) {
        //Given a string, return the length of the string using recursion
        String input = "Hello world!";
        int total = 0;

        total += recursiveLength(input);

        System.out.println(recursiveLength(input));
    }
    private static int recursiveLength(String input) {
        return 0;
    }

}
