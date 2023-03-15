import java.util.Arrays;

public class LC8 {
    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1};
        System.out.println(validMountainArray(a));
    }

    public static boolean validMountainArray(int[] arr) {
        int l = 0;
        for (int j = arr.length-1; j > l; j--) {
            if(arr[j] == arr[l]){
                return false;
            }
        }

        if (arr.length >= 3) {

            int max = 0;
            int finalMax = 0;
            int m = 0;
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i <= arr.length - 1; i++) {
                max = Math.max(arr[i], max);
                if (arr[i] == max) {
                    finalMax = i;
                }



            }
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    return false;
                } else {
                    for (int j = 0; j < arr[finalMax]; j++) {
                        if(arr[j] < arr[finalMax]){
                            count1++;
                        }
                    }
                    for (int j = finalMax; j < arr.length - 1; j++) {
                        m = Math.max(arr[finalMax], arr[j + 1]);
                        count2++;
                    }
                }
            }
            if(count1 > 0) {
                if (m == arr[finalMax]) {
                    return true;
                }
            }
            else if(count2 > 0){
                if (m == arr[finalMax]) {
                    return true;
                }
            }
            else{
                return false;
            }
        } else {
            return false;
        }
        return false;
    }
}



