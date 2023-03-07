package Leetcode;

import java.util.Arrays;

public class LC10 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(arr);
    }

    public static String removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int y = nums.length - 1;
        int count = 0;
        int temp = 0;

        while (y >= 0) {
            int i = y;
            System.out.println("Element : " + nums[i]);
            for (int j = 0; j <= i; j++) {
                System.out.println("Element under consideration : " + nums[j]);
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            temp++;
            y -= count;
            System.out.println("COUNT : "+count);
            count = 0;
            System.out.println(Arrays.toString(nums));
        }
        System.out.println("Distinct numbers : "+temp);
        return Arrays.toString(nums);
    }
}

/*
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;

        int addIndex = 1; //index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
              nums[addIndex] = nums[i + 1];
              addIndex++;
            }
        }
        return addIndex;
    }
}
 */
