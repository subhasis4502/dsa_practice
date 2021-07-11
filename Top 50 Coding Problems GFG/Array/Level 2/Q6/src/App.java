public class App {
    public static void main(String[] args) throws Exception {
        String str = "Hello";
        int i = 0;
        int j = str.length()-1;
        char ch[] = str.toCharArray();
        
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        str = ch.toString();
        
        for (int k = 0; k < ch.length; k++) {
            System.out.println(ch[k]);
        }
    }
}
