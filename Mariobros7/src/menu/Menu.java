package menu;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import audioMario.Audio;
import pack.jeu.Niveau;

import javax.swing.JSlider;

/**
 * La classe Menu représente la fenêtre principale du jeu.
 * Elle étend la classe JFrame et contient les différents panneaux de l'interface utilisateur.
 */
public class Menu extends JFrame {
	// Les différents panneaux de l'interface utilisateur
	public static MainMenu MainMenuPanel;
	public static Options optionsPanel;
	public static Langues languePanel;
	public static Volume volumePanel;
	public static Score scorePanel;
	public static Jouer jouerPanel;
	public static Niveau niveauPanel;
	public static GameOver gameOverPanel;
	public static Gagner gagnerPanel;
	// Variables de contrôle
	public static boolean rejouer = true;
	public static boolean lancerNiveau = false;
	
	// ajout par alex de image icon Image pour déplacements
	//public ImageIcon avatar1 =new ImageIcon(niveauPanel.getClass().getResource("/images/moustache_profil_static.png")) ;
	//public ImageIcon avatar2= new ImageIcon(niveauPanel.getClass().getResource("/images/marioo.png"));
	//public ImageIcon avatar3=;
			
	/**
     * Crée une nouvelle instance de la classe Menu.
     * Initialise les composants de l'interface utilisateur et affiche le panneau principal.
     */
    public Menu() {
        initComponents();
        MainMenu();
    }
    
    /**
     * Affiche le panneau principal et masque les autres panneaux.
     */
    private void MainMenu() {
        optionsPanel.setVisible(false);
        MainMenuPanel.setVisible(true);
        languePanel.setVisible(false);
        volumePanel.setVisible(false);
        scorePanel.setVisible(false);
        jouerPanel.setVisible(false);
        niveauPanel.setVisible(false);
        gameOverPanel.setVisible(false);
        gagnerPanel.setVisible(false);
    }
    
    /**
     * Initialise les composants de l'interface utilisateur.
     */
    public void initComponents() {

        MainMenuPanel = new MainMenu();
        optionsPanel = new Options();
        languePanel = new Langues();
        volumePanel = new Volume();
        scorePanel = new Score();
        jouerPanel = new Jouer();
        niveauPanel = new Niveau();
        gameOverPanel = new GameOver();
        gagnerPanel = new Gagner();
        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        //Configuration de la disposition horizontale des composants
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(optionsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(languePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(volumePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scorePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(niveauPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gameOverPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gagnerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jouerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
      //Configuration de la disposition verticale des composants
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(optionsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(languePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(volumePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scorePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(niveauPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(gameOverPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(gagnerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jouerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }      
    
    /**
     * Affiche les panneaux spécifiés et masque les autres panneaux.
     * 
     * @param showPanel Le panneau à afficher
     * @param hidePanel1 Le premier panneau à masquer
     * @param hidePanel2 Le deuxième panneau à masquer
     * @param hidePanel3 Le troisième panneau à masquer
     * @param hidePanel4 Le quatrième panneau à masquer
     * @param hidePanel5 Le cinquième panneau à masquer
     * @param hidePanel6 Le sixième panneau à masquer
     * @param hidePanel7 Le septième panneau à masquer
     * @param hidePanel8 Le huitième panneau à masquer
     */
    public static void showPanels(JPanel showPanel, JPanel hidePanel1, JPanel hidePanel2, JPanel hidePanel3, JPanel hidePanel4, JPanel hidePanel5, JPanel hidePanel6, JPanel hidePanel7, JPanel hidePanel8) {
        showPanel.setVisible(true);
        hidePanel1.setVisible(false);
        hidePanel2.setVisible(false);
        hidePanel3.setVisible(false);
        hidePanel4.setVisible(false);
        hidePanel5.setVisible(false);
        hidePanel6.setVisible(false);
        hidePanel7.setVisible(false);
        hidePanel8.setVisible(false);
    }
    
    /**
     * Définit le style du bouton et son texte.
     *
     * @param button le bouton à configurer
     * @param text   le texte à afficher sur le bouton
     */
    public static void setButton(JButton button, String text) {
        button.setFont(new java.awt.Font("Press Start 2P", 1, 24));
        button.setText(text);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
    }

    /**
     * Gère l'événement lors du clic sur le bouton de sélection de la langue.
     *
     * @param evt l'événement de la souris
     */
    public static void langueButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	showPanels(languePanel, optionsPanel, MainMenuPanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel, gagnerPanel);
    }                                         

    /**
     * Gère l'événement lors du clic sur le bouton de réglage du volume.
     *
     * @param evt l'événement de la souris
     */
    public static void volumeButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	showPanels(volumePanel, optionsPanel, MainMenuPanel, languePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel, gagnerPanel);
    }
    
    /**
     * Gère l'événement lors du clic sur le bouton de retour après la partie perdue.
     *
     * @param evt l'événement de la souris
     */
    public static void retourGameOverButtonMouseClicked(java.awt.event.MouseEvent evt) {
    	niveauPanel.rejouer();
    	showPanels(MainMenuPanel, optionsPanel, languePanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel, gagnerPanel);
    	//Audio.stopSound("/audio/partiePerdue.wav");
    	rejouer = true;
    }                                         

    /**
     * Gère l'événement lors du clic sur le premier avatar.
     *
     * @param evt l'événement de la souris
     */
    public static void avatar1MouseClicked(java.awt.event.MouseEvent evt) {
    	
        niveauPanel.setMario(new ImageIcon(niveauPanel.getClass().getResource("/images/moustache_profil_static.png")),"/images/moustache_profil_static.png");
        niveauPanel.temps.setCompteurTemps(niveauPanel.temps.getCompteurTempsInitial());
    	showPanels(niveauPanel, optionsPanel, MainMenuPanel, languePanel, scorePanel, jouerPanel, volumePanel, gameOverPanel, gagnerPanel);
    }
    
    /**
     * Gère l'événement lors du clic sur le deuxième avatar.
     *
     * @param evt l'événement de la souris
     */
    public static void avatar2MouseClicked(java.awt.event.MouseEvent evt) {
    	
    	niveauPanel.setMario(new ImageIcon(niveauPanel.getClass().getResource("/images/cregut_static_droit.png")),"/images/cregut_static_droit.png");
    	niveauPanel.temps.setCompteurTemps(niveauPanel.temps.getCompteurTempsInitial());
    	showPanels(niveauPanel, optionsPanel, MainMenuPanel, languePanel, scorePanel, jouerPanel, volumePanel, gameOverPanel, gagnerPanel);
    }
    
    /**
     * Gère l'événement lors du clic sur le troisieme avatar.
     *
     * @param evt l'événement de la souris
     */
    public static void avatar3MouseClicked(java.awt.event.MouseEvent evt) {
    	niveauPanel.setMario(new ImageIcon(niveauPanel.getClass().getResource("/images/modifmario_arefaire.png")),"/images/modifmario_arefaire.png");
    	niveauPanel.temps.setCompteurTemps(niveauPanel.temps.getCompteurTempsInitial());
    	showPanels(niveauPanel, optionsPanel, MainMenuPanel, languePanel, scorePanel, jouerPanel, volumePanel, gameOverPanel, gagnerPanel);
    }
    
    /**
     * Gère l'événement lors du clic sur le bouton de retour du réglage du volume.
     *
     * @param evt l'événement de la souris
     */
    public static void retourVolumeButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                
    	showPanels(optionsPanel, languePanel, MainMenuPanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel, gagnerPanel);
    }                                               

    /**
     * Gère l'événement lors du clic sur le bouton de retour des options.
     *
     * @param evt l'événement de la souris
     */
    public static void retourOptionsButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                 
    	showPanels(MainMenuPanel, optionsPanel, languePanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel, gagnerPanel);
    }                                                
    
    /**
     * Gère l'événement lors du clic sur le bouton de retour des scores.
     *
     * @param evt l'événement de la souris
     */
    public static void retourScoreButtonMouseClicked(java.awt.event.MouseEvent evt) {                                               
    	showPanels(MainMenuPanel, optionsPanel, languePanel, volumePanel, scorePanel, jouerPanel,niveauPanel, gameOverPanel, gagnerPanel);
    }                                                                                          

    /**
     * Gère l'événement lors du clic sur le bouton de quitter.
     *
     * @param evt l'événement de la souris
     */
    public static void quitterButtonMouseClicked(java.awt.event.MouseEvent evt) {                                           
        System.exit(0);
    }                                          


    /**
     * Gère l'événement lors du clic sur le bouton de jouer.
     *
     * @param evt l'événement de la souris
     */
    public static void jouerButtonMouseClicked(java.awt.event.MouseEvent evt) {
        showPanels(jouerPanel, optionsPanel, languePanel, volumePanel, scorePanel, MainMenuPanel, niveauPanel, gameOverPanel, gagnerPanel);
    }

    /**
     * Gère l'événement lors du clic sur le bouton des options.
     *
     * @param evt l'événement de la souris
     */
    public static void optionsButtonMouseClicked(java.awt.event.MouseEvent evt) {
        showPanels(optionsPanel, MainMenuPanel, languePanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel, gagnerPanel);
    }

    /**
     * Gère l'événement lors du clic sur le bouton de retour après la sélection de l'avatar.
     *
     * @param evt l'événement de la souris
     */
    public static void retourAvatarButtonMouseClicked(java.awt.event.MouseEvent evt) {
        showPanels(MainMenuPanel, optionsPanel, languePanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel, gagnerPanel);
    }

    /**
     * Gère l'événement lors du clic sur le bouton des scores.
     *
     * @param evt l'événement de la souris
     */
    public static void scoreButtonMouseClicked(java.awt.event.MouseEvent evt) {
        showPanels(scorePanel, optionsPanel, languePanel, volumePanel, MainMenuPanel, jouerPanel, niveauPanel, gameOverPanel, gagnerPanel);
    }

    /**
     * Gère l'événement lors du clic sur le bouton de retour après la victoire.
     *
     * @param evt l'événement de la souris
     */
    public static void retourGagnerButtonMouseClicked(java.awt.event.MouseEvent evt) {
        niveauPanel.rejouer();
        showPanels(MainMenuPanel, optionsPanel, languePanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel, gagnerPanel);
        //Audio.stopSound("/audio/partiePerdue.wav");
        rejouer = true;
    }

    /**
     * Gère l'événement lors du clic sur le bouton de retour du choix de la langue.
     *
     * @param evt l'événement de la souris
     */
    public static void retourLangueButtonMouseClicked(java.awt.event.MouseEvent evt) {
        showPanels(optionsPanel, MainMenuPanel, languePanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel, gagnerPanel);
    }

    /**
     * Gère l'événement lors du clic sur le bouton de sélection de la langue anglaise.
     *
     * @param evt l'événement de la souris
     */
    public static void englishButtonMouseClicked(java.awt.event.MouseEvent evt) {
        MainMenuPanel.getJouerButton().setText("Play");
        MainMenuPanel.getQuitterButton().setText("Quit");
        volumePanel.getRetourButton().setText("Back");
        languePanel.getRetourButton().setText("Back");
        optionsPanel.getRetourOptionsButton().setText("Back");
        scorePanel.getRetourButton().setText("Back");
        jouerPanel.getRetourButton().setText("Back");
        optionsPanel.getLangueButton().setText("Language");
        languePanel.getFrenchButton().setText("French");
        languePanel.getEnglishButton().setText("English");
        scorePanel.getMeilleurButton().setText("Your highest score is");
        jouerPanel.getJLabel().setText("Select your avatar");
        gameOverPanel.getRetourGameOverButton().setText("Play again?");
        gagnerPanel.getRetourGagnerButton().setText("Play again?");
        gagnerPanel.getJLabel().setText("YOU WON !");
    }

    /**
     * Gère l'événement lors du clic sur le bouton de sélection de la langue française.
     *
     * @param evt l'événement de la souris
     */                                                                                   

    public static void frenchButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	MainMenuPanel.getJouerButton().setText("Jouer");
    	MainMenuPanel.getQuitterButton().setText("Retour");
    	volumePanel.getRetourButton().setText("Retour");
        languePanel.getRetourButton().setText("Retour");
        optionsPanel.getRetourOptionsButton().setText("Retour");
        scorePanel.getRetourButton().setText("Retour");
        jouerPanel.getRetourButton().setText("Retour");
        optionsPanel.getLangueButton().setText("Langue");
        languePanel.getFrenchButton().setText("Français");
        languePanel.getEnglishButton().setText("Anglais");
        scorePanel.getMeilleurButton().setText("Ton meilleur score est");
        jouerPanel.getJLabel().setText("Choisis ton avatar");
        gameOverPanel.getRetourGameOverButton().setText("Rejouer?");
        gagnerPanel.getRetourGagnerButton().setText("Rejouer?");
        gagnerPanel.getJLabel().setText("VOUS AVEZ GAGNÉ !");
    }                                         

    public static void main(String args[]) {
    	
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	Menu fenetre = new Menu();
                fenetre.setSize(1580,660);
                fenetre.setVisible(true);
                fenetre.setResizable(false);
                
            }
        });
    }
	             
}
