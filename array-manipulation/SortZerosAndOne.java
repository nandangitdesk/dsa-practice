

public class SortZerosAndOne {
    public static void main(String[] args){
        int[] arr = {1,0,0,1,0,1,1,0,1};
        // logic - 
        // case 1 - agar i = 1 ho and j = 0 ho to swap karo
        // case 2 - agar i pe 0 hai to i++ KARO
        // case 3 - agar j pe 1 hai to j-- karo

        int i = 0;
        int j = arr.length - 1;
        while( i < j){
            if(arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--; 
            }
            else if(arr[i] == 0){
                i++;
            }

            else if(arr[j] == 1){
                j--;
            }
        }

        for(int arrs:arr){
           System.out.print(arrs + " ");
        }

    }
    
}
