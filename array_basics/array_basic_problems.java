
public class array_basic_problems {

    // Function to calculate the average of an array
    public static double getAverage(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return (double)sum / arr.length;
    }

    // Function to multiply each element by 10 and return a new array
    public static int[] multiplyByTen(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i] * 10;
        }
        return newArr;
    }
    // linear search function to find an element in the array
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i; // return the index of the target element
            }
        }
        return -1; // return -1 if the target element is not found
    }

    // find the maximum element in the array
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    // find the minimum element in the array
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    // find second largest element in the array
    public static int findSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    // return sum of positive and negative numbers in the array
    public static int[] sumPositiveNegative(int[] arr){
        int positiveSum = 0;
        int negativeSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                positiveSum += arr[i];
            } else if(arr[i] < 0){
                negativeSum += arr[i];
            }
        }
        return new int[]{positiveSum, negativeSum};
    }

    // count the numbers of zeros and ones in the array
    public static int[] countZerosOnes(int[] arr){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            } else if(arr[i] == 1){
                oneCount++;
            }
        }
        return new int[]{zeroCount, oneCount};
    }

    // find first unsorted element in the array 
    public static int findFirstUnsorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                return arr[i + 1];
            }
        }
        return -1; // return -1 if the array is sorted
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        System.out.println("Average of array elements: " + getAverage(arr));
        System.out.println("Array elements multiplied by 10: " + java.util.Arrays.toString(multiplyByTen(arr)));
        System.out.println("Index of element 3: " + linearSearch(arr, 3));
        System.out.println("Second largest element in the array: " + findSecondLargest(arr));
        System.out.println("Maximum element in the array: " + findMax(arr));
        System.out.println("Minimum element in the array: " + findMin(arr));
        System.out.println("Second largest element in the array: " + findSecondLargest(arr));
        System.out.println("Sum of positive and negative elements: " + java.util.Arrays.toString(sumPositiveNegative(arr)));
        System.out.println("Count of zeros and ones: " + java.util.Arrays.toString(countZerosOnes(new int[]{0, 1, 0, 1, 1, 0, 0, 1})));
        System.out.println("First unsorted element in the array: " + findFirstUnsorted(new int[]{1, 2, 3, 5, 4, 6}));

    }
    
}
