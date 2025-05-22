/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index
*/
package List;
import java.util.*;
public class arraylist_delete {
	public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
		 ArrayList<String> List=new ArrayList<>();
		 List.add("Red");
		 List.add("Green");
		 List.add("Yellow");
		 List.add("Blue");
		 System.out.println("Enter the nth index:");
		 int n=sc.nextInt();
		List.remove(n);
		System.out.println(List);
		 
	 }
}
