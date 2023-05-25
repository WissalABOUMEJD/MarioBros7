package pack.jeu;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import audioMario.Audio;
import menu.Menu;

import java.awt.Rectangle;
import java.util.ArrayList;

public class Niveau extends JPanel{

	private Image fondDuJeu1;
	private ImageIcon fondDuJeuImg1;
	
	private Image fondDuJeu2;
	private ImageIcon fondDuJeuImg2;
	
	private Image Ground;
	private ImageIcon GroundImg;
	
	private Image Mario;
	private ImageIcon MarioImg;
	
	private Image Lava;
	private ImageIcon LavaImg;
	
	public Joueur player;
		
	public static int xFond1;
	public static int xFond2;
	
	public static int xFondCumule;	
	private static int dx;
	
	public static int xPlayer;
	
	private static final int longueurImage = 1632;
	private static final int largeurImage = 1632;
	
	public Brique brique1;
	public Brique brique2;
	public Brique brique3;
	public Brique brique4;
	public Brique brique5;
	public Brique brique6;
	public Brique brique7;
	public Brique brique8;
	public Brique brique9;
	public Brique brique10;
	public Brique brique11;
	public Brique brique12;

	public CubeMystere cube1;
	public CubeMystere cube2;
	public CubeMystere cube3;
	public CubeMystere cube4;
	public CubeMystere cube5;
	public CubeMystere cube6;
	
	public Tuyau tuyau1;
	public Tuyau tuyau2;
	public Tuyau tuyau3;
	public Tuyau tuyau4;
	public Tuyau tuyau5;
	public Tuyau tuyau6;
	
	public Ground ground;
	public Ground ground2;
	public Lava lava;
	
	private ArrayList<Objet> tabObjets;
	
	
	public Temps temps;
	public ScoreJeu score;
	public Deplacement deplacement = new Deplacement();
	public boolean rejouer; 
	
	//image pour changement de joueur
	private ImageIcon avatar_en_cours;// image de l'avartar qui est affiché lorque que l'on joue et va etre modifié en fonction des déplacements
	private int compteurmarche;

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
		
		LavaImg = new ImageIcon(getClass().getResource("/images/Lava-Transparent4.png"));
		Lava = LavaImg.getImage();
		
		lava = new Lava(1588, 550);
		ground = new Ground(0, 550);
		ground2 = new Ground(1816, 550);
		GroundImg = new ImageIcon(getClass().getResource("/images/ground.png"));
		Ground = GroundImg.getImage();
		
		
		player = new Joueur(0,500);
		temps = new Temps();
		score = new ScoreJeu();
		

		brique1 = new Brique(1200, 404);
		brique2 = new Brique(1230, 404);
		cube1 = new CubeMystere(1260, 404);
		cube3 = new CubeMystere(1280, 250);
		brique3 = new Brique(1290, 404);
		brique4 = new Brique(1350, 404);
		cube2 = new CubeMystere(1320, 404);
		tuyau1 = new Tuyau(1500, 484);
		tuyau2 = new Tuyau(1800, 484);
		tuyau3 = new Tuyau(2100, 484);
		brique5 = new Brique(1950, 404);
		brique6 = new Brique(2600, 404);
		cube4 = new CubeMystere(2630, 404);
		brique7 = new Brique(2660, 404);
		brique8 = new Brique(3300, 404);
		brique9 = new Brique(3404, 404);
		
		cube1 = new CubeMystere(1260, 404);
		


		//Image brique = new ImageIcon(getClass().getResource("/images/Brique.png")).getImage();


		
		
		
		tabObjets = new ArrayList<Objet>();
		
		this.tabObjets.add(this.tuyau1);
		this.tabObjets.add(this.tuyau2);
		this.tabObjets.add(this.tuyau3);
		this.tabObjets.add(this.brique1);
		this.tabObjets.add(this.brique2);
		this.tabObjets.add(this.brique3);
		this.tabObjets.add(this.brique4);
		this.tabObjets.add(this.brique5);
		this.tabObjets.add(this.brique6);
		this.tabObjets.add(this.brique7);
		this.tabObjets.add(this.brique8);
		
		this.tabObjets.add(this.cube1);
		this.tabObjets.add(this.cube2);
		this.tabObjets.add(this.cube3);
		this.tabObjets.add(this.cube4);
		this.tabObjets.add(this.lava);

		
		
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
		

		if (player.getX() > 500 && dx > 0 && !player.collisionMario()) {
			xFond1 -= dx;
			xFond2 -= dx;
			xFondCumule += dx;
		} else if (!player.collisionMario()){
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
		
		
		detectionCollision(tabObjets);
		
		player.tomber();
		
		majFond();
		
		if (player.sautEnCours == true) {
			player.sauter();
			Audio.playSound("/audio/saut.wav");
		}
		// ajout des marhce droite, gauche,saut ect
		if (player.marcheDroiteEnCours == true ) {
			if(compteurmarche%2==0) {
				//Mario = Mario_marcheDroiteImg.getImage();
				compteurmarche++;
			}else {
				Mario = MarioImg.getImage();
				compteurmarche++;
			}
			player.courirdroite();
			//MarioImg=MarioDroiteImg;
	}
		
		if (player.marcheGaucheEnCours == true) {
			if(compteurmarche%2==0) {
				//Mario = Mario_marcheGaucheImg.getImage();
				compteurmarche++;
			}else {
				//Mario = MarioGaucheImg.getImage();
				compteurmarche++;
			}
			player.courirgauche();
			//MarioImg=MarioGaucheImg;
		}
		
		
		if (rejouer == true) {
			Audio.playSound("/audio/partiePerdue.wav");
		}
		
		player.setCollisionBas(false);
		player.setCollisionDroite(false);
		player.setCollisionGauche(false);
		player.setCollisionDroite(false);
		


		

		g2.drawImage(this.fondDuJeu1, xFond1, 0, null); 		 	    
		g2.drawImage(this.fondDuJeu2, xFond2, 0, null); 	
		g2.drawImage(Mario, player.getX(), player.getY(), null);
		g2.drawImage(Ground, deplacement(ground), ground.getY(), null);
		g2.drawImage(Ground, deplacement(ground2), ground2.getY(), null);
		for(int i = 0; i < this.tabObjets.size(); i++){
 	 		g2.drawImage(this.tabObjets.get(i).getImageObjet(), deplacement(this.tabObjets.get(i)), this.tabObjets.get(i).getY(), null);
 	 	}	 	

		Font font = new Font("Press Start 2P", Font.PLAIN, 20);
		g2.setFont(font);
		g2.drawString(this.temps.getTempsRestant(), 5, 25);
		g2.drawString(this.score.getNbPieces() + " pièces trouvées ", 1150, 25);

	}
	
	public int deplacement(Objet o){
		if(Niveau.xFondCumule >= 0) {
			return o.getX() - Niveau.xFondCumule;
		} else {
			return o.getX();
		}
	}

	public void detectionCollision (ArrayList<Objet> tabObjets) {
		Collision collision = null;
		Rectangle rectangleMario = new Rectangle(player.getX() + xFondCumule ,player.getY(),player.largeurMario + 2,player.hauteurMario);
		for (Objet o : tabObjets) {
			Rectangle rectangleObjet;
			if (o instanceof Lava) {
				rectangleObjet = new Rectangle(o.getX(),540,o.largeurObjet+2,o.hauteurObjet);
			} else {
				rectangleObjet = new Rectangle(o.getX(),o.getY(),o.largeurObjet+2,o.hauteurObjet);
			}
			boolean touché = rectangleMario.intersects(rectangleObjet);
			
			if (touché) {
				System.out.println(o);
				System.out.println(o.getY()- o.hauteurObjet);
				System.out.println(player.getY());
				if (o instanceof Lava) {
					Menu.showPanels(Menu.gameOverPanel, Menu.languePanel, Menu.MainMenuPanel, Menu.volumePanel, Menu.scorePanel,
			                Menu.jouerPanel, Menu.niveauPanel, Menu.optionsPanel);
				}
				if (o.getX() == player.getX() + xFondCumule + player.largeurMario) {
					collision = Collision.Gauche;
					player.setCollisionGauche(true);
					System.out.println("gauche");
					o.actionObjet(collision);

				} if (o.getX() + o.largeurObjet == player.getX() + xFondCumule) {
					collision = Collision.Droite;
					player.setCollisionDroite(true);
					System.out.println("droite");
					o.actionObjet(collision);


				} if (o.getY() - o.hauteurObjet  == player.getY() - player.hauteurMario/2) {
					collision = Collision.Bas;
					player.setCollisionBas(true);
					System.out.println("collisionbaaaaaas");
					o.actionObjet(collision);

					
				} if (o.getY() +o.hauteurObjet == player.getY()) { //peut être à modifier en changeant le signe
					collision = Collision.Haut;      
					player.setCollisionHaut(true);
					o.actionObjet(collision);
					System.out.println("collisionhauuuuuuuuut");
				}
			}
		}
		
	}

	public void setX(int i) {
		dx = i;
	}
	public static int getDx() {
		return dx;
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
