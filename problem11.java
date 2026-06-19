/* Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
A number ends with digit d if its last digit is d.

Example 1

Input: d = 1

Output: 12300

Explanation:

The first 50 positive integers ending with 1 are: 1, 11, 21, 31, ..., 491

Their sum is 12300.*/


class Solution11
{
    public static int sumWhileLoop(int d)
    {
        int num=d;
        //edge case when d=0, sum won't be 10 it should not be 0
        if(num==0)
        {
            num=10;
        }
        int sum=0;
        int count=0;
        while(count<50)
        {
            sum=sum+num;
            num=num+10;
            count++;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int input=1;
        int sum=sumWhileLoop(input);
        System.out.println(sum);
    }
}