// package pattern16;

public class pattern16 {
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = i ; j <= i + i - 1 ; j++){
                System.out.print( j + " ");
            }
             System.out.println();
        }
        System.out.println();
    }
}
