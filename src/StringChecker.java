public class StringChecker {
    public static void main(String[] args) {

        String str = "War must be, while we defend our lives against a destroyer who would devour all...";
        System.out.println("Text: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character position 6: " + str.charAt(6));
        System.out.println("Excerpt from mark 12 to mark 29: " + str.substring(12,29));
        System.out.println("First letter index 'e': " + str.indexOf('e'));
        System.out.println("Subtext start index \"defend\": " + str.indexOf("defend"));
        System.out.println("Upper Case: " + str.toUpperCase());
    }
}