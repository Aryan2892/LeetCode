package Leetcode;

import java.util.Arrays;

public class nextGreatestletter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'd';

        System.out.println(nextGreatestLetter(letters,target));

    }



       static char nextGreatestLetter(char[] letters, char target) {
            int l = 0;
            int r = letters.length - 1;
            int mid;
            while (l <= r) {
                mid = (l + r) / 2;
                if (letters[mid] <= target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            return l == letters.length ? letters[0] : letters[l];
        }
    }

