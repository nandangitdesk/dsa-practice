package pattern11;
public class pattern11 {
    public static void main(String args[]){
        int row = 5;
        for(int i = 1 ; i <= row; i++){
            for(int j = 1; j <= row - i; j++){
                System.out.print("  ");
            }
            if(i == 1 || i == row){
                for(int j = 1; j <= 2 * i - 1; j++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for(int k = 1; k <= 2 * i - 3; k++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
