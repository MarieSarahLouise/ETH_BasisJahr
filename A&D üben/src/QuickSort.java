import java.util.Arrays;

public class QuickSort {
	
	public static void main(String args[]) {
		int[] test = {1, 23, 6, 2, 8, 5, 9};
		System.out.println(Arrays.toString(quickSort2(test, 0, 6)));
	}
	
	public static int partition(int[] A, int l, int r) {
		
		int i = l; 
		int j = r-1;
		int p = A[r]; //pivotElement : letztes Element im Array
		
		while(i<j) {
			while(i<r && A[i] < p ) i++;
			while(j> l && A[j] > p) j--;
			if(i<j) {
				int c = A[i];
				A[i] = A[j]; 
				A[j] = c;
				}
			}
		int d = A[i]; 
		A[i] = A[r]; 
		A[r] = d; 
		return i;
	}
	
	public static int[] quickSort(int[] A, int l , int r) {
		
		if(l<r) {
			int k = partition(A, l, r);
		
		quickSort(A, l, k-1);
		quickSort(A, k+1, r);
		}
		return A; 
		
	}
	
	
	
	public static int[] quickSort2(int[] array, int left, int right) {
		int pivot = quick(array, 0, array.length);
		quickSort2(array, left, pivot); 
		quickSort2(array, pivot+1, right);
		return array; 
	}
	
	public static int quick(int[] array, int left, int right) {
		int pivot = right-1;
		int l = left; int r = right-1;
		
		while(l<r) {
			while(array[l]<array[pivot])l++;
			while(array[r]>array[pivot])r--;
			
			int tmp = array[l]; 
			array[l] = array[r];
			array[r] = tmp; 
		}
		int save = array[l]; 
		array[l] = array[pivot];
		array[pivot] = save; 
		
		return pivot;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
