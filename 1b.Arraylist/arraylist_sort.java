/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)
*/
package List;
import java.util.*;
public class arraylist_sort {
	 public static void main(String args[])
	 {
		 ArrayList<String> List=new ArrayList<>();
		 List.add("Red");
		 List.add("Green");
		 List.add("Yellow");
		 List.add("Blue");
	

		 Collections.sort(List);
		 System.out.println(List);
		 
	 }
}
