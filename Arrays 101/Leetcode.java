import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Leetcode {
    public static void main(String[] args) {
       int nums[] = {-4,-1,0,3,10};
       int sqr[] = new int[5];
       int l = 0;

        for (int i = 0; i <= nums.length-1; i++) {
            sqr[i] = nums[i]*nums[i];
        }
        String s = Arrays.toString(sqr);
        System.out.println(s);


    }
}
