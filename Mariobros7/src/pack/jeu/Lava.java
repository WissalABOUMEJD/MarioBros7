package pack.jeu;

import javax.swing.ImageIcon;

public class Lava extends Objet{
	
private static final Collision Bas = null;
	
	private static boolean afficher;

	public Lava(int x, int y) {
		super(200, 500, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/Lava-Transparent4.png"));
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
		Lava.afficher = afficher;
	}

}
