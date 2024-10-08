package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {7, 2, 6, 4, 5, 9, 1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxindex(arr,0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static int getMaxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}



