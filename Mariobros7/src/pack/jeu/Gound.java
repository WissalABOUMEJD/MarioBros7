package pack.jeu;

import javax.swing.ImageIcon;

public class Ground extends Objet{
	
private static final Collision Bas = null;
	
	private static boolean afficher;

	public Ground(int x, int y) {
		super(40, 40, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/ground.png"));
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
		Ground.afficher = afficher;
	}
	


}
