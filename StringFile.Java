import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        System.out.println("=== Task 1: String Methods ===");
        String str = " Welcome to the Java String Lab! ";
        System.out.println("Original string: \"" + str + "\"");
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring \"Java\": " + str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Index of \"Java\": " + str.indexOf("Java"));
        System.out.println("Contains \"Lab\": " + str.contains("Lab"));
        System.out.println("Replace \"Java\" with \"Java Programming\": " + str.replace("Java", "Java Programming"));
        System.out.println("Split by spaces:");
       
        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

        System.out.println("Trimmed: \"" + str.trim() + "\"");
        String comparison = "java string lab!";
        System.out.println("Equals (case-sensitive): " + str.trim().equals(comparison));
        System.out.println("Equals (ignore case): " + str.trim().equalsIgnoreCase(comparison));
        System.out.println("\n=== Task 2: Loop Challenges ===");
        
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        String word = "racecar";
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("\"" + word + "\" is a palindrome? " + isPalindrome);

        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.print("Enter a sentence using the word \"Java\": ");
            userInput = scanner.nextLine();
        } while (!userInput.contains("Java"));
        System.out.println("Thank you!");

        System.out.println("\n=== Task 3: StringBuilder ===");
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        int start = sb.indexOf("Learning");
        int end = start + "Learning".length();
        sb.delete(start, end);
        System.out.println("Reversed: " + sb.reverse());

        System.out.println("\n=== Task 4: StringBuffer ===");
        StringBuffer sbuf = new StringBuffer("Multithreading Lab");
        sbuf.append(" - Learning Java");
        sbuf.insert(sbuf.indexOf("Lab") + 3, " is fun");
        int s = sbuf.indexOf("Learning");
        int e = s + "Learning".length();
        sbuf.delete(s, e);
        System.out.println("Reversed: " + sbuf.reverse());
    }
}