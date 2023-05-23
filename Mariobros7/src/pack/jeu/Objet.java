package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Objet {
	
	int largeurObjet;
    int hauteurObjet;
	
	private int x;
	private int y;
	
	private Image imageObjet;
	private ImageIcon imageIcon;
	
	
	public Objet(int largeur, int hauteur, int x, int y) {
		this.largeurObjet = largeur;
		this.hauteurObjet = hauteur;
		this.x = x;
		this.y = y;
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
		return imageIcon;
	}

	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}

	public void actionObjet(Collision collision) {		
		
	}
	
	
	
}
