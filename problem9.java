/* second largest number */

class Solution9
{
    public static int secondlargestNum(int[] nums)
    {
        int largest=nums[0];
        int secondlargest=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>largest)
            {       
                secondlargest=largest;
                largest=nums[i];
            }   
            else if(nums[i]>secondlargest)
            {
                secondlargest=nums[i];
            }    
        }
        return secondlargest;
    }
    public static void main(String[] args)
    {
        int[] numsArray={100,50,200};
        int secondlargest=secondlargestNum(numsArray);
        System.out.println("Largest number - " +secondlargest);

    }
}