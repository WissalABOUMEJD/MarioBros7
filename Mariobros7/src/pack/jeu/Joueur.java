package pack.jeu;
import java.awt.Rectangle;

import menu.Menu;

public class Joueur {
	
	public int xJoueur;
	public int yJoueur;
	public int compteurSaut;
	private final int dureeSaut = 30;
	private final int pause = 3;
	private boolean marche;
	private boolean droite;
	//permet de savoir si personnage est en collision avec u objet ou une piece ces valeurs seront changer par lamethode detectioncollison
	public boolean collisionHaut = false;
	public boolean collisionBas = false;
	public boolean collisionDroite = false;
	public boolean collisionGauche = false;
	
	
	
	
	public final int hauteurMario = 48;
	public final int largeurMario = 32;
	
	//pour les fonctions courir 
	public int compteurMarche;
	public boolean marcheGaucheEnCours;
	public boolean marcheDroiteEnCours;
	public boolean sautEnCours; 
	public boolean chuteEnCours; 

	public  boolean marioPetit = true;


	
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
			setY(16);
			chuteEnCours = true;
		}
	}
	
	
	public void sauter() {
		//phase Montante du saut
		if (compteurSaut < dureeSaut) {
			if (collisionHaut) {
				compteurSaut = dureeSaut;
			} else {
				setY(-16);
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
				setY(16);
				sautEnCours = false;
			}
		}
		
	}
	
	public void courirdroite() {
		//mise en place d'un compteur/retardataire pour l'affichage bonhomme qui court
		int dureeMax=30;
		if(this.sautEnCours==false) {
			Menu.niveauPanel.setX(Deplacement.vitesseDeplacement/2);
		
				compteurMarche=0;
				
				
			
		}
		
		
	}
	
	public void courirgauche() {
		//mise en place d'un compteur/retardataire pour l'affichage bonhomme qui court
		int dureeMax=30;
		if(this.sautEnCours==false) { // on se déplace que quand saut n'est pas en cours
			Menu.niveauPanel.setX(-Deplacement.vitesseDeplacement/2);
			
				
			
			
		}
		
		
	}
	/**Est ce que le personnage est en contact avec la piece
	 * 
	 * @param piece
	 * @return vrai si en contact faux sinon
	 */
	public boolean contactPiece(Piece piece) {
		
		Rectangle rectangleMario = new Rectangle(this.getX()+Menu.niveauPanel.xFondCumule ,this.getY(),this.largeurMario + 2,this.hauteurMario);
		
		Rectangle rectangleObjet;
			
		rectangleObjet = new Rectangle(piece.getX(),piece.getY(),piece.largeurObjet+2,piece.hauteurObjet);
			
		return rectangleMario.intersects(rectangleObjet);
	}
	
	public boolean contactChateau(Chateau chateau) {
		
		Rectangle rectangleMario = new Rectangle(this.getX()+Menu.niveauPanel.xFondCumule ,this.getY(),this.largeurMario + 2,this.hauteurMario);
		
		Rectangle rectangleObjet;
			
		rectangleObjet = new Rectangle(chateau.getX(),chateau.getY(),chateau.largeurObjet+2,chateau.hauteurObjet);
			
		return rectangleMario.intersects(rectangleObjet);
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
	
	public void toucher() {
	if (marioPetit) {
		Menu.showPanels(Menu.gameOverPanel, Menu.languePanel, Menu.MainMenuPanel, Menu.volumePanel, Menu.scorePanel,
                Menu.jouerPanel, Menu.niveauPanel, Menu.optionsPanel, Menu.gagnerPanel);
	} else {
		marioPetit = true;
	}
		
	}

	public void grandir() {
		if (marioPetit) {
			marioPetit = false;
			Niveau.grandirImage();
		}
	}
}
