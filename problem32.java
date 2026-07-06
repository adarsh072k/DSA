/*
Let's say for N = 4, the pattern should look like as below:

********
***  ***
**    **
*      *
*      *
**    **
***  ***
********

*/

public class problem32 
{
        public static void pattern19(int n) 
        {
            for(int i=1;i<=n;i++)
            {
                int middleSpaces = (2*i)-2;
                for(int j=n;j>=i;j--)
                {
                    System.out.print("*");
                }
                for(int k=0;k<middleSpaces;k++)
                {
                    System.out.print(" ");
                }
                for(int j=n;j>=i;j--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void pattern20(int n) 
        {
            for(int i=1;i<=n;i++)
            {
                int middleSpaces = (2*n)-(2*i);
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                for(int k=0;k<middleSpaces;k++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args)
        {
            int nums=4;
            pattern19(nums);
            pattern20(nums);
        } 
}
