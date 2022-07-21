package Data_Structure.Graph.Cycle_Detection_BFS.Undirected_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cycle_Detection {
	
	private String vertices[];
	private int size;
	private int pointer;
	private int time;
	private HashMap<String, String> previous;
	private HashMap<String, Integer> distance;
	private HashMap<String, List<String>> adjacencyList;
	private HashMap<String, String> colors;
	private HashMap<String, Integer> entry;
	private HashMap<String, Integer> exit;
	
	public Cycle_Detection(int size) {
		this.size = size;
		this.vertices = new String[this.size];
		this.pointer = 0;
		this.previous = new HashMap<String, String>();
		this.distance = new HashMap<String, Integer>();
		this.adjacencyList = new HashMap<String, List<String>>();
		this.colors = new HashMap<String, String>();
		this.entry = new HashMap<String, Integer>();
		this.exit = new HashMap<String, Integer>();
		this.time = 0;
	}
	
	public void addVertex(String label) {
		if(this.pointer == this.size)
			return;
		this.vertices[this.pointer++] = label;
		this.previous.put(label, null);
		this.distance.put(label, 0);
		this.adjacencyList.put(label, new ArrayList<String>());
		this.colors.put(label, "white");
	}
	
	public void addEdge(String label1, String label2) {
		this.adjacencyList.get(label1).add(label2);
		this.adjacencyList.get(label2).add(label1);
	}
	
	public void dfs(String start) {
		this.colors.put(start, "gray");
		this.entry.put(start, ++this.time);
		for(String neighbour: this.adjacencyList.get(start)) {
			if(this.colors.get(neighbour).equals("gray") && !this.previous.get(start).equals(neighbour)) {
				System.out.println("CYCLE DETECTED");
				return;
			}
			if(this.colors.get(neighbour).equals("white")) {
				this.previous.put(neighbour, start);
				this.dfs(neighbour);
			}
		}
		this.colors.put(start, "black");
		this.exit.put(start, ++this.time);
	}
	
	public String getPath(String end) {
		if(this.previous.get(end) == null)
			return end;
		else
			return this.getPath(this.previous.get(end)) + " -> " + end;
	}

}