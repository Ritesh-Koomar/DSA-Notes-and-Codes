import java.util.ArrayList;
import java.util.Arrays;
public class prob7 {
    public static void main(String[] args) {
        int[] arr = { 1 , 0 , 2 , 0 , 11, 0 , 6};
        System.out.println(Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
     Brute Force
     Time Complexity : O(n)
     Space Complexity : O(n)

    public static void moveZeroes(int[] nums) {
        if(nums.length<=1)
            return;
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                list.add(nums[i]);
        }
        for(int i=0;i<list.size();i++)
        {
            nums[i] = list.get(i);
        }
        for(int i=list.size();i<nums.length;i++)
        {
            nums[i] = 0;
        }
    }
    */
    /*
    Optimized Code
    Time : O(n)
    Space : O(1)

     */
    public static void moveZeroes(int[] nums) {
        if(nums.length<=1)
            return;
        int j = -1;
        for(int i=0;i< nums.length;i++)
        {
                if(nums[i]==0)
                {
                    j = i;
                    break;
                }
        }
        for(int i = j+1;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
    }
}
