/*
N = 5, the pattern should look like as below:

*********
 *******
  *****
   ***
    *

*/
public class problem21 
{
    public static void pattern8(int n)
    {
        for(int i=0;i<n;i++)
        {
            int spaces =i;
            int stars = 2*n-1-2*i;
            for(int j=0;j<spaces;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<stars;k++)
            {
                 System.out.print("*");
            }
            System.out.println();
        }
         
    }

    public static void main(String[] args)
    {
        int nums=4;
        pattern8(nums);
    }
}
