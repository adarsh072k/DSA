/* second Largest */
class Solution13
{
    public static int secondLargestElement(int[] nums)
    {
        int largest = nums[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>largest)
            {
                secondLargest=largest;
                largest=nums[i];
            }
            else if(nums[i]<largest && nums[i]>secondLargest)
            {
                secondLargest=nums[i];
            }
            else if(nums[i]==largest && nums[i]==secondLargest)
            {
                return -1;
            }
        }
        if(secondLargest==Integer.MIN_VALUE)
        {
            return -1;
        }
        return secondLargest;
    }
    public static void main(String[] args)
    {
        int[] nums={10,10,10};
        int secondLargest=secondLargestElement(nums);
        System.out.println(secondLargest);
    }
}