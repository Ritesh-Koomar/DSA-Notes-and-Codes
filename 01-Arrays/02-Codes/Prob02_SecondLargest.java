import java.util.Arrays;
public class prob2_SecondLargestNumber {
    public static int SecondMaxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        int sl = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            if(sl<arr[i] && arr[i]<max)
                sl = arr[i];
        }
        return sl;
    }
    public static void main(String[] args) {
        int[] arr = {34, 23, 97, 2, 23, 93, 23, 99};
        System.out.println(Arrays.toString(arr));
        int max = SecondMaxElement(arr);
        System.out.println("The second largest number in the array is: " + max);
    }
}
