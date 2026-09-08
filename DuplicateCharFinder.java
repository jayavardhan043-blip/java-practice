import java.util.HashMap;
import java.util.Map;

public class DuplicateCharFinder {

    public void findDuplicates(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' appears " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        DuplicateCharFinder finder = new DuplicateCharFinder();
        finder.findDuplicates("India is my country");
    }
}