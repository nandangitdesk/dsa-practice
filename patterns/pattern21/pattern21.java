// package pattern21;

public class pattern21 {
    public static void main(String[] args) {
        int n = 4;
        // part 1
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            // print stars
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // part 2
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }
            // print stars
            if(i > 1) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
