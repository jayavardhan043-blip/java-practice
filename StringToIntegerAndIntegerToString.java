public class StringToIntegerAndIntegerToString {

    public static void main(String[] args) {

        String str = "200";
        int num = 300;

        // String to Integer
        int intVal = Integer.parseInt(str);

        // Integer to String
        String strVal = Integer.toString(num);

        System.out.println("Converted to Integer: " + intVal);
        System.out.println("Converted to String: " + strVal);
    }
}