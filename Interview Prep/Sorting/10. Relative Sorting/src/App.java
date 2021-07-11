public class App {
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        int[] arr = new int[N];
        int[] hash = new int[11];
        
        for(int i = 0; i<N; i++){
            hash[A1[i]]++;
        }
        
        int k = 0;
        for(int i = 0; i<M; i++){
            for(int j = 1; j<=hash[A2[i]]; j++){
                arr[k] = A2[i];
                k++;
            }
            hash[A2[i]] = 0;
        }
        
        for(int i = 0; i<hash.length; i++){
            if(hash[i] > 0){
                for(int j = 1; j<=hash[i]; j++){
                    arr[k] = i;
                    k++;
                }
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] A1 = {9, 8, 5, 0, 3, 8, 9, 0};
        int[] A2 = {0, 9};
        int[] arr = sortA1ByA2(A1, A1.length, A2, A2.length);
    }
}
