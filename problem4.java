/* Input Output 
Complete the function printNumber which takes an integer input from the user and prints it on the screen.
*/
import java.util.Scanner;
class Solution {
    public static void printNumber(Scanner sc) 
    {
        int num=sc.nextInt();
        System.out.println("integer taken by user :- " +num);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        printNumber(sc);
    }
}
