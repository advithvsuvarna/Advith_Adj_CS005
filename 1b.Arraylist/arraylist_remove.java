/*Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList
*/
package List;
import java.util.*;
public class arraylist_remove {
	 public static void main(String args[])
	 {
		 ArrayList<String> List=new ArrayList<>();
		 List.add("Red");
		 List.add("Green");
		 List.add("Yellow");
		 List.add("Blue");

		 List.remove(2);
		 List.remove("Blue");
		 System.out.println(List);
		 
	 }
}
