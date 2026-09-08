 public class RemoveAllSpaces {

    public static void main(String[] args) {
        String str = "India     Is My    Country";
        String result = str.replaceAll("\\s", "");
        System.out.println("Without spaces: " + result);
    }
}