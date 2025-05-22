/* Write a Java Program for Reversing the characters in a string using user defined function
reverseString().
*/
package String;

public class reverse_String {
	public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
	public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
    
}
