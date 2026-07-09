/*
Let's say for N = 5, the pattern should look like as below:

A
AB
ABC
ABCD
ABCDE

*/

public class problem27 
{
    public static void pattern14(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int nums=4;
        pattern14(nums);
    }   
}
