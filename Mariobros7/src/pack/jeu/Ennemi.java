package pack.jeu;

import javax.swing.ImageIcon;

public class Ennemi extends Objet{

	
	private static boolean afficher;
	public boolean directionGauche;
	private static int vitesseEnnemi = 4;
	

	public Ennemi(int x, int y, boolean gauche) {
		super(32, 32, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/Goomba.png"));
		super.imageObjet = this.icoObjet.getImage();
		directionGauche = gauche;
		afficher = true;
	}


	public void deplacementEnnemi () {
		if (directionGauche) {
			super.setX(-4);
		} else {
			super.setX(4);
		}
	}
	
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


