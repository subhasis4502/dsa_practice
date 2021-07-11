import java.util.*;

public class App {
    static String UncommonChars(String A, String B){
        int[] ah = new int[26];
        int[] bh = new int[26];
        String uncommon = "";
        
        for(int i = 0; i<A.length(); i++){
            ah[A.charAt(i)-'a']++; //To convert ascii to number
        }
        
        for(int i = 0; i<B.length(); i++){
            bh[B.charAt(i)-'a']++; //To convert ascii to number
        }
        
        for(int i = 0; i<ah.length; i++){
            if(ah[i] > 0 && bh[i] == 0 || ah[i] == 0 && bh[i] > 0)
                uncommon += (char)(i + 'a'); //Again converting the number to ascii
        }
        
        if (uncommon == "")
            uncommon = "-1";
        return uncommon;
    }
    
    //Not applicable if duplicate characters are there in a string

        /* String temp = A+B;
        char[] t = temp.toCharArray();
        Arrays.sort(t);
        String uncommon = "";
        
        int i = 0, j = 1;
        int count = 0;
        while(i < temp.length()){
            if(i+j < temp.length() && t[i] == t[i+j]){
                j++;
                count++;
            }
            else{
                if(count == 0)
                    uncommon += t[i];
                i += j;
                j = 1;
                count = 0;
            }
        }
        return uncommon;
    } */

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeksquiz";

        System.out.println(UncommonChars(s1, s2));
    }
}
