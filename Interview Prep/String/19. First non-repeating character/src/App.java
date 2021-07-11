public class App {
    static char nonrepeatingCharacter(String S)
    {
        int[] sh = new int[26];
        char non_repeat = '\0';
        for(int i = 0; i<S.length(); i++){
            sh[S.charAt(i)-'a']++; //To convert ascii to number
        }
        
        for(int i = 0; i<S.length(); i++){
            if(sh[S.charAt(i)-'a'] == 1){
                non_repeat = S.charAt(i);
                return non_repeat;
            }
        }
        return non_repeat;
    }
    public static void main(String[] args) {
        String S = "hello";
        System.out.println(nonrepeatingCharacter(S));
    }
}
