package knowledge;


import java.util.ArrayList;
import java.util.HashSet;

public class HashSetKnowledge {
    public static void main(String[] args) {
        //Instantiate an object of HashSet
        HashSet<ArrayList> set = new HashSet<>();

        //create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();

        //create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();

        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set.add(list1);
        set.add(list2);

        // print the set size to understand the
        // internal storage of ArrayList in Set
        System.out.println(set.size());

        //Used to return true if element is present in a set
        list2.contains(1);

        //Used to remove element if present in set
        list2.remove(1);

        //Used to return an iterator over the element in the set
        list2.iterator();

        //Used to check if empty
        list2.isEmpty();

        //Used to create shallow copy of set
        list2.clone();
    }
}
