package Leetcode;

import java.util.Scanner;

public class setZeroes {
    public static void main(String[] args) {
        setZeroes();
    }

    public static void setZeroes(){
        inp();
    }


    public static int[][] inp(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = sc.nextInt();
        System.out.println("enter number of cols");
        int n = sc.nextInt();
        int[][] x = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        System.out.println("Final Matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(x[i][j] + "");
                }
                System.out.println();
            }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (x[i][j] == 0) {
                    for (int l = i; l < (n); l++) {
                            x[l][j] = 0;
                    }

                    for (int k = j; k < m; k++) {
                        x[i][k] = 0;
                    }
                }
                System.out.print(x[i][j] + " ");
            }System.out.println();

        }

    return x;
    }
}
