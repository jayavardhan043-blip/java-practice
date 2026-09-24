public class CallByValue {

    public static void main(String[] args) {
        int age = 24;
        System.out.println("Before change: " + age);
        changeAge(age);
        System.out.println("After change: " + age);
    }

    private static void changeAge(int age) {
        age = 45;
    }
}