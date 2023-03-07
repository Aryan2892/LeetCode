package Leetcode;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        heightChecker(heights);
    }
    public static int heightChecker(int[] heights){
        int count = 0;
        int[] x = Arrays.copyOf(heights,heights.length);
        System.out.println(Arrays.toString(x));
        Arrays.sort(heights);
        System.out.println(Arrays.toString(heights));
        for (int i = 0; i <= heights.length - 1; i++) {
            if(x[i] != heights[i]){
                count++;
            }
            System.out.println(Arrays.toString(x));
        }
        System.out.println(count);
        return count;
    }
}
