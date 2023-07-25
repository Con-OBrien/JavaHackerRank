package builtinquestions;

import java.util.Arrays;

public class SortIntArray {
    public static void main(String[] args) {
        //Built-in
         int[] nums = {1,2,3, 8, 4, 6, 17, 9, 2};
         Arrays.sort(nums);
        System.out.println("asc order:" + Arrays.toString(nums));

        //BYO
        int[] numbers = {1,2,3, 8, 4, 6, 17, 9, 2};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        //1. We have the outer loop which runs from start to the 2nd to last element
        //i then represents the index of the first unsorted element, at the beginning this is 1.
        for(int i=0; i< n - 1; i++) {
            int minimumIndex = i;

            //The inner loop then runs from i+1 to the end of the array
            //This will find the index of the minimum element in the unsorted part of the array
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            //After finding the minimum element's index, swap it with the element at position i
            //This places the minimum element in its correct sorted position
            int num = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = num;
        }

        //it operates off a series of swaps slowly passing along what the minimum value to be looked at is while making the subset smaller each time
    }
}
