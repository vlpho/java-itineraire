import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Luong
 *
 */
public class View extends JFrame {

	private Model model; 		//L'initialiser des données ne se fait pas dans la partie declaration d'attribut de classe, mais dans constructeur de classe !
	private Ville villeFocus;
	private Route routeFocus;
	private List<Node> shortestPath;

	public View() throws HeadlessException {
		setSize(1200, 1000);	// 700, 700
		JMenuBar barreDeMenu = new JMenuBar();	
		JMenu menu1 = new JMenu("Menu1");
		JMenu menu2 = new JMenu("Menu2");
		JMenuItem item1 = new JMenuItem("Itinéraire");
		JMenuItem item2 = new JMenuItem("Itinéraire2");
		JButton bouton = new JButton("@");
		barreDeMenu.add(menu1);
		barreDeMenu.add(menu2);
		menu1.add(item1);
		menu2.add(item2);
		
		FrameListener listener = new FrameListener();
		addMouseListener(listener);		
		getContentPane().add(barreDeMenu, BorderLayout.NORTH);	// ContentPane.add( barreMenu{ Menu[item], Menu2[item2] } )
		getContentPane().add(bouton, BorderLayout.SOUTH);		// ContentPane.add( Bouton )
		
		model = new Model();	// initialiser les données dans le constructeur et pas dans la zone de declaration des attributs de classe !
	
		villeFocus = model.villeParNom("Nice");
		shortestPath = model.rechercheItineraire("Paris", villeFocus.getNom());
		//routeFocus = model.routeParNomVilles("Paris",shortestPath.get(1).getName());
		
		setVisible(true);
	}

	public void paint(Graphics g) {
		//System.out.println("View.paint");
		super.paint(g);
		peindreVilles(g);
		peindreRoutes(g);
	}

	private void peindreVilles (Graphics g) {
		Font fontPlain = new Font("Courier",Font.PLAIN,15); 
	    Font fontBold = new Font("Courier",Font.BOLD,20); 
	    for (Ville ville : model.getVilles()) {
			g.setFont(fontPlain);
		    g.setColor(Color.black);
			if((villeFocus != null && villeFocus.equals(ville))
			|| (routeFocus != null && routeFocus.traverseVille(ville))
			|| (shortestPath.get(0).getName().equalsIgnoreCase(ville.getNom()))) {
				g.setFont(fontBold);
			    g.setColor(Color.blue);
			}
			g.drawRect(ville.getX(), ville.getY(), 10, 10);
			g.drawString(ville.getNom(), ville.getX(), ville.getY());
		}		
	}
	
	private void peindreRoutes(Graphics g) {
	    Font fontPlain = new Font("Courier",Font.PLAIN,15); 
	    Font fontBold = new Font("Courier",Font.BOLD,20); 

		Graphics2D g2 = (Graphics2D) g;
	    BasicStroke	strokeThin = new BasicStroke(1);	// epaisseur de trait
	    BasicStroke strokeBold = new BasicStroke(3);

	    for (Route route: model.getRoutes()) {
			try {
					Ville ville1 = route.getVille1();
					Ville ville2 = route.getVille2();
					g2.setFont(fontPlain);
				    g2.setStroke(strokeThin);	// methode setStroke n'existe qu'en Graphic2D
				    g2.setColor(Color.red);
					if (shortestPath != null && route.element2ShortestPath(shortestPath)) {
						g2.setFont(fontBold);
						g2.setStroke(strokeBold);
						g2.setColor(Color.blue);
					}
					if(routeFocus != null && routeFocus.equals(route)) {
						// calcul Point(distanceX, distanceY) = milieu du segment [ville1, ville2]
					    int distanceX = ville1.getX() + ((ville2.getX() - ville1.getX()) / 2);
					    int distanceY = ville1.getY() + ((ville2.getY() - ville1.getY()) / 2);
						g2.setFont(fontBold);
					    g2.setStroke(strokeBold);
					    g2.setColor(Color.magenta);
					    g2.drawString(Integer.toString(routeFocus.getDistance()), distanceX, distanceY);	// afficher distance au milieu du segment
					}
					g2.drawLine(ville1.getX(), ville1.getY(), ville2.getX(), ville2.getY());
			} catch (Exception e) {
				System.out.println("\nError route from " + route.getVille1().getNom() + " to " + route.getVille2().getNom() + "\n");
				System.out.println("\ngetMessage() : " + e.getMessage());
				System.out.println("\ntoString() : " + e.toString());
				e.printStackTrace();
			}
		}
	}

	//https://stackoverflow.com/questions/34078603/how-to-make-a-rectangle-with-mouse-listeners-and-add-them-to-jframe
	private class FrameListener implements MouseListener {
	    @Override
	    public void mouseEntered(MouseEvent arg0) {}
	    @Override
	    public void mouseExited(MouseEvent arg0) {}
	    @Override
	    public void mousePressed(MouseEvent arg0) {}
	    @Override
	    public void mouseReleased(MouseEvent arg0) {}
	    
	    @Override
	    public void mouseClicked(MouseEvent event) {
	        Object source = event.getSource();
	        if(source instanceof JFrame) {
	            JFrame frame = (JFrame) source;
	            Point mousePoint = event.getPoint();
	            Ville newVille = model.villeFromXY(mousePoint.getX(), mousePoint.getY());
	            if(newVille != null) {
	            	if (villeFocus == null
	            	|| (villeFocus != null && !newVille.equals(villeFocus))) {
	            		villeFocus = newVille;
	            		shortestPath = model.rechercheItineraire("Paris", villeFocus.getNom());
	            		frame.repaint();
	            	}
	            } else {
		            Route newRoute = model.routeFromXY(mousePoint.getX(), mousePoint.getY());
		            if (newRoute != null) {
		            	if (routeFocus == null 
		            	|| (routeFocus != null && !newRoute.equals(routeFocus))) {
		            		routeFocus = newRoute;
		            		frame.repaint();
		            	}
		            }
	            }
	        }
	    }
	}
	
}



