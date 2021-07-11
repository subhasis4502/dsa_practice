public class App {
    static boolean isPalindrome(String S, int start, int end){
        while(start < end){
            if(S.charAt(start) != S.charAt(end))
                return false;
        }
        return true;
    }
    
    static String maskString(String S, int start, int end){
        String sub_string = "";
        for(int i = start; i<end+1; i++)
            sub_string += S.charAt(i);
        return sub_string;
    }
    static String LongestPalindromeSubString(String text)
    {
        String answer = "";
        //For blank string
        if(text.length() == 0)
            return answer;
        
        int i = 0;
        int j = text.length()-1;
        int max_length = 1;
        while(i < j){
            if(isPalindrome(text, i,j) && j-i > max_length){
                answer = maskString(text, i,j);
                max_length = j-i;
            }
            i++;
            j--;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "babcbabcbaccba";
        System.out.println(LongestPalindromeSubString(s));
    }
}
