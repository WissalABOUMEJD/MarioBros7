package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CubeMystere extends Objet{
	
	private static final Collision Bas = null;
	private ImageIcon iconCube;
	private static Image imageCube;
	
	private static boolean afficher;
	
	
	public CubeMystere(int x, int y) {
		super(32, 32, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/CubeMystère.png"));
		super.imageObjet = this.icoObjet.getImage();
		afficher = true;
	}
	
	@Override
	public void actionObjet(Collision collision) {
		if (collision == Bas) {
			changementImage();
			liberationObjet();
		}	
	}

	public ImageIcon getIconCube() {
		return iconCube;
	}

	public void setIconCube(ImageIcon iconCube) {
		this.iconCube = iconCube;
	}

	public Image getImageCube() {
		return imageCube;
	}

	public static void setImageCube(Image imageCube) {
		CubeMystere.imageCube = imageCube;
	}

	public static boolean isAfficher() {
		return afficher;
	}

	public static void setAfficher(boolean afficher) {
		CubeMystere.afficher = afficher;
	}

	private void liberationObjet() {
		// TODO Auto-generated method stub
		
	}

	private void changementImage() {
		iconCube = new ImageIcon(getClass().getResource("/images/CubeMystèreFoncé.png"));
		imageCube = iconCube.getImage();
	}
	
	
}
