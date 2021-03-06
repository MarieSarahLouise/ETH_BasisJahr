
public class MinimumEdit {

	public static void main(String args[]) {
		String[] a = {"M", "A", "R", "I", "E"};
		String[] b = {"L", "O","U", "I","S", "E"};
		System.out.println(minEd(a, b));
	}
	
	public static int minEd(String[] A, String[] B) {
		int[][] dp = new int[A.length+1][B.length+1];
		for(int i = 0; i<A.length; i++) {
			dp[i][0] = 0; 
		}
		for(int i = 0; i<B.length; i++) {
			dp[0][i] = 0; 
		}
		for(int i = 1; i<dp.length; i++) {
			for(int j = 1; j<dp[i].length; j++) {
				if(A[i-1] == B[j-1]) {
					dp[i][j] = Math.min(dp[i-1][j-1], dp[i][j-1]);
				} else {
					dp[i][j] = Math.min(dp[i-1][j]+1, dp[i][j-1]+1);
				}
			}
		}
		return dp[A.length][B.length];
	}
}
