public class App {

    //Bruteforce Method:
    //1. Taking a distance to max ineger value, and using i, j finding out the values of x,y in arrar
    //2. Checking if x and y is present and if the distance is greater than current distance
    //3. Update the distance if necessary and return it
    /* static int minDist(int a[], int n, int x, int y) {
        int distance = Integer.MAX_VALUE; // Taking the maximum possible integer value
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if(a[i] == x && a[j] == y || a[j] == x && a[i] == y && distance > Math.abs(j-i)){ //Checking for difference between i & j
                    distance = Math.abs(j-i);
                }
            }
        }
        if(distance == 0)
            return -1;
        else
            return distance;
    } */

    //Efficient Method:
    //1. Find out any value x or y and stored in prev.
    //2. Traversing the array to find the another value among x or y
    //3. If we find them, calculate their distance and if the distance is smaller than the previous distance then replace it
    //4. Then return -1 if the distance value is not changed, otherwise return distance
    static int minDist(int a[], int n, int x, int y){
        int prev = -1;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x || a[i] == y){
                prev = i;
                break;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] == x || a[i] == y){
                if(a[prev] != a[i] && (i - prev) < distance){
                    distance = i - prev;
                    prev = i;
                }
                else
                    prev = i;
            }
        }
        if(distance==Integer.MAX_VALUE)
            return -1;
        return distance;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 2};

        System.out.println(minDist(arr, arr.length, 1, 5));
    }
}
