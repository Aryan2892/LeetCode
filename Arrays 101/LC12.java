package Leetcode;

import java.util.Arrays;

public class LC12 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4};
        sortArrayByParity(arr);
    }
    public static int[] sortArrayByParity(int[] nums) {
        int temp;
        if(nums[0] == 0){
            for (int i = 0; i <= nums.length-1; i++) {
                if(nums[i] % 2 == 0){
                    System.out.println(nums[i]);
                    for (int j = i; j > 0; j--) {
                        temp = nums[j - 1];
                        nums[j-1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        else {
            for (int i = 0; i <= nums.length - 1; i++) {
                    for (int j = nums.length - 1; j > 0; j--) {
                        if(nums[j]%2 == 0){
                        temp = nums[j - 1];
                        nums[j - 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
