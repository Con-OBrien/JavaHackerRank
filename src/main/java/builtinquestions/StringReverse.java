package builtinquestions;

public class StringReverse {
    //Java function to reverse a string in-place without using additional memory
    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        reverseString(str);
        System.out.println(String.valueOf(str));
    }
    private static void reverseString(char[] str) {
        int left = 0;
        int right = str.length - 1;

        while(left < right) {
            char temporary = str[left];
            str[left] = str[right];
            str[right] = temporary;
            left++;
            right--;
        }
    }
}
