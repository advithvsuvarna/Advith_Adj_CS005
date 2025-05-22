/*
 * Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()
*/
package String;

public class Count_occurences {
	 public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }
	        int count = 0;
	        int index = 0;
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }
	        return count;
	    }
	    public static void main(String[] args) {
	        String mainString = "Java is fun. Java is powerful.";
	        String subString = "Java";
	        int count = countOccurrences(mainString, subString);
	        System.out.println("The substring '" + subString + "' appears " + count + " times.");
	    }
}
