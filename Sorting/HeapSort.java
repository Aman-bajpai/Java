//package Sorting;
//
//public class HeapSort {
//    public static void Heapify(int[] a. int n, int i){
//        int largest = i;
//        int l = 2*i;
//        int r = 2*i+1;
//        if(l<=n && a[l]>a[largest]){
//            largest = l;
//        }
//        if(r<=n && a[r]>a[largest]){
//            largest = r;
//        }
//        if (largest != i){
//            int temp = a[i];
//            a[i]= a[largest];
//            a[largest]=temp;
//
//            heapify(a,n,largest);
//        }
//
//    }
//}
