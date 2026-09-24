public class CountWordsInString {

    public static int wordCount(String str) {
        int count = 0;
        boolean isWord = false;
        int endOfLine = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            // check if the char is a letter
            if (str.charAt(i) != ' ' && i != endOfLine) {
                isWord = true;
            } else if (str.charAt(i) == ' ' || i == endOfLine) {
                if (isWord) {
                    count++;
                    isWord = false;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "    India Is My Country";
        System.out.println(wordCount(str) + " words.");
    }
}