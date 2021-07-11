public class App {
    public static void frequencyCount(int arr[], int N, int P)
    {
        int[] arrh = new int[P];
        for(int i = 0; i<N; i++){
            arrh[arr[i]-1]++;
        }
        
        for(int i = 0; i<4; i++){
            System.out.println(arrh[i]);
        }
    }

    ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
        ArrayList<Long> ans = new ArrayList<>();
        int[] ah = new int[100001];
        
        for(int i = 0; i<N; i++)
            ah[(int)A[i]]++;
            
        for(int i = 0; i<M; i++)
            ah[(int)B[i]]--;
            
        for(int i = 0; i<ans.length; i++){
            if(ah[i] > 0)
                ans.add(i);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {3,3,3,3};
        frequencyCount(arr, arr.length, 3);
    }

}
