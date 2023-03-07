import java.lang.reflect.Array;
import java.util.Arrays;
//LC3 + LC13
public class LC4 {
    public static void main(String[] args) {
        removeElement(new int[]{0,4,4,0,4,4,4,0,2}, 4);
    }

    public static int[] removeElement(int[] nums, int val) {
        int temp;
        int y = nums.length;
        int count = 0;
        for (int i = 0; i <= y - 1; i++) {
            if (nums[i] == val) {
                count++;
            }
        }
        if(y>0) {
            if (nums[y - 1] == val) {
                y--;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == val){
                for (int j = y-1; j > i; j--) {
                    if (nums[j] != val) {
                        temp = nums[j - 1];
                        nums[j - 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        int x = nums.length - count;;
        System.out.println(x);

        return nums;
    }
}



        /*int count = 0;
        int x;
        int y = nums.length;
        for (int i = 0; i <= y - 1; i++) {
            if (nums[i] == val) {
                count++;
            }
        }
        y = nums.length - count;
        for (int i = 0; i <= y - 1; i++) {
            if (nums[i] == val) {
                if (i < y - 1 && nums[i] == nums[i + 1]) {
                    for (int j = nums.length-1; j > nums.length-i; j--) {
                        nums[j] = nums[j-1];
                        nums[i] = nums[j];
                    }
                } else {
                    for (int j = i; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                }
            }
        }
        int numf[] = new int[nums.length - count];
        for (int j = 0; j < nums.length - count; j++) {
            numf[j] = nums[j];
        }
        System.out.println(Arrays.toString(numf));
        x = numf.length;
        return x;
    }
}
*/

/* Final solution
class Solution {
   public int removeElement(int[] nums, int val) {
    int i = 0;
    int n = nums.length;
    while (i < n) {
        if (nums[i] == val) {
            nums[i] = nums[n - 1];
            // reduce array size by one
            n--;
        } else {
            i++;
        }
    }
    return n;
}
}
 */
      /*  int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[j] = nums[i]; // move non-val element to front
                j++; // increment index for non-val elements
            }
            i++; // always increment index for iteration
        }
        System.out.println(j);
        return j;
    }
}*/