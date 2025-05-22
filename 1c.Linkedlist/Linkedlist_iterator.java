/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
*/
package List;
import java.util.*;
public class Linkedlist_iterator {
	public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> List=new LinkedList<>();
		List.add("Red");
		 List.add("Green");
		 List.add("Yellow");
		 List.add("Blue");
		
		
		Iterator<String> it = List.listIterator(1);
		while(it.hasNext())
			System.out.println(it.next());
	 }
	}
