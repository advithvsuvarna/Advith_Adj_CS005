/*
 * Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))
*/
package List;
import java.util.*;
public class LinkedList_insert {
	public static void main(String args[])
	 {
			LinkedList<String> List=new LinkedList<>();
			List.add("Red");
			 List.add("Green");
			 List.add("Yellow");
			
			
			List.offerLast("Pink");
				System.out.println(List);
		 }
}
