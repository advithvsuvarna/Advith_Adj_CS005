/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))
*/
package List;
import java.util.*;
public class Linkedlist_swap {
	public static void main(String args[])
	 {
			Scanner sc=new Scanner(System.in);
			LinkedList<String> List=new LinkedList<>();
			List.add("Red");
			 List.add("Green");
			 List.add("Yellow");
			 Collections.swap(List, 0, 2);
			
	System.out.println(List);
}
}
