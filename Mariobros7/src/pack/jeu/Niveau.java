package pack.jeu;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import audioMario.Audio;
import java.awt.Rectangle;

public class Niveau extends JPanel{

	private Image fondDuJeu1;
	private ImageIcon fondDuJeuImg1;
	
	private Image fondDuJeu2;
	private ImageIcon fondDuJeuImg2;
	
	private Image Mario;
	private ImageIcon MarioImg;
	
	public Joueur player;
		
	private static int xFond1;
	private static int xFond2;
	
	private static int xFondCumule;
	
	private static int dx;
	
	public static int xPlayer;
	
	private static final int longueurImage = 1632;
	private static final int largeurImage = 1632;
	
	public Brique brique;
	public CubeMystere cubeMystere;
	public Tuyau tuyau;
	
	public Temps temps;
	public ScoreJeu score;
	public Deplacement deplacement = new Deplacement();
	public boolean rejouer; 

	public Niveau() {
		super();
		System.out.println("test");

		xFond1 = 0;
		xFond2 = longueurImage; // Les deux images sont en longueurImagex824 pixels.
		
		xPlayer = 0;
		
		xFondCumule = 0;
		
		
		fondDuJeuImg1 = new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg"));
		fondDuJeu1 =fondDuJeuImg1.getImage();
		
		fondDuJeuImg2 = new ImageIcon(getClass().getResource("/images/FondProvisoire2.png"));
		fondDuJeu2 =fondDuJeuImg2.getImage();
		
		MarioImg = new ImageIcon(getClass().getResource("/images/modifmario_arefaire.png"));
		Mario = MarioImg.getImage();
		
		
		player = new Joueur(0,500);
		temps = new Temps();
		score = new ScoreJeu();
		
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(deplacement);

		Thread refresh = new Thread(new FPS());
		refresh.start();
	}

	public void majFond () {
		if (player.getX() == 0 && dx < 0) {
			dx = 0;
		}
		
		if (player.getX() > 500 && dx > 0) {
			xFond1 -= dx;
			xFond2 -= dx;
			xFondCumule += dx;
		} else {
			player.setX(dx);   //a changer par le x_joueur dans la classe joueur
		} 

		if (xFond1 == -longueurImage) {
			xFond1 = longueurImage;
		} else if (xFond2 == -longueurImage) {
			xFond2 = longueurImage;
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		majFond();
		
		if (player.sautEnCours == true) {
			player.sauter();
			Audio.playSound("/audio/saut.wav");
		}
		
		if (rejouer == true) {
			Audio.playSound("/audio/partiePerdue.wav");
		}


		//Image brique = new ImageIcon(getClass().getResource("/images/Brique.png")).getImage();

		brique = new Brique(1200, 400);
		cubeMystere = new CubeMystere(840, 400);
		tuyau = new Tuyau(1800, 485);
		
		
		g2.drawImage(this.fondDuJeu1, xFond1, 0, null); 		 	    
		g2.drawImage(this.fondDuJeu2, xFond2, 0, null); 	
		g2.drawImage(Mario, player.getX(), player.getY(), null);
		g2.drawImage(this.brique.getImageBrique(), this.brique.getX()+xFond1, this.brique.getY(), null);
		g2.drawImage(this.tuyau.getImageBrique(), this.tuyau.getX()+xFond1, this.tuyau.getY(), null); 		 	
		g2.drawImage(this.cubeMystere.getImageCube(), this.cubeMystere.getX()+xFond1, this.cubeMystere.getY(), null); 	
		Font font = new Font("Press Start 2P", Font.PLAIN, 20);
		g2.setFont(font);
		g2.drawString(this.temps.getTempsRestant(), 5, 25);
		g2.drawString(this.score.getNbPieces() + " pièces trouvées ", 1150, 25);

	}
	
	public void detectionCollision (Objet[] objets) {
		Collision collision = null;
		Rectangle rectangleMario = new Rectangle(player.getX(),player.getY(),player.largeurMario,player.hauteurMario);
		for (Objet o : objets) {
			Rectangle rectangleObjet = new Rectangle(o.getX(),o.getY(),o.largeurObjet,o.hauteurObjet);
			boolean touché = rectangleMario.intersects(rectangleObjet);
			if (touché) {
				if (o.getX() == player.getX()) {
					collision = Collision.Gauche;
					player.setCollisionGauche(true);
				} else if (o.getX() + o.largeurObjet == player.getX()) {
					collision = Collision.Droite;
					player.setCollisionDroite(true);
				} else if (o.getY() == player.getY()) {
					collision = Collision.Bas;
					player.setCollisionBas(true);
				} else if (o.getY() + o.hauteurObjet == player.getY()) { //peut être à modifier en changeant le signe
					collision = Collision.Haut;      
					player.setCollisionHaut(true);
				}
			}
			o.actionObjet(collision);
		}
		
	}

	public void setX(int i) {
		dx = i;
	}


	public static int getHauteurPlafond(int x) {
		return 0;
	}


	public static int getHauteurSol(int x) {
		return 500;
	}
	
	public void setMario(ImageIcon NewImg) {
		this.MarioImg = NewImg;
		this.Mario = NewImg.getImage();
	}
	
	public static int getxFond1() {
		return xFond1;
	}
	
	public static int getDx() {
		return dx;
	}

	public int getFinalScore() {
		return score.getNbPieces();
	}
	
	public void rejouer() {
		rejouer = true;
		player = new Joueur(0,500);
		
		temps = new Temps();
		deplacement.stopJoueur();
		xFond1 = 0;
		xFond2 = longueurImage; // Les deux images sont en longueurImagex824 pixels.
		
		xPlayer = 0;
		
		xFondCumule = 0;
	    temps.setCompteurTemps(temps.getCompteurTemps());
	    player.setX(0);

	}
}