import java.util.ArrayList;
import java.util.Arrays;

public class prob5 {
    /*
    public static int removeDuplicates(int[] nums) {

        // Solution 1: Time Complexity: O(N) & Space Complexity: O(N)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
                list.add(nums[i]);
        }
        for(int i=0;i<list.size();i++)
        {
            nums[i] = list.get(i);
        }
        return list.size();
    }

     */

    public static int removeDuplicates(int[] nums) {

        // Solution 2: Time Complexity: O(N) & Space Complexity: O(1)
        int i = 0;
        for(int j = 1;j<= nums.length-1;j++)
        {
            if(nums[i]!=nums[j])
            {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(Arrays.toString(nums));
        System.out.println("Number of elements is "+removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
        }
        }
