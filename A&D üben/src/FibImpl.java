import java.util.Arrays;

public class FibImpl {
	static int n = 50;
	static long[] dp = new long[n+1];
	
	public static void main(String args[]) {
		//System.out.println(fibRek(n)+ " rekursion");
		
		long[] a = new long[n+1];
		
		System.out.println(fibMemo(n, a)+ " memoization");
		
		System.out.println(FibDP(n)+ " DP");
	}
	
	public static long fibRek(int n ){
		long f = 0; 
		if(n<=2) return 1;
		f = fibRek(n-1) + fibRek(n-2);
		return f; 
	}
	
	public static long fibMemo(int n, long[] mem) { 
		long f = 0; 
		if(n <= 2) return 1; 
		if(mem[n] != 0) return mem[n];
		f = fibMemo(n-1, mem) + fibMemo(n-2, mem);
		mem[n] = f;
		return f; 
	}
	
	public static long FibDP(int n) {
		dp[0] = 1; dp[1] = 1; dp[2] = 1; 
		for(int i = 3; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(Arrays.toString(dp)); 
		return dp[n];
	}
	
	// TODO: Speicherplatz sparen, indem man nur die letzten zwei Elemente speichert.
}
