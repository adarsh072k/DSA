/* Sum of array elements */

/* smallest number */

class Solution8
{
    public static int sumArray(int[] nums)
    {
        int add=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            add=add+nums[i];
        }
        return add;
    }
    public static void main(String[] args)
    {
        int[] numsArray={4,7,3};
        int add=sumArray(numsArray);
        System.out.println("sum of array elements - " +add);

    }
}