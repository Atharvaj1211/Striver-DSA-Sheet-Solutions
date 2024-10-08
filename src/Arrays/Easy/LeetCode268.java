package Arrays.Easy;
// https://leetcode.com/problems/missing-number/description/
public class LeetCode268 {
    public static void main(String[] args) {

    }
    // Here we have used selection sort to sort the array. we can use different sorting
    // techniques to reduce time complexity
    // TC = O(n^2)+O(n)
    public static int missingnumber(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int minpos=i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[minpos]>nums[j]){
                    minpos = j;
                }
            }
            int temp = nums[minpos];
            nums[minpos]=nums[i];
            nums[i]=temp;
        }
        for (int i = 0; i < nums.length; i++) {
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
