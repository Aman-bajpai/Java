package Leetcode;

public class maxSubArraySum {
        public static void main(String[] args) {
            int[] arr = {2, 3,7, 3, 5, 8, 1};
            int k = 3;
            int ans = maxSubArraySum(arr, k);
            System.out.println(ans);
        }

        static int maxSubArraySum(int[] arr, int k){
            int maxSum = 0;
            int windowSum = 0;
            int start = 0;
            for(int end = 0; end<arr.length; end++){
                windowSum = windowSum + arr[end];
                if(end >= k-1){
                    maxSum = Math.max(maxSum, windowSum);
                    windowSum = windowSum - arr[start];
                    start++;
                }
            }
            return maxSum;
        }
}

