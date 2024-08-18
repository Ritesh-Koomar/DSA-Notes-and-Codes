public class prob5 {
    public static int removeDuplicates(int[] nums) {
        // Solution 2: Time Complexity: O(N) & Space Complexity: O(1)
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
