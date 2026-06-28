// package pattern14;

public class pattern14 {
    public static void main(String[] args) {
        int n = 4;
        // part 1
        for(int i = 1; i <= n; i++){
            // Print stars
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            if(i != n){
                for(int j = 1; j <= 2 * (n - i); j++){
                    System.out.print("  ");
                }
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    

        // part 2
        for(int i = 1; i <= n; i++){
            // Print stars
            for(int k = 1; k <= n - i + 1; k++){
                System.out.print("* ");
            }
            // Print spaces
            for(int j = 1; j <= 2 * (i - 1); j++){
                System.out.print("  ");
            }
            for(int k = n; k >= i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
