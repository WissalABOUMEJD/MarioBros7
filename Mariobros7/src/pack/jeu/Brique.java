package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Brique extends Objet{
	
	private static final Collision Bas = null;
	private ImageIcon iconBrique;
	private static Image imageBrique;
	
	private static boolean afficher;
	
	public Brique(int x, int y) {
		super(40, 40, x, y);
		iconBrique = new ImageIcon(getClass().getResource("/images/Brique.png"));
		imageBrique = iconBrique.getImage();
		this.setImageIcon(iconBrique);
		this.setImageObjet(imageBrique);
		afficher = true;
	}
	
	@Override
	public void actionObjet(Collision collision) {
		if (collision == Bas) {
			afficher = false;
		}	
	}
	

	public ImageIcon getIconBrique() {
		return iconBrique;
	}

	public void setIconBrique(ImageIcon iconBrique) {
		this.iconBrique = iconBrique;
	}

	public Image getImageBrique() {
		return imageBrique;
	}

	public static void setImageBrique(Image imageBrique) {
		Brique.imageBrique = imageBrique;
	}

	public static boolean isAfficher() {
		return afficher;
	}

	public static void setAfficher(boolean afficher) {
		Brique.afficher = afficher;
	}
}
