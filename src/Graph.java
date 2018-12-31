import java.util.HashSet;
import java.util.Set;

public class Graph {
	private Set<Node> nodes = new HashSet<>();
 
	public void addNode(Node nodeA) {	
		nodes.add(nodeA);		
	}

	public Node getNode(String nomVille) {
		for (Node nodeIterator : nodes) {
			if (nodeIterator.getName().equalsIgnoreCase(nomVille)) {
				return nodeIterator;
			}
		}
		return null;
	}
	
	// getters and setters 
	public void setNodes(Set<Node> nodes) { this.nodes = nodes; }
	
	public Set<Node> getNodes() { return nodes; }
}
