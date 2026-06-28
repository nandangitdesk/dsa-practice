package pattern10;
public class pattern10 {
    public static void main(String args[]) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == 2 || row == n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            }else{
                // middle row
                System.out.print("* ");
                // row-2 space
                for(int space = 1; space <= (row - 2); space++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
