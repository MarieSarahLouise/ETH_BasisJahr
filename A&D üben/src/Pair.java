
public class Pair implements Comparable<Pair>{
	int vertex; 
	int distance; 
	
	public Pair(int vertex, int distance) {
		this.vertex = vertex; 
		this.distance = distance; 
	}

	@Override
	public int compareTo(Pair o) {
		if(this.distance<o.distance) return -1;
		if(this.distance == o.distance) return 0;
		else return 1; 
	}
	
	
}
