/*
N = 5, the pattern should look like as below:


*
**
***
****
*****
****
***
**
*

*/
public class problem23
{
    public static void pattern10(int n) 
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int nums=4;
        pattern10(nums);
    }
}