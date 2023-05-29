package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Brique extends Objet{
	

	private boolean cassable;
	private boolean casse;
	
	public Brique(int x, int y, boolean cassable) {
		super(32, 32, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc.png"));
		super.imageObjet = this.icoObjet.getImage();
		this.cassable = cassable;
		casse = false;
	}
	
	@Override
	public void actionObjet(Collision collision) {
		if (collision == Collision.Haut && cassable) {
			this.setCasse(true);
		}	
	}

	public boolean isCasse() {
		return casse;
	}

	public void setCasse(boolean casse) {
		this.casse = casse;
	}
	


}
