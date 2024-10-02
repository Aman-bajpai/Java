package Sorting;

import java.util.Arrays;

class Solution {
        public static void main(String[] args) {

            {
                int [] nums = {0,10, 2, 3, 4};
                int [] index = {0,1,2,2,1};
                int[] target = new int[nums.length];
                int j=0;
                for (int i = 0; i < nums.length; i++) {
                    j = index[i];
                    target[j] = nums[i];

                }
                System.out.println(Arrays.toString(target));
            }
        }
    }

