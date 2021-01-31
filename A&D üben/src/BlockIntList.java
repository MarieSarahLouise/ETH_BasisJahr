import java.util.Arrays; 

public class BlockIntList {
	private static final int MAX_BLOCKS = 50;
	private static final int FIRST_BLOCK_SIZE = 2;

	private int[][] blocks;
	private int lastBlock;
	private int elemsInLast;
	private int size;

	public BlockIntList() {
		blocks = new int[MAX_BLOCKS][];
		blocks[0] = new int[FIRST_BLOCK_SIZE];
		lastBlock = elemsInLast = size = 0;
	}

	public void add(int value) {
		ensureSpaceAdd();
		blocks[lastBlock][elemsInLast] = value;
		elemsInLast++;
		size++;
	}

	private void ensureSpaceAdd() {
		if (elemsInLast == blocks[lastBlock].length) {
			// add a new block
			int newSize = 2 * blocks[lastBlock].length;
			lastBlock++;
			blocks[lastBlock] = new int[newSize];
			elemsInLast = 0;
		}
	}

	public int size() {
		return size;
	}

	public String toString() {
		String result = "";
		for (int b = 0; b < lastBlock; b++) {
			for (int i = 0; i < blocks[b].length; i++) {
				result += blocks[b][i] + ", ";
			}
		}
		for (int i = 0; i < elemsInLast; i++) {
			result += blocks[lastBlock][i] + ", ";
		}
		if (!result.isEmpty()) {
			result = result.substring(0, result.length() - 2);
		}
		return "[" + result + "]";
	}

	public int get(int index) {
		// TODO
		if(index> this.size || index<0) throw new IndexOutOfBoundsException();
		int innerIndex = 0;
		for(double i = 1; i< this.size(); i++) {
			if(index<Math.pow(2.0, i)) {
				innerIndex = (int) i; 
				break; 
			}
		}
		System.out.println(innerIndex);
		System.out.println(Arrays.toString(blocks[innerIndex]));
		return blocks[innerIndex][index - innerIndex];
	}

	public void addFirst(int value) {
		// TODO
		/*ensureSpaceAdd();
		for(int i = 0; i<blocks.length; i++) {
			for(int j = 0; j<blocks[i].length; j++) {
				
			}
		}*/
	}
	
	public static void main(String[] args) {
		
			BlockIntList list = new BlockIntList();

			list.add(0);
			System.out.println(list.get(0)+ " should be 0");
			list.add(1);
			System.out.println(list.get(0)+ " should be 1");
			list.add(2);
			System.out.println(list.get(0)+ " should be 2");

			for (int i = 3; i < 30; i++) {
				list.add(i);
				for (int j = 0; j <= i; j++) {
					System.out.println(list.get(j)+ " should be " + j);;
				}
			}
	}
}
