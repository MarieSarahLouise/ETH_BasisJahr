import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class Lat {

	public static void main(String args[]) {
		int[] test = {4, 9, 8, 13, 10, 11, 7, 3, 16, 3};
		System.out.println(laT(test));
	} // jetzt noch backtracking implementieren.
	
	public static int laT(int[] array) {
		
		ArrayList<Integer> dp = new ArrayList<Integer>();
		HashMap<Integer, Integer> parents = new HashMap<Integer, Integer>();
		
		dp.add(0);
		parents.put(0, 0);
		dp.add(array[0]);
		System.out.println(dp.size());
		for(int i = 1; i<array.length; i++) {
			if(array[i] >= dp.get(dp.size()-1)) {
				parents.put(array[i], dp.get(dp.size()-1)); 
				dp.add(array[i]);
			}
			else if(array[i] < dp.get(dp.size()-1)) {
				int k = dp.size()-2; 
				while(k > 0 && dp.get(k) > array[i]) {
					k--;
				}
				dp.set(k, array[i]);
				if(k>0)
				parents.put(array[i], dp.get(k-1));
			}
		}
		int[] output = new int[dp.size()];
		int i = dp.size()-1; 
		int k = dp.get(dp.size()-1);
		
		while(parents.get(k) != 0) {
			output[i] = parents.get(k);
			i--;
			k = parents.get(k);
		}
		System.out.println(Arrays.toString(output));
		return dp.size();
	}
}
