/*
N = 5, the pattern should look like as below:

1
22
333
4444
55555

*/
public class problem17
{
    public static void pattern4(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int nums=5;
        pattern4(nums);
    }
    
}
