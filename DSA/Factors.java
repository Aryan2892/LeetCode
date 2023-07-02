package KunalKushwaha;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        factors3(n);
    }

    //O(n)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //O(sqrt(n))
    static void factors2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) { //in case of perfect square it will print sqrt twice
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " "); // 20 = 2 * 10 (10 = n/i)
                }
            }
        }
    }


    //both time and space will be O(sqrt(n))
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) { //in case of perfect square it will print sqrt twice
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " "); // 20 = 2 * 10 (10 = n/i)
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0 ; i--) { //list will store 20 10 5, so we need to print it in reverse
            System.out.print(list.get(i) + " ");
        }
    }
}
