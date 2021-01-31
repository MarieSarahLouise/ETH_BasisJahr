
public class MaximizingExpression {
	
	int[][] test = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13, 14 ,15, 16}};
	public static void main(String args[]) {
		MaximizingExpression max = new MaximizingExpression();
		int[] test = {7, 4, -3, 6};
		String[] ops = {"+", "+", "*", "+"};
		max.maxExp(test, ops);
	}
	
	public int maxExp(int[] A, String[] B) {
		int[][] dp = new int[A.length+1][A.length+1];
		
		int a = test.length;
		for(int i = 0; i<test.length-i; i++) {
			for(int j = i+(test.length-a); j<test.length; j++) { // Diagonal durch die matrix iterieren.
				
				System.out.println(this.test[i][j]);
				/*if(B[i-1].equals("+")) {
					
				}
				else if(B[i-1].equals("*")) {
					
				}
				j = i; */
			}
			a--;
		}
		return dp[0][A.length];
	}
}
