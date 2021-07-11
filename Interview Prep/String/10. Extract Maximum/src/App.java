public class App {

    static int extractMaximum(String S) 
    { 
        S = S.replaceAll("[^0-9]", " ");
        int val = 0;
        int max_val = Integer.MIN_VALUE;
        
        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i) != ' '){
                val = val*10 + (S.charAt(i)-'0');
                if(i+1== S.length() || S.charAt(i+1) == ' '){ 
                    if(val > max_val)
                        max_val = val;
                    
                    val = 0;
                }
            }
        }
        
        if(max_val == Integer.MIN_VALUE)
            return -1;
        return max_val;
    }    
    
    public static void main(String[] args) {
        //String s = "100klh564abc365bg";
        //String s = "abchsd0sdhs";
        String s = "1000000";
        System.out.println(extractMaximum(s));

    }
}
