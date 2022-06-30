package assignment2June24;

import java.util.Iterator;
import java.util.LinkedList;

public class Q9SpecialnsertLinkedList {
	public static void main(String[] args) {
			LinkedList <String> l_list = new LinkedList <String> ();
			l_list.add("Hello");
			l_list.add("Learning");
			l_list.add("Linked List");
			l_list.addFirst("First Element");
			l_list.addLast("Last Element");
			
			Iterator<String> it= l_list.iterator();
			while(it.hasNext())
				{
				System.out.println(it.next());
				}
	}
}
