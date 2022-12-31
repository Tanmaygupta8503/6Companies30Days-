package microsoft;

import java.util.Arrays;

public class MinimumDeletionsToMakeArrayDivisible {
	public static int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(numsDivide);
        Arrays.sort(nums);
        int count=0;
         int gcd=0;
        for(int i:numsDivide)
        {  
            gcd=gcd(gcd,i);
        }
       
        for(int i:nums)
        {   
            if(gcd%i==0)
                 return count;
            else  count++;
        }
        return -1;
    }
    private static int gcd(int a, int b){
        if(a<0||b<0){
            return -1;
        }
        if(b == 0){
            return a;
        }
        while(a%b!=0){
            int t = a%b;
            a = b;
            b = t;
        }
        return b;
    }	    
	public static void main(String[] args) {
		int nums[] = {2,3,2,4,3};
		int numsDivide[] = {9,6,9,3,15};
		System.out.println(MinimumDeletionsToMakeArrayDivisible.minOperations(nums, numsDivide));
	}
}
