/*

N=4 

1 
0 1 
1 0 1 
0 1 0 1


 */
public class problem24
{
    public static void pattern11(int n) 
    {
        for(int i=0;i<n;i++)
        {
            int num;
            if(i%2==0)
            {
                num=1;
            }
            else
            {
                num=0;
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(num+" ");
                num=1-num;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int nums=4;
        pattern11(nums);
    }
}
