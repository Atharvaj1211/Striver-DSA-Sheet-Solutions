package Arrays.Easy;

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/submissions/1415735168/
public class Leetcode1752 {
    public static void main(String[] args) {

    }
    static boolean check(int[] nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
        }
        if(count>1){
            return false;
        }else return true;
    }
}
