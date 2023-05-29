package pack.jeu;

import javax.swing.ImageIcon;

public class Ennemi extends Objet{

	
	private static boolean afficher;
	static boolean directionGauche;

	public Ennemi(int x, int y, boolean gauche) {
		super(32, 32, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/Goomba.png"));
		super.imageObjet = this.icoObjet.getImage();
		directionGauche = gauche;
		afficher = true;
	}
	
	@Override
	public void actionObjet(Collision collision) {

	}

	public void deplacementEnnemi () {
		if (directionGauche) {
			super.setX(-6);
		} else {
			super.setX(6);
		}
	}
	
	public void tuerEnnemi () {
		
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


