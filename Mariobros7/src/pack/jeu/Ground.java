package pack.jeu;

import javax.swing.ImageIcon;
/**
 * Classe représentant le sol du niveau
 * @author alexd
 *
 */
public class Ground extends Objet{
	
private static final Collision Bas = null;
	
	private static boolean afficher;
	/**
	 * Constructeur de la classe Ground
	 * @param x
	 * @param y
	 */
	public Ground(int x, int y) {
		super(1568, 64, x, y);
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
