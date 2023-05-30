package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * Classe qui répresnete les tuyaux, ils ne peuvent pas bouger et ils ont seulement une action de collision avec le personnage ou un enemi
 * @author alexd
 *
 */
public class Tuyau extends Objet{
	
	
	private static boolean afficher;
	/**
	 * Constructeur de la classe tuyau
	 * @param x position d'initialisation
	 * @param y position d'initialisation
	 */
	public Tuyau(int x, int y) {
		super(40, 64, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/tuyau.png"));
		super.imageObjet = this.icoObjet.getImage();
		afficher = true;
	}
	
	@Override
	public void actionObjet(Collision collision) {

	}


	public static boolean isAfficher() {
		return afficher;
	}

	public static void setAfficher(boolean afficher) {
		Tuyau.afficher = afficher;
	}
}
