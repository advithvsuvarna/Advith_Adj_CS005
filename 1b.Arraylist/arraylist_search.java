/*Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not
*/
package List;
import java.util.*;
public class arraylist_search {
	 public static void main(String args[])
	 {
		 ArrayList<String> List=new ArrayList<>();
		 List.add("Red");
		 List.add("Green");
		 List.add("Yellow");
		 List.add("Blue");
			 if(List.contains("Red"))
				 System.out.println("Red is Available");
			 else
				 System.out.println("Red is not Available");
		 
	 }
	}
