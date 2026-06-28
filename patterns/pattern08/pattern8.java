package pattern08;
public class pattern8 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            // Print leading spaces (Row 1 gets 0 spaces)
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
