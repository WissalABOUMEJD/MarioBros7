package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tuyau extends Objet{
	
	private ImageIcon iconTuyau;
	private static Image imageTuyau;
	
	private static boolean afficher;
	
	public Tuyau(int x, int y) {
		super(90, 60, x, y);
		iconTuyau = new ImageIcon(getClass().getResource("/images/tuyau.png"));
		imageTuyau = iconTuyau.getImage();
		this.setImageIcon(iconTuyau);
		this.setImageObjet(imageTuyau);
		afficher = true;
	}
	
	@Override
	public void actionObjet(Collision collision) {

	}

	public ImageIcon getIconBrique() {
		return iconTuyau;
	}

	public void setIconBrique(ImageIcon iconBrique) {
		this.iconTuyau = iconBrique;
	}

	public Image getImageBrique() {
		return imageTuyau;
	}

	public static void setImageBrique(Image imageBrique) {
		Tuyau.imageTuyau = imageBrique;
	}

	public static boolean isAfficher() {
		return afficher;
	}

	public static void setAfficher(boolean afficher) {
		Tuyau.afficher = afficher;
	}
}
