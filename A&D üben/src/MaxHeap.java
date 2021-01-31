import java.util.Arrays;

class MaxHeap {
	
	public static void main(String[] args) {
		MaxHeap max = new MaxHeap();
		max.buildHeap();
		System.out.println(Arrays.toString(max.values));
		max.deleteMax();
		System.out.println(Arrays.toString(max.values));
		max.insert(89);
		System.out.println(Arrays.toString(max.values));
	}
    //
    // We assume that the heap will not exceed MAX_HEAPSIZE length
    //
    final static int MAX_HEAPSIZE = 100000;    
    //
    // This field describes the number of elements that the heap holds
    //
    private int N = 6;
    //
    // The values of the heap are stored in this array
    //
    //private int values[] = new int [MAX_HEAPSIZE];    
    private int[] values = {2, 5, 3, 1, 7, 8, 0};
    //
    // Default empty constructor
    //
    public MaxHeap () { 
      // do nothing ...
    }    
    //
    // Helper function that provides comparison.
    //
    private boolean cmp(int a, int b) {
      return a < b;
    }
    //
    // Helper function that swaps the i-th & the j-th element of the heap
    //
    private void swap (int i, int j) {
      int tmp = values[i];
      values[i] = values[j];
      values[j] = tmp;
    }
    //
    // The heap will read the values. In this function, 
    // we assume that the values have partial order that satisfies the heap
    // condition.
    //
    
  
    // ====================================================================================================================
    // Complete the methods below. Feel free to add additional methods / fields if needed.
    // ====================================================================================================================
  
    //
    // We assume that values are already stored in the values[] array, but they
    // do not hold the heap condition and have arbitrary order. We need to 
    // restore the heap condition using the method below.
    //
    
    public void buildHeap () {
       for(int i = N/2; i>=0; i--){
        restoreHeap(i); 
       }
      }
      
    public void restoreHeap(int i) {
      while(2*i<N-1){
        int j = 2*i+1; 
        if(j+1<N){
          if(values[j]<values[j+1]) j+=1;
        }
        if(values[i]>values[j]) return; // dann ist die Heap-Bedingung erfüllt. 
        int save = values[i]; 
        values[i] = values[j]; 
        values[j] = save; 
        i = j; 
      }
    }
    //
    // Inserts a value in the heap, and places it on the right positions such
    // that the heap condition holds.
    //
    public void insert(int value) {             
      //
      // Your code goes here ...
      //
      this.N+=1; 
      values[N] = value; 
      int i = N-1;
      System.out.println(values[i]);
      int b = values[N];
      while(i>0 && values[i/2]<values[i]){
        swap(values[i/2], values[i]);
        i = i/2;
      }
    }
    
    //
    // Pops the first value from the heap, restoring the heap condition
    //
    public void deleteMax () { 
      //
      // Your code goes here ...
      //
      for(int i = 0; i<N; i++){
        values[i] = values[i+1];
      }    
      N--;
      buildHeap();
    }    
    
    // ====================================================================================================================
    // End of implementation
    // ====================================================================================================================
}
