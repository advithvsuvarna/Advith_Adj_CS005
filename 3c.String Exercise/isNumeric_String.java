package String;

public class isNumeric_String {
	 public static boolean isNumeric(String str) {
	        return str.matches("\\d+"); 
	        }

	    public static void main(String[] args) {
	        String input1 = "123456";
	        String input2 = "12a34";
	        
	        System.out.println("Input: " + input1 + " -> Is Numeric? " + isNumeric(input1));
	        System.out.println("Input: " + input2 + " -> Is Numeric? " + isNumeric(input2));
	    }
}
