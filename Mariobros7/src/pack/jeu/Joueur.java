package pack.jeu;
import menu.Menu;

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
	
	
	
	public final int hauteurMario = 48;
	public final int largeurMario = 32;
	
	//pour les fonctions courir 
	public int compteurMarche;
	public boolean marcheGaucheEnCours;
	public boolean marcheDroiteEnCours;

	
	public Joueur(int x, int y) {
		xJoueur = x;
		yJoueur = y;
		compteurSaut = 0;
		sautEnCours = false;
		marche = false;
		droite = true;
	}
	
	public void tomber() {
		if (!collisionBas && !sautEnCours) {
			//setY(8);
		}
	}
	
	
	public void sauter() {
		//phase Montante du saut
		if (compteurSaut < dureeSaut) {
			if (collisionHaut) {
				compteurSaut = dureeSaut;
			} else {
				setY(-8);
				compteurSaut++;
			}
			
		}
		// phase de pause
		if (compteurSaut < dureeSaut + pause) {
			compteurSaut++;
		}
		// phase descendante
		
		
		if (compteurSaut >= dureeSaut + pause) {
			if (collisionBas || getY() >= Niveau.getHauteurSol(getX())) {
				compteurSaut = 0;
				sautEnCours = false;
			} else {
				setY(8);
			}
		}
	}
	
	public void courirdroite() {
		//mise en place d'un compteur/retardataire pour l'affichage bonhomme qui court
		int dureeMax=30;
		Menu.niveauPanel.setX(Deplacement.vitesseDeplacement/2);
		if(compteurMarche < dureeMax) {
			compteurMarche ++;
		}else if (compteurMarche == dureeMax) {
			
			compteurMarche ++;
		}else {
			
			compteurMarche=0;
			marcheDroiteEnCours=false;
			
		}
		
	}
	
	public void courirgauche() {
		//mise en place d'un compteur/retardataire pour l'affichage bonhomme qui court
		int dureeMax=30;
		Menu.niveauPanel.setX(-Deplacement.vitesseDeplacement/2);
		if(compteurMarche < dureeMax) {
			compteurMarche ++;
		}else if (compteurMarche == dureeMax) {
			
			compteurMarche ++;
		}else {
			
			compteurMarche=0;
			
			marcheGaucheEnCours=false;
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
		yJoueur+=dy;
	}


	public int getX() {
		return xJoueur;
	}
	
	public int getY() {
		return yJoueur;
	}
}
