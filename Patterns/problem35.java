/*
Let's say for N = 4, the pattern should look like as below:

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

*/
public class problem35 {
    public static void pattern22(int n) 
    {
        for(int i = 0; i < (2*n-1); i++)
        {
            for(int j = 0; j < (2*n-1); j++)
            {
                int top=i;
                int left=j;
                int bottom = (2*n-2)-i;
                int right = (2*n-2)-j;

                int minDistance = Math.min(
                    Math.min(top, bottom),
                    Math.min(left, right)
                );

                System.out.print((n - minDistance) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int nums=4;
        pattern22(nums);
    } 
}
