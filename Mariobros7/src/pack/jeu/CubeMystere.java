package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CubeMystere extends Objet{
	
	private ImageIcon iconCube;
	private static Image imageCube;
	
	private static boolean afficher;
	private Cubes particularité;
	private boolean libereChampignon;
	
	
	public CubeMystere(int x, int y,Cubes particularité) {
		super(32, 32, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/CubeMystère.png"));
		super.imageObjet = this.icoObjet.getImage();
		this.setParticularité(particularité);
		setLibereChampignon(false);
	}
	
	@Override
	public void actionObjet(Collision collision) {
		if (collision == Collision.Haut) {
			if (getParticularité() == Cubes.vide) {
				changementImage();
			} else if (getParticularité() == Cubes.champignon) {
				setLibereChampignon(true);
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


	public void changementImage() {
		super.icoObjet = new ImageIcon(getClass().getResource("/images/CubeMystèreFoncé.png"));
		super.imageObjet = icoObjet.getImage();
	}

	public Cubes getParticularité() {
		return particularité;
	}

	public void setParticularité(Cubes particularité) {
		this.particularité = particularité;
	}

	public boolean isLibereChampignon() {
		return libereChampignon;
	}

	public void setLibereChampignon(boolean libereChampignon) {
		this.libereChampignon = libereChampignon;
	}
	
	
}
