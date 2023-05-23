package pack.jeu;

public class Joueur {
	
	public static  int xJoueur;
	public static  int yJoueur;
	public static  int compteurSaut;
	private static final int dureeSaut = 30;
	private static final int pause = 3;
	private boolean collisionHaut = false;
	private boolean collisionBas = false;
	private boolean collisionDroite = false;
	private boolean collisionGauche = false;
	public boolean sautEnCours;
	
	
	
	public static final int hauteurMario = 50;
	public static final int largeurMario = 28;


	
	public Joueur(int x, int y) {
		xJoueur = x;
		yJoueur = y;
		compteurSaut = 0;
		sautEnCours = false;
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
	
	
	public void setX(int dx) {
		xJoueur+=dx;
	}
	
	public void setY(int dy) {
		yJoueur+=dy;
	}


	public int getX() {
		return xJoueur;
	}
	
	public int getY() {
		return yJoueur;
	}
}