package Leetcode;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,3456};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count,count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
//            while(nums[i] != 0 ){
//                nums[i] = nums[i] /10;
//                count++;
//            }

            count = (int) (Math.log10(nums[i])) + 1;
            if(count % 2 == 0){
                count2++;
            }
        }
        return count2;
    }
}
