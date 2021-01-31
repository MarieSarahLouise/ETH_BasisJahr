import java.util.Arrays;
public class Bubblesort {
	
	public static void main(String args[]) {
		int[] test = {3, 2, 1, 5, 8, 0};	
		System.out.println(Arrays.toString(sort(test)));
	}
	
	public static int[] sort(int[] toBeSorted) {
		for(int i = 0; i<toBeSorted.length; i++) {
			for(int j = 0; j<toBeSorted.length-i-1; j++) {
				if(toBeSorted[j]>toBeSorted[j+1]) {
					int c = toBeSorted[j+1]; 
					toBeSorted[j+1] = toBeSorted[j];
					toBeSorted[j] = c; 
				}
			}
		}
		return toBeSorted;
	}
}
