import java.util.Arrays;
public class MaxSubArraySum {

	public static void main(String args[]) {
		int[] test = {2, 5, -7, 3, 8, 10, -9, 5, 0};
		int[] test2 = {3, 7, 8, -10, 9, 3};
		System.out.println(maxSubSum(test2));
	}
	
	 public static int maxSum(int[] a) { 
		 int[] dp = new int[a.length+1];
		 int maxValue = a[0]; //maxValue
		 dp[0] = 0; 
		 dp[1] = a[0]; // base case
		 for(int i = 2; i< a.length; i++) {
			 if(dp[i-1] <= 0) dp[i] = a[i-1]; 
			 else dp[i] = a[i-1] + dp[i-1];
			 if(dp[i] >= maxValue) maxValue = dp[i];
		 }
		//with Arrays.sort:  Arrays.sort(dp);
		 return maxValue;
	 }
	 
	 public static int maxSubSum(int[] a) {
		 int dp[] = new int[a.length+1];
		 dp[0] =  0; dp[1] = a[0]; 
		 
		 for(int i = 2; i<a.length+1; i++) {
			 if(dp[i-1]<= 0) dp[i] = a[i-1];
			 else dp[i] = dp[i-1]+ a[i-1];
		 }
		 System.out.println(Arrays.toString(dp));
		 return dp[dp.length-1];
	 }
	 
	 
}
