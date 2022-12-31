package microsoft;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {
	public static int findUnsortedSubarray(int[] nums) {
        int copy[] = new int [nums.length];
        for(int i = 0 ;i< nums.length ;i++)
        {
            copy[i]=nums[i];
        }
        Arrays.sort(nums);
        int n = nums.length;
        int i=0,j=n-1;
        for(;i<n;i++)
        {
            if(nums[i]!=copy[i])
                break;
        }
        for(;j>=0;j--)
        {
            if(nums[j]!=copy[j])
                break;
        }
        int c=0;
        for(int k=i;k<=j;k++)
        {
            c++;
        }
        return c;
    }
	public static void main(String[] args) {
		int arr[]= {2,6,4,8,10,9,15};
		System.out.println(ShortestUnsortedContinuousSubarray.findUnsortedSubarray(arr));
	}

}
