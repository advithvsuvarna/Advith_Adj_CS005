package String;

public class String_capitalizeWords {
	 public static String capitalizeWords(String str) {
	        String[] words = str.split("\\s+");
	        StringBuilder capitalizedStr = new StringBuilder();      
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                capitalizedStr.append(Character.toUpperCase(word.charAt(0)))
	                              .append(word.substring(1)).append(" ");
	            }
	        }
	        return capitalizedStr.toString().trim();
	    }

	    public static void main(String[] args) {
	        String input = "hello world! ";
	        System.out.println("Original String: " + input);
	        System.out.println("Capitalized String: " + capitalizeWords(input));
	    }
}
