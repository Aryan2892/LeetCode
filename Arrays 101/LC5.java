import java.util.Arrays;

public class LC5 {
    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = 0;
        Arrays.sort(nums);

        int countx = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]){
                count++;
            }
        }
        countx = count;
        count = 0;

        System.out.println(countx);

    }
}

