/* smallest number */

class Solution7
{
    public static int smallestNum(int[] nums)
    {
        int smallest=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<smallest)
                smallest=nums[i];
        }
        return smallest;
    }
    public static void main(String[] args)
    {
        int[] numsArray={4,7,3};
        int smallest=smallestNum(numsArray);
        System.out.println("smallest number - " + smallest);
    }
}