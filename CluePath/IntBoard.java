package CluePath;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


public class IntBoard {
	static int ROWS = 4;
	static int COLS = 4;
	static int SIZE_OF_BOARD = ROWS*COLS;
	static int GRID_PIECES;
	private Map<Integer, LinkedList<Integer>> adjMtx;
	private boolean[] visitedPoints; 
	
	IntBoard board;
	
	public IntBoard() {
		super();
		board = new IntBoard();
	}
	
	//Calculates the adjacency lists for each grid space.
	public void calcAdjacencies() {
		for(int i=0; i < (SIZE_OF_BOARD); i++) {
			//Checking move upwards
			if(i - COLS  > 0) {
				adjMtx.get(i).add(i-COLS);
			}
			//Checking move to left
			else if(i - 1 > 0) {
				adjMtx.get(i).add(i-1);
			}
			//Checking move to right
			else if(i + 1 > 0) {
				adjMtx.get(i).add(i+1);
			}
			//Checking move downwards
			else if(i + COLS < SIZE_OF_BOARD) {
				adjMtx.get(i).add(i+COLS);
			}
		}
	}
	
	//Determines possible move locations based on a starting location and the die roll
	public void calcTargets(int startLocation, int numberOfSteps) {
		
	}
	
	//Gets the list of targets in the form of a TreeSet
	public TreeSet<Integer> getTargets() {
		TreeSet<Integer> targets = new TreeSet<Integer>();
		return targets;
	}
	
	public LinkedList<Integer> getAdjList(int index) {
		LinkedList<Integer> adjacencyList = new LinkedList<Integer>();
		return adjacencyList;
	}
	
	//Calculates the grid index based on the row and column.
	public static int calcIndex(int row, int column) {
		int gridIndex = row*4 + column;
		return gridIndex;
	}
}