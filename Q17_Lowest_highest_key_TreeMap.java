package assignment2June24;

	import java.util.*;
	public class Q17_Lowest_highest_key_TreeMap {  
	     public static void main(String args[]) {

	  // Create a tree map
	  TreeMap <String,String> tree = new TreeMap <String,String> ();

	  // Put elements to the map 
	  tree.put("C2", "Red");
	  tree.put("C1", "Green");
	  tree.put("C4", "Black");
	  tree.put("C3", "White");

	  System.out.println("Orginal TreeMap content: " + tree);
	  System.out.println("Greatest key: " + tree.firstKey());
	  System.out.println("Least key: " + tree.lastKey());
	 }
	}