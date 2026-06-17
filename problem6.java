/* largest number */

class Solution
{
    public static int largestNum(int[] nums)
    {
        int largest=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>largest)
                largest=nums[i];
        }
        return largest;
    }
    public static void main(String[] args)
    {
        int[] numsArray={4,7,3};
        int largest=largestNum(numsArray);
        System.out.println("Largest number - " +largest);

    }
}