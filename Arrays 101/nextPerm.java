package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class nextPerm {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int l = nums.length;
        int temp;

        System.out.println(l);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < l -1; i++) {

            for (int j = 1; j < l -1; j++) {
                temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                System.out.println("Perm "+Arrays.toString(nums));
            }


            temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            System.out.println("Perm Final"+Arrays.toString(nums));
        }



        }
    }

