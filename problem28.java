/*
 Let's say for N = 5, the pattern should look like as below:

ABCDE
ABCD
ABC
AB
A

*/

public class problem28 {
    public static void pattern15(int n) 
    {
        for(int i=n;i>=1;i--)
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
        pattern15(nums);
    }   
}
