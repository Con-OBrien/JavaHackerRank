package builtinquestions;

import javax.persistence.criteria.CriteriaBuilder;

public class Palindrome {
    public static void main(String[] args) {
        //Given an Integer, Return true if the integer is a palindrome
        //1. Using String Builder, we won't need a loop
        int number = 12345;
        int num = 6778776;
        StringBuilder input = new StringBuilder();

        input.append(number);
        input.reverse();
        System.out.println(input.toString().equals(Integer.toString(number)));
        input.setLength(0);

        input.append(num);
        input.reverse();
        System.out.println(input.toString().equals(Integer.toString(num)));

        //2. Let's try it with a loop
        int num1 = 18889;
        String num1String = Integer.toString(num1), emptyStr = "";
        char[] charArray = num1String.toCharArray();

        for(int i= charArray.length -1; i >= 0; i--) {
            emptyStr += charArray[i];
        }
        if(emptyStr.equals(Integer.toString(num1))) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
