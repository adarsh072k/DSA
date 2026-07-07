/*
Let's say for N = 4, the pattern should look like as below:

*      *
**    **
***  ***
********
***  ***
**    **
*      *

*/
class problem33 {
    public static void pattern20(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            int midspaces=(2*n)-(2*i);
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<midspaces;k++)
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
     static void pattern19(int n) 
    {
        for(int i=1;i<=n-1;i++)
        {
            int midspaces=(2*i);
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("*");
            }
            for(int k=0;k<midspaces;k++)
            {
                System.out.print(" ");
            }
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
        {
            int nums=4;
            pattern20(nums);
            pattern19(nums);
        } 
}