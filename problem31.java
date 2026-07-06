/*
Let's say for N = 4, the pattern should look like as below:

D 
C D 
B C D 
A B C D 

*/
public class problem31 {
    public static void pattern18(int n) 
    {
        //first character found 
        char ch = (char) ('A' + n - 1);
        
        for(int i=1;i<=n;i++)
        {
            //copy of ch created
            char ch1=ch;
            for(int j=1;j<=i;j++)
            {
                //ch copy incremented only inside this loop
                System.out.print(ch1+ " ");
                ch1++;
            }
            System.out.println();
            ch--;
        }
    }
    public static void main(String[] args)
    {
        int nums=4;
        pattern18(nums);
    } 
}
