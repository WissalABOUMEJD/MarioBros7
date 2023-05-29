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
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

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
	
	private Image ennemi;
	private ImageIcon ennemiImg;	
	
	public Joueur player;
		
	public static int xFond1;
	public static int xFond2;
	
	public static int xFondCumule;	
	private static int dx;
	
	public static int xPlayer;
	
	private static final int longueurImage = 1632;
	private static final int largeurImage = 1632;
	//ajout des briques
	public Brique briquetest;
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
	//ajout des cube mystere
	public CubeMystere cube1;
	public CubeMystere cube2;
	public CubeMystere cube3;
	public CubeMystere cube4;
	public CubeMystere cube5;
	public CubeMystere cube6;
	//ajout des tuyaux
	public Tuyau tuyau1;
	public Tuyau tuyau2;
	public Tuyau tuyau3;
	public Tuyau tuyau4;
	public Tuyau tuyau5;
	public Tuyau tuyau6;
	//ajout du sol et de la lave
	public Ground ground;
	public Ground ground2;
	public Lava lava;
	//ajout des pièces
	public Piece piece1;
	public Piece piece2;
	public Piece piece3;
	public Piece piece4;
	public Piece piece5;
	public Piece piece6;
	
	public Ennemi ennemi1;

	public Champignon champignon;
	
	private ArrayList<Objet> tabObjets; // tableau qui enregistre tous les objets du jeu
	private ArrayList<Piece> tabPieces; // tableau qui enregistre tous les pices du niveau
	private ArrayList<Ennemi> tabEnnemi; // tableau qui enregistre tous les pices du niveau
	private ArrayList<Champignon> tabChampignon; // tableau qui enregistre tous les pices du niveau


	public Chateau chateau;
	public Temps temps;
	public ScoreJeu score;
	public Deplacement deplacement = new Deplacement();
	public boolean rejouer; 
	public boolean isPaused;
	
	//image pour changement de joueur
	// elle seront définit dans la méthode setMario
	private ImageIcon saut_droite;
	private ImageIcon saut_gauche;
	private ImageIcon marche_droite;
	private ImageIcon marche_gauche;
	private ImageIcon static_droite;
	private ImageIcon static_gauche;
	private int compteurmarche;
	
	private Avatar typeMario;
	
	/**Constructeur de la classe niveau
	*/
	public Niveau() {
		super();
		

		xFond1 = 0;
		xFond2 = longueurImage; // Les deux images sont en longueurImagex824 pixels.
		
		xPlayer = 0;
		
		xFondCumule = 0;
		
		
		fondDuJeuImg1 = new ImageIcon(getClass().getResource("/images/fond_test.png"));
		fondDuJeu1 =fondDuJeuImg1.getImage();
		
		fondDuJeuImg2 = new ImageIcon(getClass().getResource("/images/fond_test.png"));
		fondDuJeu2 =fondDuJeuImg2.getImage();
		
		
		MarioImg = new ImageIcon(getClass().getResource("/images/modifmario_arefaire.png"));
		Mario = MarioImg.getImage();
		
		LavaImg = new ImageIcon(getClass().getResource("/images/Lava-Transparent4.png"));
		Lava = LavaImg.getImage();
		
		lava = new Lava(1568, 548);
		ground = new Ground(0, 548);
		ground2 = new Ground(1796, 548);
		GroundImg = new ImageIcon(getClass().getResource("/images/ground.png"));
		Ground = GroundImg.getImage();
		
		ennemiImg = new ImageIcon(getClass().getResource("/images/Goomba.png"));
		ennemi = ennemiImg.getImage();
		
		
		player = new Joueur(0,452);
		temps = new Temps();
		score = new ScoreJeu();
		System.out.println(this.score.getNbPieces());
		
		//instanciantion des objets
		brique1 = new Brique(1200, 404,Briques.cassable);
		brique2 = new Brique(1230, 404,Briques.pièce);

		cube1 = new CubeMystere(1260, 404,Cubes.vide);
		cube3 = new CubeMystere(1280, 260,Cubes.champignon);
		brique3 = new Brique(1290, 404,Briques.cassable);
		brique4 = new Brique(1350, 404,Briques.pièce);
		cube2 = new CubeMystere(1320, 404,Cubes.vide);
		tuyau1 = new Tuyau(1500, 484);
		tuyau2 = new Tuyau(1800, 484);
		tuyau3 = new Tuyau(2100, 484);
		brique5 = new Brique(1950, 404,Briques.pièces);
		brique6 = new Brique(2600, 404,Briques.pièces);
		cube4 = new CubeMystere(2630, 404,Cubes.champignon);
		brique7 = new Brique(2660, 404,Briques.pièce);
		brique8 = new Brique(3300, 404,Briques.cassable);
		brique9 = new Brique(3404, 404,Briques.cassable);
		
		cube1 = new CubeMystere(1260, 404,Cubes.pièces);
		//Instancier objet piece
		piece1 = new Piece(1230,370);
		piece2 = new Piece(1200,370);
		piece3 = new Piece(1290,370);
		piece4 = new Piece(1350,370);
		piece5 = new Piece(1950,370);
		piece6 = new Piece(2660,370);
		chateau = new Chateau(3800,404);
		
		ennemi1 = new Ennemi(500,452,false);


		//Image brique = new ImageIcon(getClass().getResource("/images/Brique.png")).getImage();


		
		
		// on remplit la liste des objets
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

		//on remplit la liste des pièces
		tabPieces = new ArrayList<Piece>();
		this.tabPieces.add(this.piece1);
		this.tabPieces.add(this.piece2);
		this.tabPieces.add(this.piece3);
		this.tabPieces.add(this.piece4);
		this.tabPieces.add(this.piece5);
		this.tabPieces.add(this.piece6);
		
		this.tabObjets.add(this.ground);
		this.tabObjets.add(this.ground2);
		
		tabEnnemi = new ArrayList<Ennemi>();
		this.tabEnnemi.add(this.ennemi1);		
		
		tabChampignon = new ArrayList<Champignon>();

		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(deplacement);

		Thread refresh = new Thread(new FPS());
		refresh.start();
	}
	/**Procédure de mise à a jour du fond de jeu (faire avancer personnage,afichage,mouvements ect)
	*MAJ faite toutes les 0,2s
	*/
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
	/** Permet de chaner les images de l'avartar en fonction de ses déplacements
	*@param g A ECRIRE
	*/
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		//on détecte les collisions à l'instant t
		detectionCollision(tabObjets);
		detectionCollisionEnnemiMario(tabEnnemi);
		detectionCollisionBonusMario(tabChampignon);
		
		player.tomber();
		
		majFond();
		
		//SI mario sur une piece on enleve la piece
		for(int i=0;i< this.tabPieces.size();i++) {
			if(player.contactPiece(tabPieces.get(i))==true) {
				this.tabPieces.remove(i);
				this.score.setNbrePieces(this.score.getNbPieces() + 1);
		}
		}
		
		if(player.contactChateau(chateau)) {
			Menu.showPanels(Menu.gagnerPanel, Menu.languePanel, Menu.MainMenuPanel, Menu.volumePanel, Menu.scorePanel,
	                Menu.jouerPanel, Menu.niveauPanel, Menu.optionsPanel, Menu.gameOverPanel);
		}
		// Changement de position des personnages


		if (player.sautEnCours == true && !player.chuteEnCours) {

			player.sauter();
			Audio.playSound("/audio/saut.wav");
			if(MarioImg==static_gauche) {
				Mario = saut_gauche.getImage();
			}else {
				Mario = saut_droite.getImage();
			}
			
		}
		// ajout des marhce droite, gauche,saut ect
		else if (player.marcheDroiteEnCours == true ) {
			if(compteurmarche%2==0) {
				Mario = marche_droite.getImage(); //on alterne l'image de mario qui court et mario normal pour fairel'illusion qu'il court
				compteurmarche++;
			}else {
				Mario = MarioImg.getImage();
				compteurmarche++;
			}
			//player.courirdroite();
			if(compteurmarche%30==0) {
				player.marcheDroiteEnCours=false;
			}
			MarioImg=static_droite;// on remet le amrio static droit une fois qu'il arrete de courir
	}
		
		
		else if (player.marcheGaucheEnCours == true) {
			if(compteurmarche%2==0) {
				Mario = marche_gauche.getImage();
				compteurmarche++;
			}else {
				Mario = MarioImg.getImage();
				compteurmarche++;
			}
			//player.courirgauche();
			if(compteurmarche%30==0) {
				player.marcheDroiteEnCours=false;
			}
			MarioImg=static_gauche;
		}else {
			Mario = MarioImg.getImage();
			compteurmarche=0;
		}
		
		
		
		if (rejouer == true) {
			Audio.playSound("/audio/partiePerdue.wav");
		}
		

		
		
		
		player.setCollisionBas(false);
		player.setCollisionDroite(false);
		player.setCollisionGauche(false);
		player.setCollisionHaut(false);
		


		

		g2.drawImage(this.fondDuJeu1, xFond1, 0, null); 		 	    
		g2.drawImage(this.fondDuJeu2, xFond2, 0, null); 	
		g2.drawImage(Mario, player.getX(), player.getY(), null);
		g2.drawImage(chateau.getImageObjet(), deplacement(chateau), chateau.getY(), null);
		g2.drawImage(Ground, deplacement(ground), ground.getY(), null);
		g2.drawImage(Ground, deplacement(ground2), ground2.getY(), null);
		
		//Image des objets
		for(int i = 0; i < this.tabObjets.size(); i++){
			if (tabObjets.get(i) instanceof Brique) {
				Brique brick = (Brique) tabObjets.get(i);
				if (brick.isCasse()) {
					tabObjets.remove(i);
				}
			} if (tabObjets.get(i) instanceof CubeMystere) {
				CubeMystere cube = (CubeMystere) tabObjets.get(i);
				if (cube.isLibereChampignon()) {
					libérationChampignon(cube);
					cube.setLibereChampignon(false);
				}
			}
 	 		g2.drawImage(this.tabObjets.get(i).getImageObjet(), deplacement(this.tabObjets.get(i)), this.tabObjets.get(i).getY(), null);
 	 	}	 	
		
		//Image des pices
		for(int i = 0; i < this.tabPieces.size(); i++){
 	 		g2.drawImage(this.tabPieces.get(i).getImageObjet(), deplacement(this.tabPieces.get(i)), this.tabPieces.get(i).getY(), null);
 	 	}
		//Image des ennemis
		for(int i = 0; i < this.tabEnnemi.size(); i++){
			detectionCollisionEnnemiObstacle(tabObjets,tabEnnemi.get(i));
			tabEnnemi.get(i).deplacementEnnemi();
 	 		g2.drawImage(this.tabEnnemi.get(i).getImageObjet(), deplacement(this.tabEnnemi.get(i)), this.tabEnnemi.get(i).getY(), null);
 	 	}	
		//Image des Champignons
		for(int i = 0; i < this.tabChampignon.size(); i++){
			detectionCollisionChampignonObstacle(tabObjets,tabChampignon.get(i));
			tabChampignon.get(i).deplacementChampignon();
		 	g2.drawImage(this.tabChampignon.get(i).getImageObjet(), deplacement(this.tabChampignon.get(i)), this.tabChampignon.get(i).getY(), null);
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
		Rectangle rectangleMario = new Rectangle(player.getX() + xFondCumule ,player.getY(),player.largeurMario + 1,player.hauteurMario+1);
		for (Objet o : tabObjets) {
			Rectangle rectangleObjet;
			rectangleObjet = new Rectangle(o.getX(),o.getY(),o.largeurObjet+1,o.hauteurObjet+1);
			boolean touché = rectangleMario.intersects(rectangleObjet);
			if (touché) {
				if (o instanceof Lava) {
					Menu.showPanels(Menu.gameOverPanel, Menu.languePanel, Menu.MainMenuPanel, Menu.volumePanel, Menu.scorePanel,
			                Menu.jouerPanel, Menu.niveauPanel, Menu.optionsPanel, Menu.gagnerPanel);
				}
				if (o.getX() == player.getX() + xFondCumule + player.largeurMario && player.getY() + player.hauteurMario != o.getY()) {
					collision = Collision.Gauche;
					player.setCollisionGauche(true);
					o.actionObjet(collision);

				} if (o.getX() + o.largeurObjet == player.getX() + xFondCumule && player.getY() + player.hauteurMario != o.getY()) {
					collision = Collision.Droite;
					player.setCollisionDroite(true);
					o.actionObjet(collision);

				}  if (player.getY() + player.hauteurMario == o.getY() ){
					collision = Collision.Bas;
					player.setCollisionBas(true);
					player.chuteEnCours = false;
					o.actionObjet(collision);
					
				} if (player.getY() == o.getY() +o.hauteurObjet ){ 
					collision = Collision.Haut;      
					player.setCollisionHaut(true);
					o.actionObjet(collision);
					
			}
		}
		}
	}
	

	public void detectionCollisionEnnemiObstacle (ArrayList<Objet> tabObjets,Ennemi ennemi) {
		boolean tomber = true;
		Rectangle rectangleEnnemi = new Rectangle(ennemi.getX()  ,ennemi.getY(),ennemi.getLargeurObjet() + 1,ennemi.getHauteurObjet()+1);
		for (Objet o : tabObjets) {
			Rectangle rectangleObjet;

			rectangleObjet = new Rectangle(o.getX(),o.getY(),o.largeurObjet+1,o.hauteurObjet+1);
			boolean touché = rectangleEnnemi.intersects(rectangleObjet);

			if (touché && ennemi.getY() + ennemi.getHauteurObjet() == o.getY()) {  //Collision avec le bas l'ennemi ne tombe donc pas
				tomber = false;
			} else if (touché) {   //Collision avec un obstacle
				ennemi.changerDirection();
			}
			
			}
		if (tomber) {
			ennemi.setY(16);
		}
	}
	
	
	public void detectionCollisionChampignonObstacle (ArrayList<Objet> tabObjets,Champignon champignon) {
		boolean tomber = true;
		Rectangle rectangleEnnemi = new Rectangle(champignon.getX()  ,champignon.getY(),champignon.getLargeurObjet() + 1,champignon.getHauteurObjet()+1);
		for (Objet o : tabObjets) {
			Rectangle rectangleObjet;

			rectangleObjet = new Rectangle(o.getX(),o.getY(),o.largeurObjet+1,o.hauteurObjet+1);
			boolean touché = rectangleEnnemi.intersects(rectangleObjet);

			if (touché && champignon.getY() + champignon.getHauteurObjet() == o.getY()) {  //Collision avec le bas l'ennemi ne tombe donc pas
				tomber = false;
			} else if (touché) {   //Collision avec un obstacle
				champignon.changerDirection();
			}
			
			}
		if (tomber) {
			champignon.setY(16);
		}
	}

	public void detectionCollisionEnnemiMario (ArrayList<Ennemi> tabEnnemi) {
		try {
		Rectangle rectangleMario = new Rectangle(player.getX() + xFondCumule ,player.getY(),player.largeurMario + 1,player.hauteurMario+1);
		for (Ennemi o : tabEnnemi) {
			Rectangle rectangleEnnemi;
			rectangleEnnemi = new Rectangle(o.getX(),o.getY(),o.largeurObjet+1,o.hauteurObjet+1);	
			boolean touché = rectangleMario.intersects(rectangleEnnemi);	
			if (touché) {
				if (player.getY() + player.hauteurMario == o.getY() ) {   //Contact de mario sur le haut de l'ennemi
					tabEnnemi.remove(o);  //Ajouter le bruit pour tuer l'ennemi
				} else {
					player.toucher();
					retrecirImage();
				} 
			}
		} 
		}catch (ConcurrentModificationException e)	{
			
		}
	}
	
	
	public void detectionCollisionBonusMario (ArrayList<Champignon> tabChampignon) {
		try {
		Rectangle rectangleMario = new Rectangle(player.getX() + xFondCumule ,player.getY(),player.largeurMario + 1,player.hauteurMario+1);
		for (Champignon o : tabChampignon) {
			Rectangle rectangleChampignon;
			rectangleChampignon = new Rectangle(o.getX(),o.getY(),o.largeurObjet+1,o.hauteurObjet+1);	
			boolean touché = rectangleMario.intersects(rectangleChampignon);	
			if (touché) {
				player.grandir();
				tabChampignon.remove(o);
				grandirImage();
			}
			}
		} catch (ConcurrentModificationException e) {
			
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
	/** Permet de trnascire l'avatar choisi dans le menu lors du choix des avatars dans le niveau directement
	* @param NewImg image que l'utilisateur à choisit pour le niveau
	* @param url localisation de l'image dans les fichiers pourvoir selectionner toutes les autres images de mouvements correspondant à ce personnage
	*/
	public void setMario(ImageIcon NewImg,String url) {		
		this.MarioImg = NewImg;
		this.Mario = NewImg.getImage();
		if (url =="/images/moustache_profil_static.png") {
			// on charge les images pour le gars à la moustache
			this.marche_droite =new ImageIcon(getClass().getResource("/images/cregut_marche_droite.png"));
			this.marche_gauche =new ImageIcon(getClass().getResource("/images/cregut_marche_gauche.png"));
			this.saut_droite =new ImageIcon(getClass().getResource("/images/cregut_saut.png"));
			this.saut_gauche=new ImageIcon(getClass().getResource("/images/cregut_saut_gauche.png"));
			this.static_droite =new ImageIcon(getClass().getResource("/images/cregut_static_droit.png"));
			this.static_gauche=new ImageIcon(getClass().getResource("/images/cregut_static_gauche.png"));
			typeMario = Avatar.Moustache;
		}
		else if(url =="/images/moustache_profil_static.png") {
			//on charge les images pour le perso vert
			this.marche_droite =new ImageIcon(getClass().getResource("/images/cregut_marche_droite.png"));
			this.marche_gauche =new ImageIcon(getClass().getResource("/images/cregut_marche_gauche.png"));
			this.saut_droite =new ImageIcon(getClass().getResource("/images/cregut_saut.png"));
			this.saut_gauche=new ImageIcon(getClass().getResource("/images/cregut_saut_gauche.png"));
			this.static_droite =new ImageIcon(getClass().getResource("/images/cregut_static_droit.png"));
			this.static_gauche=new ImageIcon(getClass().getResource("/images/cregut_static_gauche.png"));
			typeMario = Avatar.Vert;

		}else {
			
			this.marche_droite =new ImageIcon(getClass().getResource("/images/cregut_marche_droite.png"));
			this.marche_gauche =new ImageIcon(getClass().getResource("/images/cregut_marche_gauche.png"));
			this.saut_droite =new ImageIcon(getClass().getResource("/images/cregut_saut.png"));
			this.saut_gauche=new ImageIcon(getClass().getResource("/images/cregut_saut_gauche.png"));
			this.static_droite =new ImageIcon(getClass().getResource("/images/cregut_static_droit.png"));
			this.static_gauche=new ImageIcon(getClass().getResource("/images/cregut_static_gauche.png"));
			typeMario = Avatar.Mario;

		}
		
	}
	
	public static int getxFond1() {
		return xFond1;
	}
	

	/**Obtenir le score final que le joueur à atteint
	* @return entier correspond au nombre de coin gagner
	*/
	public int getFinalScore() {
		return score.getNbPieces();
	}
	
	public void grandirImage() {
		if (typeMario == Avatar.Moustache) {
			// on charge les images pour le gars à la moustache
			// on charge les images pour le gars à la moustache
			this.marche_droite = new ImageIcon(getClass().getResource("/images/moustache_profil_marche.png"));
			this.marche_gauche =new ImageIcon(getClass().getResource("/images/moustache_profil_marche_gauche.png"));
			this.saut_droite =new ImageIcon(getClass().getResource("/images/moustache_profil_saut.png"));
			this.saut_gauche=new ImageIcon(getClass().getResource("/images/moustache_profil_saut_gauche.png"));
			this.static_droite =new ImageIcon(getClass().getResource("/images/moustache_profil_static.png"));;
			this.static_gauche=new ImageIcon(getClass().getResource("/images/moustache_static_gauche.png"));
		}
		else if(typeMario == Avatar.Vert) {
			//on charge les images pour le perso vert
			this.marche_droite =new ImageIcon(getClass().getResource("/images/cregut_marche_droite_grand.png"));
			this.marche_gauche =new ImageIcon(getClass().getResource("/images/cregut_marche_gauche_grand.png"));
			this.saut_droite =new ImageIcon(getClass().getResource("/images/cregut_saut_grand.png"));
			this.saut_gauche=new ImageIcon(getClass().getResource("/images/cregut_saut_gauche_grand.png"));
			this.static_droite =new ImageIcon(getClass().getResource("/images/cregut_static_droit_grand.png"));
			this.static_gauche=new ImageIcon(getClass().getResource("/images/cregut_static_gauche_grand.png"));
		}else {
			this.marche_droite =new ImageIcon(getClass().getResource("/images/marche_droite.png"));
			this.marche_gauche =new ImageIcon(getClass().getResource("/images/marche_gauche.png"));
			this.saut_droite =new ImageIcon(getClass().getResource("/images/saut_droite.png"));
			this.saut_gauche=new ImageIcon(getClass().getResource("/images/saut_gauche.png"));
			this.static_droite =new ImageIcon(getClass().getResource("/images/static_droit.png"));
			this.static_gauche=new ImageIcon(getClass().getResource("/images/static_gauche.png"));
		}	
	}
	
	public void retrecirImage() {
		if (typeMario == Avatar.Moustache) {
			// on charge les images pour le gars à la moustache
			// on charge les images pour le gars à la moustache
			this.marche_droite = new ImageIcon(getClass().getResource("/images/moustache_profil_marche.png"));
			this.marche_gauche =new ImageIcon(getClass().getResource("/images/moustache_profil_marche_gauche.png"));
			this.saut_droite =new ImageIcon(getClass().getResource("/images/moustache_profil_saut.png"));
			this.saut_gauche=new ImageIcon(getClass().getResource("/images/moustache_profil_saut_gauche.png"));
			this.static_droite =new ImageIcon(getClass().getResource("/images/moustache_profil_static.png"));;
			this.static_gauche=new ImageIcon(getClass().getResource("/images/moustache_static_gauche.png"));
		}
		else if(typeMario == Avatar.Vert) {
			//on charge les images pour le perso vert
			this.marche_droite =new ImageIcon(getClass().getResource("/images/cregut_marche_droite.png"));
			this.marche_gauche =new ImageIcon(getClass().getResource("/images/cregut_marche_gauche.png"));
			this.saut_droite =new ImageIcon(getClass().getResource("/images/cregut_saut.png"));
			this.saut_gauche=new ImageIcon(getClass().getResource("/images/cregut_saut_gauche.png"));
			this.static_droite =new ImageIcon(getClass().getResource("/images/cregut_static_droit.png"));
			this.static_gauche=new ImageIcon(getClass().getResource("/images/cregut_static_gauche.png"));
		}else {
			this.marche_droite =new ImageIcon(getClass().getResource("/images/marche_droite.png"));
			this.marche_gauche =new ImageIcon(getClass().getResource("/images/marche_gauche.png"));
			this.saut_droite =new ImageIcon(getClass().getResource("/images/saut_droite.png"));
			this.saut_gauche=new ImageIcon(getClass().getResource("/images/saut_gauche.png"));
			this.static_droite =new ImageIcon(getClass().getResource("/images/static_droit.png"));
			this.static_gauche=new ImageIcon(getClass().getResource("/images/static_gauche.png"));
		}	
	}
	
	public void libérationChampignon(CubeMystere cube) {
		tabChampignon.add(new Champignon(cube.getX() , cube.getY() + -32,false));
		cube.setParticularité(Cubes.vide);
		cube.changementImage();
	}
	
	/** Redémare un niveau en remplacent le joueur au niveau de départ
	*/
	public void rejouer() {
		int resoudre = getFinalScore();
        String scoreFinal = String.valueOf(resoudre);
        Menu.scorePanel.setjTextField1(scoreFinal);
		rejouer = true;
		player = new Joueur(0,500);
		
		temps = new Temps();
		deplacement.stopJoueur();
		score.setNbrePieces(0);
		xFond1 = 0;
		xFond2 = longueurImage; // Les deux images sont en longueurImagex824 pixels.
		
		xPlayer = 0;
		
		xFondCumule = 0;
	    temps.setCompteurTemps(temps.getCompteurTemps());
	    player.setX(0);
	    this.tabPieces.add(this.piece1);
		this.tabPieces.add(this.piece2);
		this.tabPieces.add(this.piece3);
		this.tabPieces.add(this.piece4);
		this.tabPieces.add(this.piece5);
		this.tabPieces.add(this.piece6);
	}
	
}
