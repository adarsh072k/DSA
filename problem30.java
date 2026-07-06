/*
Let's say for N = 4, the pattern should look like as below:

   A
  ABA
 ABCBA
ABCDCBA

*/

public class problem30 {
    public static void pattern17(int n) 
    {
        for(int i=0;i<n;i++)
        {
            int spaces=(n-1)-i;
            char ch='A';
            int printedElements=(2*i)+1;
            for(int j=0;j<spaces;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<printedElements;k++)
            {
                System.out.print(ch);
                if(k<i)
                {
                    ch++;
                }
                else{
                    ch--;
                }
                
            }
            System.out.println();
        }   
    }
    public static void main(String[] args)
    {
        int nums=4;
        pattern17(nums);
    } 
}
