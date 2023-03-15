package Leetcode;

import java.util.Arrays;

public class LC11 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int p2 = nums.length - 1;
        int count = 0;
        int temp;
            for (int i = 0; i < p2; i++) {
                if (nums[i] == 0) {
                    for (int j = nums.length - 1; j > i; j--) {
                        if (nums[j - 1] == 0) {
                            temp = nums[j - 1];
                            nums[j - 1] = nums[j];
                            nums[j] = temp;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(nums));
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != 0) {
                    count++;
                }
            }
            System.out.println("Count : " + count);
        }
    }



