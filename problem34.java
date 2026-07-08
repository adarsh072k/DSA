/*
Let's say for N = 4, the pattern should look like as below:

****
*  *
*  *
****

*/
class problem34 {
    public static void pattern21(int n) 
    {
        int i;
        for(i=0;i<n;i++)
        {
            if(i==0 || i==n-1)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                int spaces =n-2;
                System.out.print("*");
                for(int k=0;k<spaces;k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int nums=4;
        pattern21(nums);
    } 
}