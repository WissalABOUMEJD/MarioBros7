package pack.jeu;

import javax.swing.ImageIcon;
/**
 * Classe représentant les énemis
 * Elle étend la classe Objet
 * @author alexd
 *
 */
public class Ennemi extends Objet{

	
	private static boolean afficher;
	public boolean directionGauche;
	private static int vitesseEnnemi = 4;
	
	/** Constructeur de la classe ennemi
	 * 
	 * @param x position initial de l'ennemi
	 * @param y position initial de l'ennemi
	 * @param gauche représente la direction de départ si il doit partir à gauche des le début gauche=true
	 */
	public Ennemi(int x, int y, boolean gauche) {
		super(32, 32, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/Goomba.png"));
		super.imageObjet = this.icoObjet.getImage();
		directionGauche = gauche;
		afficher = true;
	}

	/**
	 * Méthode qui s'occupe du déplacment de l'ennemi
	 */
	public void deplacementEnnemi () {
		if (directionGauche) {
			super.setX(-4);
		} else {
			super.setX(4);
		}
	}
	/**Changer de direction
	 * 
	 */
	public void changerDirection () {
		directionGauche = !directionGauche;
	}
	
	public static boolean isAfficher() {
		return afficher;
	}

	public static void setAfficher(boolean afficher) {
		Ennemi.afficher = afficher;
	}
}


