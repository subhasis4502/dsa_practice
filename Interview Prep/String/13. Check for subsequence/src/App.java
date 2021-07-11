public class App {
    static boolean isSubSequence(String A, String B){
        int j = 0; //Index for string A
        int count = 0; //Count the number of matched element
        int i = 0;
        while(i < B.length()){
            if(A.charAt(j) == B.charAt(i)){
                count++;
                j++;
                if(j >= A.length())
                    break;
            }
            i++;
        }
        if(count == A.length())
            return true;
        return false;
    }
    public static void main(String[] args) {
        String A = "gksrek";
        String B = "geeksforgeeks";

        System.out.println(isSubSequence(A, B));
    }
}
