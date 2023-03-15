import java.util.Arrays;

public class LC3 {
    public static void main(String[] args) {
        System.out.println(merge(new int[]{1, 2, 3, 0, 0, 0},3, new int[]{2, 5, 6},3));
    }

    public static String merge(int[] nums1, int m, int[] nums2, int n) {
        int p = 0;
        for (int i = nums1.length - nums2.length; i <= nums1.length-1; i++) {
                nums1[i] = nums2[p];
                p++;
        }
        Arrays.sort(nums1);
        return Arrays.toString(nums1);
    }
}

