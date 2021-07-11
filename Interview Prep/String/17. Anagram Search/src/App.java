public class App {
    static int remAnagrams(String s,String s1)
    {
        int[] sh = new int[26]; //Hashmap for 's'
        int[] s1h = new int[26]; //Hashmap for 's1'
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            sh[s.charAt(i)-'a']++; //To convert ascii to number
        }
        
        for(int i = 0; i<s1.length(); i++){
            s1h[s1.charAt(i)-'a']++;
        }
        
        for(int i = 0; i<sh.length; i++){
            if(Math.abs(sh[i] - s1h[i]) != 0)
                count += Math.abs(sh[i] - s1h[i]);
        }
        return count;
    }
    
    public static void main(String[] args) {
        String s = "bcadeh";
        String s1 = "hea";

        System.out.println(remAnagrams(s, s1));
    }
}
