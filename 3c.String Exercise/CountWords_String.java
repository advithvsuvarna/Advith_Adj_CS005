package String;

public class CountWords_String {
	public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0; 
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "This is a sample sentence with multiple words.";
        System.out.println("Original String: " + input);
        System.out.println("Word Count: " + countWords(input));
    }
}
