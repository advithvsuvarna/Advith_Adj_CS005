/*Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().
*/
package String;

public class Check_null {
	public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
	    public static void main(String[] args) {
	        String str1 = null;
	        String str2 = "   ";
	        String str3 = "Hello, World!";
	        System.out.println("str1: " + (isNullOrEmpty(str1) ? "Empty" : "Not Empty"));
	        System.out.println("str2: " + (isNullOrEmpty(str2) ? "Empty" : "Not Empty"));
	        System.out.println("str3: " + (isNullOrEmpty(str3) ? "Empty" : "Not Empty"));
	    }
}
