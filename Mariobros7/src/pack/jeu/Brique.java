package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Brique extends Objet{
	
	private static final Collision Bas = null;
	
	private static boolean afficher;
	
	public Brique(int x, int y) {
		super(32, 32, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc.png"));
		super.imageObjet = this.icoObjet.getImage();
		afficher = true;
	}
	
	@Override
	public void actionObjet(Collision collision) {
		if (collision == Bas) {
			afficher = false;
		}	
	}
	

	public static boolean isAfficher() {
		return afficher;
	}

	public static void setAfficher(boolean afficher) {
		Brique.afficher = afficher;
	}
}
