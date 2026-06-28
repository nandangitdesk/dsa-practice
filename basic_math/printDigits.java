

public class printDigits {
    public static void main(String[] args) {
        int number = 12345;
        printDigitsRecursive(number);
    }

    public static void printDigitsRecursive(int number) {
        if(number != 0) {
            int digit = number % 10;
            System.out.println(digit);
            printDigitsRecursive(number / 10);
        }
}
}