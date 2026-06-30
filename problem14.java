/*
pattern 1 -

example n-3

output -

***
***
***

*/
class Solution14 {
    public static void pattern1(int n) {
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<n;j++)
            {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int nums=3;
        pattern1(nums);
    }
}
