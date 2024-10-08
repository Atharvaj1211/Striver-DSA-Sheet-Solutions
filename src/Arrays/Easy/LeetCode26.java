package Arrays.Easy;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// Remove Duplicates from sorted array
public class LeetCode26 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4,5,5,7,9};
        System.out.println(removeduplicates(nums));

    }
    public static int removeduplicates(int[] nums){
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}
