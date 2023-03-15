import java.util.Arrays;
import java.util.Scanner;

public class Yelllo {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
        int zeros = 0;
        int length = arr.length;

        // count the number of zeros in the array
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        // iterate through the array in reverse order and copy elements
        for (int i = length - 1; i >= 0; i--) {
            // if the current element is zero, duplicate it
            if (arr[i] == 0) {
                // if there is space for another element, shift elements to the right
                if (i + zeros < length) {
                    arr[i + zeros] = 0;
                }
                zeros--;
            }

            // copy the current element to the next available position
            if (i + zeros < length) {
                arr[i + zeros] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    }
