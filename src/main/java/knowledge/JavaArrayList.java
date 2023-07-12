package knowledge;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        //Array declaration:
        ArrayList<Integer> A = new ArrayList<Integer>();//declares empty integer array
        ArrayList<Integer> A_B = new ArrayList<Integer>(/*B*/); //creates a copy of list B

        //Accessing i'th index
        int i = 3;
        A.get(i);

        //Setting i'th element
        A.set(i, 17);

        //Size of the list
        A.size();

        //Adding elements to the list
        A.add(91); //appends to end of the list. O(1) Operation
        A.add(i, 87); //add the value to specified index. O(size - index) operation
    }
}
