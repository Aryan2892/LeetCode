package Leetcode;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findMissingNumbers(arr));
    }

    static List<Integer> findMissingNumbers(int[] arr){
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while ( i < arr.length ){
            int correct = arr[i] - 1;
            if( arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                ans.add(j + 1);
            }
        }
        return ans;


    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
