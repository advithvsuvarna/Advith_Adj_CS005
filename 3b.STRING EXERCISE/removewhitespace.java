package String;

public class removewhitespace {
	 public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s", "");
	    }

	    public static void main(String[] args) {
	        String input = " Hello  World!  ";
	        System.out.println("Original String: " + input);
	        System.out.println("String without whitespace: " + removeWhitespace(input));
	    }
}
