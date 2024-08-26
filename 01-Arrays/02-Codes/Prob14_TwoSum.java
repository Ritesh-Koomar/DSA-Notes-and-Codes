import java.util.Arrays;
import java.util.HashMap;

// Two Sum
public class prob14 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 13;
        System.out.println(Arrays.toString(naive(arr,target)));
        System.out.println(Arrays.toString(better(arr,target)));
    }
    static int[] naive(int[] arr,int target)
    {
        // TC = O(n^2)
        // SC = O(1)
        int[] ans = { -1,-1};
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
    static int[] better(int[] arr,int target)
    {
        // Time Complexity : O(n)
        // Space Complexity : O(n) -> due to the HashMap used
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = { -1,-1};
        for(int i=0;i<arr.length;i++)
        {
            int c = target - arr[i];
            if(map.containsKey(c))
            {
               ans[0] = map.get(c);
               ans[1] = i;
               break;
            }
            else
                map.put(arr[i],i);
        }
        return ans;
    }
    static void optimal(int[] arr,int target)
    {

    }
}
