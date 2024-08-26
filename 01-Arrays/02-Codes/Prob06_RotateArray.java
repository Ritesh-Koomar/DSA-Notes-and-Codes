import java.util.Arrays;
public class prob6 {
    public static void main(String[] args) {
        int[] arr = { 1 , 2, 3 , 4 , 5 , 6 , 7};
        System.out.println("Array before rotation : "+Arrays.toString(arr));
        rotate(arr,3);
        System.out.println("Array after rotation : "+Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public static void reverse(int[] arr,int s,int e)
    {
        while(s<=e)
        {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
    }
}
