
import java.util.List;

public class Route {
	private Ville ville1;
	private Ville ville2;
	private int distance;

	public Route(Ville ville1, Ville ville2, int distance){
		this.ville1 = ville1;
		this.ville2 = ville2;
		this.distance = distance;
	}

	public Ville getVille1() {	return ville1;	}
	public Ville getVille2() {	return ville2;	}
	public int getDistance() {	return distance;}

	public void setVille1(Ville ville1) {	this.ville1 = ville1;	}
	public void setVille2(Ville ville2) {	this.ville2 = ville2;	}
	public void setDistance(int distance) {	this.distance = distance;	}

	public boolean traverseVille(Ville ville) {
		if (this.ville1.equals(ville) || this.ville2.equals(ville)) {
			return true;
		}
		return false;
	}
	
	public boolean relieVilles(Ville villeDepart, Ville villeArrive) {
		if((this.ville1.equals(villeDepart) && this.ville2.equals(villeArrive))
		|| (this.ville1.equals(villeArrive) && this.ville2.equals(villeDepart))) {
			return true;
		}
		return false;
	}
	
	public boolean element2ShortestPath(List<Node> shortestPath) {
		String nomVille1 = ville1.getNom();
		String nomVille2 = ville2.getNom();
		// shortestpath = { Paris; Fontainebleau; Montargis; Cosne; La Charité; Nevers; Moulins; Roanne; Lyon; Valence; Serres; Sisteron; Grasse; Nice;  }
		for(int i=0; i < shortestPath.size()-1; i++) {							
			if((nomVille1.equals(shortestPath.get(i).getName()) && nomVille2.equals(shortestPath.get(i+1).getName()))
			|| (nomVille2.equals(shortestPath.get(i).getName()) && nomVille1.equals(shortestPath.get(i+1).getName()))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(Route route) {		
		if((this.ville1.equals(route.getVille1()) && this.ville2.equals(route.getVille2()))
		|| (this.ville1.equals(route.getVille2()) && this.ville2.equals(route.getVille1()))) {
			return true;
		}
		return false;
	}
}