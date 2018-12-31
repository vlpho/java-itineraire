
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

import java.lang.Math;

public class Model {

	List<Ville> villes;
	List<Route> routes;

	// Le constructeur de la classe
	public Model() {
		villes = new ArrayList<Ville>();
		FileIntoList villesFile = new FileIntoList("src/Files/ville.dat");
		/*
		try {
			List<String> townList = villesFile.readList();
			for (String lineIterator : townList) {
				System.out.println(lineIterator); 			
			}
		} catch (Exception e) {
			System.out.println("\nError FileIntoList.readList()");
			System.out.println("\ngetMessage() : " + e.getMessage());
			System.out.println("\ntoString() : " + e.toString());
		}
		*/
		ArrayList<String> villeLines = villesFile.readVilleList();
		//List<String> villeLines = villesFile.readList();
		for (String lineIterator : villeLines) { 
			//System.out.println(lineIterator); 
			String[] tab = lineIterator.split(";");	// Abbeville;111;532;110
			String nom = tab[0];					// Abbeville
			int code = Integer.parseInt(tab[1]);	// 111
			int x = Integer.parseInt(tab[2]);		// 532
			int y = Integer.parseInt(tab[3]);		// 110
			Ville ville = new Ville(nom, code, x, y);
			villes.add(ville);
		}
		
		routes = new ArrayList<Route>();
		FileIntoList routesFile = new FileIntoList("src/Files/route.dat");
		ArrayList<String> routeLines = routesFile.readRouteList();
		for (String lineIterator : routeLines) { 
			//System.out.println(lineIterator); 
			String[] tab = lineIterator.split(";");		// 1;2;36
			int codeVille1 = Integer.parseInt(tab[0]);
			int codeVille2 = Integer.parseInt(tab[1]);
			int distance = Integer.parseInt(tab[2]);
			Ville ville1 = villeParCode(codeVille1);
			Ville ville2 = villeParCode(codeVille2);
			if (ville1 != null && ville2 != null) {
				Route route 	= new Route(ville1, ville2, distance);
				routes.add(route);
			} else {
				System.out.println("Route inconnue : " + lineIterator);
				//System.out.println("Depart : " + (ville1 != null ? ville1.getNom() : "null") + ", destination : " + (ville2 != null ? ville2.getNom() : "null") );
			}
		}
	}
	
	public List<Ville> getVilles() {
		return villes;
	}
	
	public List<Route> getRoutes() {
		return routes;
	}
	
	private Ville villeParCode(int codeVille) {
		for (Ville ville : villes) {
			if (ville.getCode() == codeVille) {
				return ville;
			}
		}
		return null;
	}
	
	public Ville villeParNom(String nom) {
		for(Ville villeIterator : villes) {
			if (villeIterator.getNom().equalsIgnoreCase(nom)) {
				return villeIterator;
			}
		}
		return null;
	}
	
	public Ville villeFromXY(double x, double y) {
		System.out.println("villeFromXY(" + Double.toString(x) + "," + Double.toString(y) + ")\n");		
		for(Ville villeIterator : villes) {
			int xstart = villeIterator.getX();
			int ystart = villeIterator.getY();
			int xend = xstart + 10;	
			int yend = ystart + 10;	
			// Math.min(xstart, xend) <= x <= Math.max(xstart, xend) and likewise for the y dimension
			if(Math.min(xstart,xend) <= (int)x && (int)x <= Math.max(xstart,xend)
			&& Math.min(ystart,yend) <= (int)y && (int)y <= Math.max(ystart,yend)) {				
				System.out.println("Math.min(" + Integer.toString(xstart) + "," + Integer.toString(xend) + ") <= " + Integer.toString((int)x)+ " <= Math.max(" + Integer.toString(xstart) + "," + Integer.toString(xend) + ")");		
				System.out.println("Math.min(" + Integer.toString(ystart) + "," + Integer.toString(yend) + ") <= " + Integer.toString((int)y)+ " <= Math.max(" + Integer.toString(ystart) + "," + Integer.toString(yend) + ")\n");		
				return villeIterator;
			}
		}
		return null;
	}
	
	// Bordeaux;59;341;683 - Bayonne;160;263;825 => routeFromXY(326.0,713.0)
	public Route routeFromXY(double x, double y) {
		System.out.println("routeFromXY(" + Double.toString(x) + "," + Double.toString(y) + ")\n");		
		for (Ville villeDepart : villes) {
			for (Ville villeArrive : villes) {
				if (!villeDepart.equals(villeArrive)) {
					// Mouse(x,y) appartient à la droite ax+b si on a :	y = ax+b
					// d'où :
					// 		a = (yarrive - ydepart) / (xarrive - xdepart)
					// 		b = ydepart - (a*xdepart) 
					float a = ((float)(villeArrive.getY() - villeDepart.getY())) / (villeArrive.getX() - villeDepart.getX());
					float b = villeDepart.getY() - (a * villeDepart.getX());
					int delta = 10;
					// Pour augmenter la chance de pouvoir cliquer sur le segment [villeDepart, villeArrive],
					// au lieu de verifier que la position de la souris Mouse(x,y) est sur la droite y=a*x+b
					// on verifiera de maniere un peu plus approximative, 
					// c.a.d. que Mouse(x,y) est aux alentours des droites paralleles a y=a*x+b', dont b' est dans l'intervale [b-delta, b+delta]
					try {
						if (((a*x)+b-delta) <= y && y <= ((a*x)+b+delta)) {
							// Ici on a Mouse(x,y) appartient bien à la droite passant par les 2 villes (depart,arrive),
							// encore faudrait-il que Mouse(x,y) est bien dans l'intervalle du segment villes [depart, arrive], 
							// c.a.d. x appartient a l'intervalle [xdepart, xarrive]
							if (villeDepart.getX() <= x && x <= villeArrive.getX()) {
								for (Route routeIterator : routes) {
									if (routeIterator.relieVilles(villeDepart, villeArrive)) {
										return routeIterator;
									}
								}
							}
						}
					} catch (Exception e) {
						System.out.println("\nError routeFromXY "+ Double.toString(y) + " = (a" + Double.toString(a) + " * " + Double.toString(x) + ") + " + Double.toString(b));
						System.out.println("\ngetMessage() : " + e.getMessage());
						System.out.println("\ntoString() : " + e.toString());
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}

	public Route routeParNomVilles(String nomVilleA, String nomVilleB) {
		Ville villeA = villeParNom(nomVilleA);
		Ville villeB = villeParNom(nomVilleB);
		if (villeA != null && villeB != null && !villeA.equals(villeB)) {
			for(Route routeIterator : routes) {
				if (routeIterator.relieVilles(villeA, villeB)) {
					return routeIterator;
				}
			}
		}
		return null;
	}

	public List<Node> rechercheItineraire(String villeDepart, String villeArrive) {
		Graph graph = new Graph();
		for (Ville villeIterator : villes) {
			Node node = new Node(villeIterator.getNom());
			graph.addNode(node);
		}
		for (Route routeIterator : routes) {
			String nomVille1 = routeIterator.getVille1().getNom();
			String nomVille2 = routeIterator.getVille2().getNom();
			Node node1 = graph.getNode(nomVille1);
			Node node2 = graph.getNode(nomVille2);
			node1.addDestination(node2, routeIterator.getDistance());
			node2.addDestination(node1, routeIterator.getDistance());
		}
		graph = Dijkstra.calculateShortestPathFromSource(graph, graph.getNode(villeDepart));		
		List<Node> shortestPath = graph.getNode(villeArrive).getShortestPath();
		shortestPath.add(graph.getNode(villeArrive));
		
		//List<String> shortestPathNomVille;
		//for(Node nodeIterator : shortestPath) {
		//	shortestPath
		//}
				
		System.out.print("shortestpath = { ");
		for (Node nodeIterator : shortestPath) {
			System.out.print(nodeIterator.getName() + "; ");			
		}
		System.out.println(" }");
		return shortestPath;
	}

}
