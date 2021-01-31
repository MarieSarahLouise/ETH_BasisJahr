import java.util.ArrayList;
import java.util.Arrays;


public class Dijkstra {
	
	public Dijkstra(int n, int[][] edges, int[][] weight) {
		for(int i = 0; i<n; i++) {
			heap.add(new Pair(i, Integer.MAX_VALUE));
		}
	}

	public int[][] edges; 
	public int[][] weight; 
	public int size; 
	public int[] cost = new int[size]; 
	
	ArrayList<Pair> heap = new ArrayList<Pair>();
	
	public static void main(String[] args) {
		int n = 8;
		int[][] edges = {{1},{2, 7}, {3, 9, 10}, {10, 4}, {5}, {6}, {}, {8}, {8}, {}};
		int[][] weight = {{0}, };
		Dijkstra d= new Dijkstra(n, edges, weight);
	}
	
	public int[] dijkstra(int start) { 
		boolean[] found = new boolean[size];
		int[] weights = new int[size];
		heap.set(start, new Pair(start, 0));
		makeHeap(heap);
		
		while(heap.size()!= 0) {
			Pair a = heap.remove(0);
			int vertex = a.vertex;
			cost[vertex] = a.distance;
			for(int i = 0;i<edges[vertex].length; i++) {
				int u = edges[vertex][i];
				if(!found[u]) {
					Pair v = heap.get(u);
					v.distance = Math.min(v.distance, weight[vertex][u]+a.distance);

					System.out.println(v.distance);
				}
			}
			
		}
		return cost;
	}
	
	public void makeHeap(ArrayList<Pair> array) {
		for(int i = array.size()/2; i>=0; i--) {
			repareHeap(i, array);
		} 
	}
	
	public void repareHeap(int i, ArrayList<Pair> array) {
		while(2*i+1<array.size()) {
			int j = 2*i+1;
			if(j+1 < array.size() && array.get(j).compareTo(array.get(j+1)) == 1) j++; 
			if(array.get(i).compareTo(array.get(j))== -1) return; //Heap Bedingung erfüllt
			
				Pair save = array.get(i); 
				array.set(i, array.get(j));
				array.set(j, save); 
		i = j; 
		}
	}
}
