public class App {
    static int longestSubstrDitinctChars(String S){
        int[] sh = new int[26];
        String check = "";
        int count = 0;
        for(int i = 0; i<S.length(); i++){
            sh[S.charAt(i)-'a']++; //To convert ascii to number
        }
        
        for(int i = 0; i<sh.length; i++){
            if(sh[i] > 0){
                count++;
                check += (char)(i + 'a');
            }
        }
        
        return check.length();
        
    }
    public static void main(String[] args) {
        String S = "aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";
        System.out.println(longestSubstrDitinctChars(S));
    }
}
