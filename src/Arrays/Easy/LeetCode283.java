package Arrays.Easy;
// https://leetcode.com/problems/move-zeroes/
public class LeetCode283 {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }
}
