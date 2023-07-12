package Leetcode;

public class InfiniteArrayGFG {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        System.out.println(findRange(arr,target));
    }


    static int findRange(int[] arr, int target){
        //start with box of size 2
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + 2*(end - start + 1);
            start = newStart;
        }
        return BS(arr,target,start,end);
    }

    static int BS(int[] nums,int target, int start, int end){

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
                return mid;
            }
        }
        return ans;
    }


}
