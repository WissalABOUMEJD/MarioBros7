package pack.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Brique extends Objet{
	

	private Briques particularité;
	private boolean casse;
	private int compteurPièces = 3;
	private int compteurPièce = 1;

	
	public Brique(int x, int y, Briques particularité) {
		super(32, 32, x, y);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc.png"));
		super.imageObjet = this.icoObjet.getImage();
		this.particularité = particularité;
		casse = false;
	}
	
	@Override
	public void actionObjet(Collision collision) {
		if (collision == Collision.Haut) {
			if (particularité == Briques.cassable) {
			this.setCasse(true);
			} else if (particularité == Briques.pièces && compteurPièces > 0) {
				compteurPièces--;
			} else if (particularité == Briques.pièce && compteurPièce > 0) {
				compteurPièce--;
			}
		}	
	}

	public boolean isCasse() {
		return casse;
	}

	public void setCasse(boolean casse) {
		this.casse = casse;
	}
	


}
