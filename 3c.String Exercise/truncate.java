package String;

public class truncate {
	public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str; 
        }
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        String input = "This is a sample string that needs to be truncated.";
        int maxLength = 20;
        System.out.println("Original String: " + input);
        System.out.println("Truncated String: " + truncate(input, maxLength));
    }
}
