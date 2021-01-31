import java.util.Arrays;
public class MergeSort {
	
	public static void main(String args[]) {
		int[] test = {3, 2, 1, 5, 8, 0};	
		System.out.println(Arrays.toString(mergeSort(test, 0, 5)));
	}
	
	public static int[] merge(int[] toSort, int left, int middle, int right) {
		int[] B = new int[right-left+1];
		int l = left; int m = middle+1;
		int i = 0; 
		while(l<=middle && m<=right) {
			if(toSort[l]<toSort[m] && i<B.length) {
				B[i] = toSort[l];
				l++;
			} else if(toSort[l]>toSort[m] && i<B.length) {
				B[i] = toSort[m];
				m++;
			}
			i++;
		}
		while(l<=middle && i<B.length) {
			B[i] = toSort[l];
			i++; 
			l++;
		}
		while(m<=right && i<B.length) {
			B[i] = toSort[m]; 
			m++;
			i++;
		} 
		for(int p = 0; p<B.length; p++) {
			if(left+p<=right) {
				toSort[left+p] = B[p]; 
			}
			
		}
		return toSort;
	}
	
	public static int[] mergeSort(int[] toSort, int left, int right) { 
		if(left<right) { 
			int middle = (right+left)/2; 
			mergeSort(toSort, left, middle); 
			mergeSort(toSort, middle+1, right); 
			merge(toSort, left, middle, right); 
		}
		return toSort;
	}
}