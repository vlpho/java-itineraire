import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {
	private String name;
	private Integer distance = Integer.MAX_VALUE;
	private List<Node> shortestPath = new LinkedList<>();    
	private Map<Node, Integer> adjacentNodes = new HashMap<>();

	public Node(String name) {
		this.name = name;
	}

	public void addDestination(Node destination, int distance) {
		adjacentNodes.put(destination, distance);
	}  
 
	// getters and setters
	public void setName(String name) { this.name = name; }
	public void setDistance(int distance) { this.distance = distance; }
	public void setShortestPath(List<Node> shortestPath) { this.shortestPath = shortestPath; }

	public String getName() { return name; }
	public Integer getDistance() { return distance; }
	public List<Node> getShortestPath() { return shortestPath; }
	public Map<Node, Integer> getAdjacentNodes() { return adjacentNodes; } 
}
