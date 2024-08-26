import java.util.Arrays;

public class prob3 {
    public static void main(String[] args) {
       int[] arr = { 1 , 3 , 5 , 7 , 9};
        System.out.println(Arrays.toString(arr));
        System.out.println("The answer is "+sorted(arr));
    }
    static boolean sorted(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
}
