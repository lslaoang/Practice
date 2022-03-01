import java.util.Arrays;

public class FindTheDuplicate {
    private static int findDuplicate(int[] nums) {
        int n = nums.length;
        //Initialize two pointers slow and fast as nums[0].
        int slow = nums[0], fast = nums[0];
        // Do slow = nums[slow] and fast = nums[nums[fast]]'
        // while slow and fast are not equal.
        do {
            slow = nums[slow];
            System.out.println("Slow " +slow);
            fast = nums[nums[fast]];
            System.out.println("Fast " + fast);
        } while (slow != fast);
        // assign slow as nums[0]
        slow = nums[0];
        // Move slow and fast by one step each while slow and fast are not equal
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        // Both slow and fast points to the duplicate element
        return fast;
    }

    public static int findDuplicateByBrute(int ... num){
        Arrays.sort(num);
        for(int i = 0; i < num.length; i++){
            for(int x = 0; x < i; x++){
                if(num[x] == num[i]){
                    return num[x];
                }
            }
        }

        return 1;
    }
    public static void main(String[] args) {
        // Example 1
        int nums[] = new int[]{1, 3, 4, 4,4, 2};
      //  System.out.println(findDuplicate(nums));
        // Example 2
       // nums = new int[]{3, 1, 5, 4, 2, 5};
       // System.out.println(findDuplicate(nums));

        System.out.println(findDuplicateByBrute(nums));
    }
}