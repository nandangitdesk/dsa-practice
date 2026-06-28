import java.util.Arrays;
import java.util.HashMap;

public class Main {

    // Reverse Array
    public static int[] reverseArray(int[] arr) {
        int j = arr.length - 1;

        for (int i = 0; i < j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        return arr;
    }

    // Right Shift By One
    public static int[] rightShiftArrayByOne(int[] arr) {
        int lastElement = arr.length - 1;
        int temp = arr[lastElement];

        for (int i = lastElement; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
        return arr;
    }

    // Left Shift By One
    public static int[] leftShiftArrayByOne(int[] arr) {

        int firstElement = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = firstElement;
        return arr;
    }

    // Right Shift By K
    public static int[] rightShiftArrayByKElements(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        if (k < 0) {
            k += n;
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }

        return result;
    }

    // Reverse Helper
    public static int[] rotateArrayByKElements(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    // Rotate Using Temp Array
    public static int[] rotateArrayByKElementsOtherMethod(int[] arr, int k) {

        int n = arr.length;
        k %= n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {

            int newIndex = (i + k) % n;
            temp[newIndex] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }

    // Print Alternate
    public static void printAlternate(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {

            if (i == j) {
                System.out.print(arr[i] + " ");
                return;
            }

            System.out.print(arr[i] + " ");
            System.out.print(arr[j] + " ");

            i++;
            j--;
        }
    }

    // Mode 
    public static int getMode(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num:arr){
            freq.put(num , freq.getOrDefault(num, 0)+ 1);
        }

        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for(int key: freq.keySet()){
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);

            if(currentKeyKiFrequency > maxFreq){
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;
            }
        }

        return maxFreqWaliKey;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Reverse : " + Arrays.toString(reverseArray(arr)));

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Left Shift : " + Arrays.toString(leftShiftArrayByOne(arr2)));

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Right Shift : " + Arrays.toString(rightShiftArrayByOne(arr3)));

        int[] arr4 = {1,2,3,4,5,6,7};
        int k = 3;

        rotateArrayByKElements(arr4,0,arr4.length-1);
        rotateArrayByKElements(arr4,0,k-1);
        rotateArrayByKElements(arr4,k,arr4.length-1);

        System.out.println("Rotate Reverse : " + Arrays.toString(arr4));

        int[] arr5 = {1,2,3,4,5,6,7};
        System.out.println("Rotate Temp : "
                + Arrays.toString(rotateArrayByKElementsOtherMethod(arr5,3)));

        int[] arr6 = {1,2,3,4,5,6,7};
        System.out.print("Alternate : ");
        printAlternate(arr6);
        System.out.println();

        int[] arr7 = {1,2,2,2,3,4,2,3,1,3,5};

        System.out.println("Mode is : " + getMode(arr7));
    }
}