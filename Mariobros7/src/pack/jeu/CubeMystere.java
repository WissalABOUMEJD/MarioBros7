package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CubeMystere extends Objet{
	
	private ImageIcon iconCube;
	private static Image imageCube;
	
	private static boolean afficher;
	private Cubes particularité;
	
	
	public CubeMystere(int x, int y,Cubes particularité) {
		super(32, 32, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/CubeMystère.png"));
		super.imageObjet = this.icoObjet.getImage();
		this.particularité = particularité;
	}
	
	@Override
	public void actionObjet(Collision collision) {
		if (collision == Collision.Haut) {
			if (particularité == Cubes.foncé) {
				changementImage();
			}
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
		super.icoObjet = new ImageIcon(getClass().getResource("/images/CubeMystèreFoncé.png"));
		super.imageObjet = icoObjet.getImage();
	}
	
	
}
