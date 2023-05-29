package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Champignon extends Objet{
	
	
	private static boolean afficher;
	
	public Champignon(int x, int y) {
		super(32, 32, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/tuyau.png"));  // A remplacer
		super.imageObjet = this.icoObjet.getImage();
		afficher = true;
	}
	
	@Override
	public void actionObjet(Collision collision) {

	}


	public static boolean isAfficher() {
		return afficher;
	}


}
