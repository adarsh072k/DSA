/*
N = 5, the pattern should look like as below:

1
12
123
1234
12345

*/
public class problem16 
{
    public static void pattern3(int n) {
        for(int i=1;i<=n;i++)
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
        pattern3(nums);
    }
}
