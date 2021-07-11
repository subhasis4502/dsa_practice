public class App {
    static boolean areKAnagrams(String s1, String s2, int k)
    {
        if(s1.length() != s2.length())
            return false;
        if(s1.length() == k)
            return true;
        int common = 0;
        for(int i = 0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    common++;
                    break;
                }
            }
        }
        
        if(k >= s1.length()-common)
            return true;
        return false;
    
    }
    public static void main(String[] args) {
        String s1 = "iofuurciddwit";
        String s2 = "imsfwksvlnepr";

        System.out.println(areKAnagrams(s1, s2, 11));
    }
}
