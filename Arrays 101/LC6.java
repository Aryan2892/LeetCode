import java.lang.reflect.Array;
import java.util.Arrays;

public class LC6 {
    public static void main(String[] args) {
        int x = removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(x);
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }

}
