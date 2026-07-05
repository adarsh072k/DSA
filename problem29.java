/*
Let's say for N = 5, the pattern should look like as below:

A
AB
ABC
ABCD
ABCDE

*/

public class problem29
{
    public static void pattern16(int n) 
    {
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);   
            }
            System.out.println();
            ch++;
        }
    }
    public static void main(String[] args)
    {
        int nums=4;
        pattern16(nums);
    } 
}
