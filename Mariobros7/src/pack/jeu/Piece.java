package pack.jeu;

import javax.swing.ImageIcon;

public class Piece extends Objet {
	/** Constructeur de la classe piece
	 * 
	 * @param largeur 
	 * @param hauteur
	 * @param x
	 * @param y
	 */
	public Piece(int x, int y) {
		super(30, 30, x, y);
		
		super.icoObjet = new ImageIcon(getClass().getResource("/images/piece1.png"));
		super.imageObjet= super.icoObjet.getImage();
	}

}
