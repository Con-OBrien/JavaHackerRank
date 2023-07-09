package knowledge;

public class Java2DArray {
    public static void main(String[] args) {
        //nested iteration
        for(int outer = 0; outer < 3; outer++) {
            System.out.println("The outer index is: " + outer);
            for (int inner = 0; inner < 4; inner++) {
                System.out.println("\tThe inner index is: " + inner);
            }
        }

        //Declaring 2D arrays
        int[][] twoDIntArray;
        String[][] twoDStringArray;
        double[][] twoDDoubleArray;

        //Accessing 2D Array Elements
        int[][] arr = {{1,2,3},{4,5,6}};

        int retrievesFour = arr[1][0];

        //Initializer Lists
        double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};

        String[][] stringValues;
        stringValues = new String[][] {{"working", "with"}, {"2D", "arrays"}, {"is", "fun"}};

        //Modify2DArrayElements
        double[][] doubleVals = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
        doubleValues[2][2] = 100.5;

        //Row-Major Order - Goes through each in row order
        for(int i=0; i < doubleVals.length; i++) {
            for(int j=0; j < doubleVals[i].length; j++) {
                System.out.println(doubleVals[i][j]);
            }
        }
        System.out.println("\n");

        //Column-Major Order - each first element first
        for(int i = 0; i < doubleVals[0].length; i++) {
            for(int j = 0; j < doubleVals.length; j++) {
                System.out.println(doubleVals[j][i]);
            }
        }

        //Transversing with Enhanced For Loops
        for(String[] rowOfStrings : stringValues) {
            for(String s: rowOfStrings) {
                System.out.println(s);
            }
        }


    }
}
