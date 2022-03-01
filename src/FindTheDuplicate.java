import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    public static Set<Integer> findDuplicateByBrute(int ... num){
        Set<Integer> duplicates = new HashSet<>();
        Arrays.sort(num);
        for(int i = 0; i < num.length; i++){
            for(int x = 0; x < i; x++){
                if(num[x] == num[i]){
                    duplicates.add(num[x]);
                }
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        System.out.println(findDuplicateByBrute(1,1,3, 3, 4, 4,4, 2));
        System.out.println(findDuplicateByBrute(10, 3, 2, 4,4, 2));
    }
}