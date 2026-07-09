/*
N = 5, the pattern should look like as below:

12345
1234
123
12
1

*/
public class problem19
{
    public static void pattern6(int n) 
    {
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int nums=5;
        pattern6(nums);
    }
}
