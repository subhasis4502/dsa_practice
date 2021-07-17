import java.util.ArrayList;

public class App {
    static int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int count = 0;
        int i = 0, j = 0;
        int k = n-1, l = n-1;
        
        while(i != n-1 && j != n-1 || k >= 0 && l >= 0){
            if(mat1[i][j] + mat2[k][l] < x){
                if(j == n-1){
                    j = 0;
                    i++;
                }
                else
                    j++;
            }
            
            else if(mat1[i][j] + mat2[k][l] > x){
                if(l == 0){
                    l = n-1;
                    k--;
                }
                else
                    l--;
            }
            
            else{
                count++;
                if(j == n-1){
                    j = 0;
                    i++;
                }
                else
                    j++;
                    
                if(l == 0){
                    l = n-1;
                    k--;
                }
                else
                    l--;
                
            }

            if(i == n || l == -1)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] mat1 = { {1,2},{3,4}};
        int[][] mat2 = { {4,5},{6,7}};

        System.out.println(countPairs(mat1, mat2, mat1.length, 10));
    }
}
