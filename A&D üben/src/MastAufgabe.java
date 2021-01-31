
public class MastAufgabe {
	int[] d = {1}; 
	int[] c; 
	int[] anfang; 
	int[] ende; 
	int R = 2; 
	
	public static void main(String[] args) {
		MastAufgabe mast = new MastAufgabe();
		mast.mobilfunkmasten(3, 10);
	}
	
	public int mobilfunkmasten(int n, int L) {
		int[] dp = new int[n+1];
		dp[0] = 0; 
		dp[1] = d[1];
		for(int i = 1; i<L; i++) {
			if(d[i]!= 0) {
				
			} 
			else continue; 
			if(d[i]-R< d[i-1]+R) {
				dp[i] = Math.min(d[i+1], dp[i-1] + c[i-1]); 
			}
			else {
				
			}
		}
		return dp[n]; 
	}
	
	
}
