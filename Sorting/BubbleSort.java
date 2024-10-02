package Sorting;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,5,7,8,2,3};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Bubble(int[] arr){
        for(int i = 0;i<arr.length;i++){
            boolean swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
