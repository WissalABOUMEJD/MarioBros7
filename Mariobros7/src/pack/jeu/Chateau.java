package pack.jeu;

import javax.swing.ImageIcon;
/**
 * Classe répsente le chateau à la fin du jeu
 * elle étend la calsse objet
 * @author alexd
 *
 */
public class Chateau extends Objet {
	/** Constructeur de la classe Chateau
	 * 
	 * 
	 * @param x
	 * @param y
	 */
	public Chateau(int x, int y) {
		super(100, 100, x, y);
		
		super.icoObjet = new ImageIcon(getClass().getResource("/images/chateauFin.png"));
		super.imageObjet= super.icoObjet.getImage();
	}

}
