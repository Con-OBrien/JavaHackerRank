package knowledge;

import java.util.TreeMap;

public class MapKnowledge {
    public static void main(String[] args) {
        //Map declaration:
        TreeMap<Integer, Integer> A = new TreeMap<>();

        //Insert a new key, value pair K, V:
        int K = 1, V = 123;
        A.put(K, V);

        //Delete a key K:
        A.remove(K);

        //Search if a key K exists in a map:
        A.containsKey(K);

        //Search for the value with key K:
        A.get(K);

        //Find minimum key K in the map ( if the map is not empty ):
        A.firstKey();
        A.firstEntry().getKey();

        //Find maximum key in the map (if the map is not empty ):
        A.lastKey();
        A.lastEntry().getKey();

        //Iterate over keys in sorted order:
       // for (Map.Entry<Integer, Integer> entry : A.entrySet()) {
            //entry.getKey() has the key, entry.getValue() has the value
      //  }

        //Find closest key K <= x:
        int x = 9;
        A.floorEntry(x).getKey();

        //Size (number of entries in the map):
        A.size();
    }
}
