package Leetcode;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][]accounts = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(maxWealth(accounts));

    }


    static int maxWealth(int[][] accounts){
       int max = Integer.MIN_VALUE;
       int sum[] = new int[accounts.length];
       int s = 0;

        for (int i = 0; i < accounts.length; i++) {
            s = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                s += accounts[i][j];
            }
            sum[i] = s;
        }

        for (int i = 0; i < sum.length; i++) {
         if(sum[i] > max){
             max = sum[i];
         }
        }


        return max;
    }
}
