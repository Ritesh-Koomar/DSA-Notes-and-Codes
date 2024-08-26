public class prob1_LargestNumber {
    public static int findMaxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {34, 23, 97, 2, 23, 93, 23, 99};
        int max = findMaxElement(arr);
        System.out.println("The Maximum number in the array is: " + max);
    }
}
