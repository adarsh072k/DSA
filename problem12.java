/*

 */
import java.util.Arrays;
class Solution12
{
    public int[] reverseArray(int[] nums)
    {
        int left=0;
        int right=nums.length-1;
        int k=0;
        while(left<right)
        {
            k=nums[left];
            nums[left]=nums[right];
            nums[right]=k;
            left++;
            right--;
            return nums[];
        }
    }
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5};
        nums=reverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
