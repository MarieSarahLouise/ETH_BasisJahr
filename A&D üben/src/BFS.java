import java.util.LinkedList;
import java.util.Queue; 

public class BFS {
	
	
	public LinkedList<Integer> bfs(int start, int[] vs, int[][] edges) {
		Queue queue = new LinkedList<Integer>();
		LinkedList<Integer> liste = new LinkedList<Integer>();
		boolean[] visited = new boolean[vs.length];
		visited[start] = true; 
		queue.offer(start);
		while(!queue.isEmpty()){
			int v = (int) queue.poll();
			if(!liste.contains(v))liste.add(v);
			for(int i = 0; i<edges[v].length; i++) {
				queue.offer(edges[v][i]);
			}
		}
		return liste; 
	}
}
