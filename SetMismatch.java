package Leetcode;

//https://leetcode.com/problems/set-mismatch/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {2,1,4,2,6,5};

        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        int[] ans = {-1,-1};
        while (i < arr.length) {

                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != j + 1) {
                    ans[0] = arr[j];
                    ans[1] = j + 1;
                }
            }
        System.out.println(Arrays.toString(arr));
            return ans;
        }


        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

}
