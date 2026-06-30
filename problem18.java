/*
N = 5, the pattern should look like as below:

*****
****
***
**
*

*/
public class problem18 
{
    public static void pattern5(int n) 
    {
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int nums=5;
        pattern5(nums);
    }
}
