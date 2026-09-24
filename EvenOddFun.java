public class EvenOddFun {  
    public static void main(String[] args) {
        boolean result = isEven(4);
        System.out.println(result);  
    }  

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
}  