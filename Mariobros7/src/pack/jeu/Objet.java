package pack.jeu;
import menu.Menu;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Objet {
	
	int largeurObjet;
    int hauteurObjet;
	
	private int x;
	private int y;
	
	protected Image imageObjet;
	protected ImageIcon icoObjet;
	
	
	public Objet(int largeur, int hauteur, int x, int y) {
		this.largeurObjet = largeur;
		this.hauteurObjet = hauteur;
		this.x = x;
		this.y = y;
	}

	public int getHauteurObjet() {
		return hauteurObjet;
	}

	public void actionObjet() {
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Image getImageObjet() {
		return imageObjet;
	}

	public void setImageObjet(Image imageObjet) {
		this.imageObjet = imageObjet;
	}

	public ImageIcon getImageIcon() {
		return icoObjet;
	}

	public void setImageIcon(ImageIcon imageIcon) {
		this.icoObjet = imageIcon;
	}

	public void actionObjet(Collision collision) {		
		
	}
	
	
	
}
