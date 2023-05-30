package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * Classe qui représente un champignon.
 * Elle étend la classe objet
 * @author alexd
 *
 */
public class Champignon extends Objet{
	
	
	private boolean directionGauche;
	
	public Champignon(int x, int y,boolean directionGauche) {
		super(32, 32, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/champignon2.png"));  // A remplacer
		super.imageObjet = this.icoObjet.getImage();
		this.directionGauche = directionGauche;
	}
	
	public void changerDirection () {
		directionGauche = !directionGauche;
	}
	
	@Override
	public void actionObjet(Collision collision) {
	}



	public void deplacementChampignon () {
		if (directionGauche) {
			super.setX(-1);
		} else {
			super.setX(1);
		}
	}
	
	


}
