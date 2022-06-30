package assignment2June24;

import java.util.*;

public class Q18_Reverse_Keys_TreeMap {
   public static void main(String[] args)
   {

       // Use reverseOrder() method in the constructor
       TreeMap<Integer, String> treeMap
           = new TreeMap<>();

       // Add elements to treeMap
       treeMap.put(1, "Hello");
       treeMap.put(2, "geeks");
       treeMap.put(3, "on");
       treeMap.put(4, "geeksforgeeks");
       

       System.out.println("TreeMap in original order: " + treeMap);
       
       TreeMap<Integer, String> treeMapRev
       = new TreeMap<>(Collections.reverseOrder());
       
       treeMapRev.put(1, "Hello");
       treeMapRev.put(2, "geeks");
       treeMapRev.put(3, "on");
       treeMapRev.put(4, "geeksforgeeks");

       // Print the TreeMap in reverse order of the keys
       System.out.println("TreeMap in reverse order: "
                          + treeMapRev);
   }
}