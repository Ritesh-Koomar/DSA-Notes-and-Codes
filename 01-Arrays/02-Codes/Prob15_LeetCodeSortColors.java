import java.util.Arrays;
import java.util.HashMap;

public class prob15 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,0,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
    public void sortColors(int[] nums) {
    TC = O(n) and SC = O(1) but 2 iterations are involved.
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            c0++;
            else if(nums[i]==1)
            c1++;
            else
            c2++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i<c0)
            nums[i] = 0;
            else if(i>=c0 && i<=(c1+c0-1))
            nums[i] = 1;
            else
            nums[i] = 2;
        }
    }
     */
    public static void sortColors(int[] nums) {
      //  TC = O(n) and SC = O(1) only 1 iteration is involved.
        int s = 0;
        int e = nums.length-1;
        int mid = 0;
        while(mid<=e)
        {
            if(nums[mid]==0)
            {
                int t = nums[s];
                nums[s] = nums[mid];
                nums[mid] = t;
                s++;
                mid++;
            }
            else if(nums[mid]==1)
                mid++;
            else
            {
                int t = nums[e];
                nums[e] = nums[mid];
                nums[mid] = t;
                e--;
            }
        }
    }
    static void optimal(int[] arr,int target)
    {

    }
}
