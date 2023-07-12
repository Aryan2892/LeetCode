package Leetcode;

import java.util.Arrays;

public class searchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));

    }


    static int[] searchRange(int[] nums, int target){

        int[] a = {-1,-1};

        //First occurrence
        int start = BS(nums,target,true);

        //last occurrence
        int end = BS(nums,target,false);

        a[0] =start;
        a[1] = end;

        return a;
    }


    static int BS(int[] nums,int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int ans = -1;

        while(start <= end){

            mid = start + (end - start)/2;

            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
            else{
                //potential ans
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
