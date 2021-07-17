class App{
    static long countSquares(int m, int n) {
        long answer = 0;
        
        if(m > n){
            //Swap m,ndf
            int temp = m;
            m = n;
            n = temp;
        }
        answer = (long)(m * (m + 1) * (long)(2 * m + 1)/6) + (long)(n - m) * m * (m + 1) / 2;
        return answer;
        
    }

    public static void main(String[] args)
    {
        System.out.println("Count of squares is " + countSquares(9754, 1585));
    }

}