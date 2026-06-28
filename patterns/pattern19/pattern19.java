// package pattern19;

public class pattern19 {
    public static void main (String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            char alphabet = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
    
}
