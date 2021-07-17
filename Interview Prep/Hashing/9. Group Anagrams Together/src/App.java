import java.util.*;

public class App {
    public static boolean compareArr(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
    public List<List<String>> Anagrams(String[] string_list) {
        
        int[][] hash = new int[26][26];
        List<String> word = new List<>();
        //135
        for (int i = 0; i < string_list.length; i++) {
            for(int j = 0; j<string_list[0].length(); j++){
                hash[i][string_list[i].charAt(j) - 'a']++;
            }
        }

        for (int i = 0; i < string_list.length-1; i++) {
            for (int j = i; j < string_list.length-1; j++)
                if(compareArr(hash[i], hash[j]))


        }
        
        
    }
    
    
}
