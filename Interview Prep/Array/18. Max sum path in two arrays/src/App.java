public class App {
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    long mul = 1;
	    long[] product = new long[n];
	    if(n == 0){
	        product[0] = 0;
	        return product;
	    }
	    
	    else{
    	    for(int i = 0; i<n; i++)
    	        mul *= nums[i];
    	    
    	    for(int i = 0; i<n; i++){
                if(nums[i] != 0)
    	            product[i] = (mul/nums[i]);
                else
                    product[i] = nums[i-1];
    	    }
	    }
	    
	    return product;
        
    }

    public static void main(String[] args){
        int[] ar1 = {12,0};

        long[] ar2 = productExceptSelf(ar1, ar1.length);
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar2[i] + " ");
        }
    }
}
