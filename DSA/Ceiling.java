package Leetcode;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,9,14,16,18};
        int target = 18;
        System.out.println(floor(arr,target));
    }


    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }


    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }


}
