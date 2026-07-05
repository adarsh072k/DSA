/*
Let's say for N = 5, the pattern should look like as below:

1        1
12      21
123    321
1234  4321
1234554321

 */

public class problem25 {
    public static void pattern12(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            int middleSpaces = 2 * (n - i) - 1;
            //left pattern
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            //middle space
            for(int k=0;k<=middleSpaces;k++)
            {
                System.out.print(" ");
            }
            //right pattern
            for(int jj=i;jj>=1;jj--)
            {
                System.out.print(jj);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int nums=4;
        pattern12(nums);
    }
}