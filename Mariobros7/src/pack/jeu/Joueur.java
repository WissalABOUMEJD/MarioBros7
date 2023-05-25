package pack.jeu;

public class Joueur {
	
	public int xJoueur;
	public int yJoueur;
	public int compteurSaut;
	private final int dureeSaut = 20;
	private final int pause = 3;
	private boolean marche;
	private boolean droite;
	public boolean collisionHaut = false;
	public boolean collisionBas = false;
	public boolean collisionDroite = false;
	public boolean collisionGauche = false;
	public boolean sautEnCours;
	
	
	
	public final int hauteurMario = 50;
	public final int largeurMario = 28;


	
	public Joueur(int x, int y) {
		xJoueur = x;
		yJoueur = y;
		compteurSaut = 0;
		sautEnCours = false;
		marche = false;
		droite = true;
	}
	
	
	public void sauter() {
		//phase Montante du saut
		if (compteurSaut < dureeSaut) {
			if (getY() < Niveau.getHauteurPlafond(getX())) { //si on percute le plafond
				compteurSaut = dureeSaut;
			} else {
			setY(-8);
			compteurSaut++;
			}
		}
		// phase de pause
		else if (compteurSaut < dureeSaut + pause) {
			compteurSaut++;
		}
		// phase descendante
		else if (compteurSaut < 2*dureeSaut + pause) {
			if (getY() > Niveau.getHauteurSol(getX())) { //si on percute le plafond
				compteurSaut = 2*dureeSaut;
			} else {
			setY(8);
			compteurSaut++;
			}
		}
		
		else {
			compteurSaut = 0;
			sautEnCours = false;
		}
	}

	
	public void setCollisionDroite(boolean collisionDroite) {
		this.collisionDroite = collisionDroite;
	}
	
	public void setCollisionGauche(boolean collisionGauche) {
		this.collisionGauche = collisionGauche;
	}
	
	public void setCollisionHaut(boolean collisionHaut) {
		this.collisionHaut = collisionHaut;
	}
	
	public void setCollisionBas(boolean collisionBas) {
		this.collisionBas = collisionBas;
	}
	
	
	
	
	
	
	public boolean collisionMario() {
		return ((collisionDroite && Niveau.getDx() < 0) || (collisionGauche && Niveau.getDx() > 0));
	}
	
	public void setX(int dx) {
		xJoueur+=dx;
	}
	
	public void setY(int dy) {
		if (! (collisionHaut && dy >0) && !(collisionBas && dy < 0)) {
			yJoueur+=dy;
		}	}


	public int getX() {
		return xJoueur;
	}
	
	public int getY() {
		return yJoueur;
	}
}
