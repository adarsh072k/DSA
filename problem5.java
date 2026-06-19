/* accessing characters in string */

class Solution5
{
    public static void accessCharacters(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args)
    {
        String word = "adarsh";
        accessCharacters(word);
    }
}