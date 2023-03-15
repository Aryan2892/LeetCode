package Leetcode;

import java.util.Arrays;

public class ThirdMAX
{
    public static void main(String[] args)
    {
        int[] nums = {0,0,1};//1,2,2,5,3,5
        thirdMax(nums);
    }

    public static int thirdMax(int[] nums)
    {
        int tmax = 0;
        int count;
        int p = 0;
        int c = 0;
        {
            Arrays.sort(nums);
            int n = nums.length;
            count = 1;


            for (int i = 1; i < n; i++) {
                int j = 0;
                for (j = 0; j < i; j++)
                    if (nums[i] == nums[j])
                        break;

                if (i == j)
                    count++;
            }
        }

        System.out.println("C : "+count);

        if(count >= 3) {
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            int k;
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] == nums[i + 1]) {//1,2,2,3
                    p++;
                    for (int j = i+1; j < nums.length-1; j++) {
                            k = nums[j];
                            nums[j] = nums[j + 1];
                            nums[j + 1] = k;
                            System.out.println("New arr : " + (Arrays.toString(nums)));
                    }
                }
            }
            System.out.println("Update : "+Arrays.toString(nums));
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = nums.length - 1 - p; j > i; j--) {
                    k = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = k;
                    System.out.println("Array : "+(Arrays.toString(nums)));
                }
            }

            tmax = nums[2];
            System.out.println(tmax);
            System.out.println(Arrays.toString(nums));
        }
        else
        {
            for (int j = 0; j <= nums.length - 1; j++)
            {
                tmax = Math.max(tmax, nums[j]);
            }
            System.out.println(tmax);
        }

        return tmax;
    }
}

 /*int[] m = new int[3];
        int max = 0;
        int k = nums.length-1;
        int c = 0;
        int temp;

        if (nums.length >= 3) {
            if (k >= 3) {
                System.out.println("VAL : " + k);
                for (int i = 0; i <= k; i++) {
                    System.out.println("K : "+k);
                    System.out.println("Loop of I : "+i);
                    for (int j = nums.length - 1; j >= i; j--) {
                        System.out.println("Loop number : "+j);
                        if (nums[j] >= max) {
                            max = nums[j];
                            c = j;
                            System.out.println("C find : " + nums[c]);
                        }
                    }
                    k--;
                }
                for (int j = c; j < nums.length - 1; j++) {
                    System.out.println("J : " + nums[j]);
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    System.out.println(Arrays.toString(nums));
                }
            }
        }
        else
        {
            for (int j = 0; j <= nums.length - 1; j++)
            {
                max = Math.max(max, nums[j]);
            }
        }
        //m[2] = max;
        nums[nums.length-1] = max;
        System.out.println(max);
        System.out.println("K : "+k);
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(nums));*/