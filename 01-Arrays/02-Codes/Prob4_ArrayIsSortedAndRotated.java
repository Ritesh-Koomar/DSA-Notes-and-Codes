import java.util.Arrays;
public class prob4 {
    public static void main(String[] args) {
        int[] arr = { 9, 1 , 3 , 5 , 7 , 8};
        System.out.println(Arrays.toString(arr));
        System.out.println("The answer is "+sorted(arr));
    }
    static boolean sorted(int[] arr)
    {
        int n = arr.length;
        int count = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[(i+1)%n])
                count++;
        }
        if(count>1)
            return false;
        return true;
    }
}
