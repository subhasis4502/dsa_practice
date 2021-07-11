class App
{
    static boolean isPossible (String str)
    {
        int[] count = new int[256];
 
        //Finding the values of respective ascii value and increment their count
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
 
        int odd = 0;
        //Checking the count array
        for (int i = 0; i < 256; i++) {
            //Odd means palindrom not possible
            if ((count[i] & 1) != 0)
                odd++;
 
            //Even means palindrome possible
            if (odd > 1)
                return false;
        }
 
        return true;
    }

    public static void main(String args[])
    {
        System.out.println(isPossible("geeksforgeeks") ? "Yes": "No");
        System.out.println(isPossible("geeksogeeks") ? "Yes": "No");
    }
}