package Arrays.Easy;
// https://leetcode.com/problems/max-consecutive-ones/
public class LeetCode485 {
    public static void main(String[] args) {

    }
    public int findMaxConsecutiveOnes(int[] nums){
        int count =0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
