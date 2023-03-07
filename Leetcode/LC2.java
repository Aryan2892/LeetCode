import java.util.Arrays;

public class LC2 {
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,5,0};

        System.out.println("Original array " + (Arrays.toString(arr)));

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Step : "+i);
            if (arr[i] == 0)
            {
                int p = i;
                for (int j = arr.length-1; j >= p+1; j--) {
                    if (j == 0) {
                        arr[j+1] = 0;
                        System.out.println("Last step"+(Arrays.toString(arr)));

                    } else {
                        arr[j] = arr[j - 1];
                        System.out.println("Change in original " + (Arrays.toString(arr)));
                    }

                }
                System.out.println("Final array : "+Arrays.toString(arr));
                i++;
            }
            System.out.println("No change at Step : "+i+ " \nArray is : "+(Arrays.toString(arr)));
        }
    }
}