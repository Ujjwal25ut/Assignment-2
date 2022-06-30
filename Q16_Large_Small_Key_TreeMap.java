package assignment2June24;

	import java.util.*;
	  
	public class Q16_Large_Small_Key_TreeMap {
	  
	    // Main driver method
	    public static void main(String[] args)
	    {
	        // Initialization of a TreeMap
	        // using Generics
	        TreeMap<Integer, String> tree
	            = new TreeMap<Integer, String>();
	  
	        // Inserting the Elements into TreeMap
	        tree.put(100, " A");
	        tree.put(120, " M");
	        tree.put(140, " X");
	        tree.put(200, " Z");
	        tree.put(160, " Y" );
	        
	        System.out.println("Orginal TreeMap content: " + tree);
	        System.out.println("Least key: " + tree.firstEntry());
	        System.out.println("Greatest key: " + tree.lastEntry());
	  
	        
	    }
	}