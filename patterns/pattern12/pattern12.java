// package pattern12;

public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //part 2
        for (int i = 1 ; i <= n; i++) {
            if(i == 1){
                continue;
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
