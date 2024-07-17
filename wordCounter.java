package ekta;
import java.util.*;

public class wordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = scanner.nextLine();

        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        int count = countWordOccurrences(word, sentence);
        System.out.println("Number of times the word appears: " + count);

        scanner.close();
    }

    public static int countWordOccurrences(String word, String sentence) {
        // Convert both word and sentence to uppercase for case-insensitive matching
        word = word.toUpperCase();
        sentence = sentence.toUpperCase();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        int count = 0;
        // Count occurrences of the word in the sentence
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
