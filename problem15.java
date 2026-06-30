/*

N = 5, the pattern should look like as below:

*
**
***
****
*****

*/
public class problem15 
{
    public static void pattern2(int n) 
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int nums=5;
        pattern2(nums);
    }
}
