/*
Switch Case
Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 7 or less than 1, print Invalid.
Ensure only the 1st letter of the answer is capitalised.
 */
class Solution {
    public static void whichWeekDay(int day) 
    {
        switch(day)
        {
            case 1:
            if(day==1)
            {
                System.out.println("Monday");
            }
            break;
            case 2:
            if(day==2)
            {
                System.out.println("Tuesday");
            }
            break;
            case 3:
            if(day==3)
            {
                System.out.println("Wednesday");
            }
            break;
            case 4:
            if(day==4)
            {
                System.out.println("Thursday");
            }
            break;
            case 5:
            if(day==5)
            {
                System.out.println("Friday");
            }
            break;
            case 6:
            if(day==6)
            {
                System.out.println("Saturday");
            }
            break;
            case 7:
            if(day==7)
            {
                System.out.println("Sunday");
            }
            break;
            default:
                if(day<1 || day >7)
                {
                    System.out.println("Invalid");
                }
        }
    }
    public static void main(String[] args)
    {
        int d=8;
        whichWeekDay(d);
    }
}