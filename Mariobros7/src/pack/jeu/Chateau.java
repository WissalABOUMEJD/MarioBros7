package pack.jeu;

import javax.swing.ImageIcon;

public class Chateau extends Objet {
	/** Constructeur de la classe piece
	 * 
	 * @param largeur 
	 * @param hauteur
	 * @param x
	 * @param y
	 */
	public Chateau(int x, int y) {
		super(100, 100, x, y);
		
		super.icoObjet = new ImageIcon(getClass().getResource("/images/chateauFin.png"));
		super.imageObjet= super.icoObjet.getImage();
	}

}
