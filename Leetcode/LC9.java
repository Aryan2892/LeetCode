import java.util.Arrays;

public class LC9 {
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};
        System.out.println(replaceElements(arr));
    }

    public static String replaceElements(int[] arr){
        int max = 0;
        int temp;


        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("Element : "+arr[i]);
            for (int j = 1; j <= arr.length-1 ; j++) {
                System.out.println("i+1 : " + arr[i+1]);
                System.out.println("j : "+arr[j]);
                max = Math.max(arr[i+1],arr[j]);
                temp = max;
                arr[i] = temp;
                System.out.println("Max : " + max);

            }
        }
        arr[arr.length-1] = -1;

        System.out.println(Arrays.toString(arr));
        return "Hello";
    }
}

/*
        int max = -1;

        for (int i = arr.length-1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
*/