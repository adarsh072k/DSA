/* low =1 , high = 5 , output = 15, explaination 1+2+3+4+5=15 */

class Solution10 {
    public static int forLoop(int low, int high) 
    {
        int sum=0;
        for(int i=low;i<=high;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int l=1;
        int h=5;
        int sum=forLoop(l,h);
        System.out.println("Sum desired - "+sum);
    }
}