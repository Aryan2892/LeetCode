public class LC7 {
    public static void main(String[] args){
        System.out.println(checkIfExist(new int[]{7,1,14,11}));
    }

    public static boolean checkIfExist(int[] arr) {
        boolean a;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >= i; j--) {
                if (i != j) {
                    if (arr[i] == 2 * arr[j]) {
                        a = true;
                        return a;
                    }
                }
            }
        }
        return false;
    }
}
