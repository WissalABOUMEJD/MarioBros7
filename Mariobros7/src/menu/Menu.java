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
 *
 * @author Wissal Aboumejd
 */
public class Menu extends JFrame {
	public static MainMenu MainMenuPanel;
	public static Options optionsPanel;
	public static Langues languePanel;
	public static Volume volumePanel;
	public static Score scorePanel;
	public static Jouer jouerPanel;
	public static Niveau niveauPanel;
	public static GameOver gameOverPanel;
	public static boolean rejouer = true;
	public static boolean lancerNiveau = false;
    /**
     * Creates new form fenetrePrincipale
     */
    public Menu() {
        initComponents();
        MainMenu();
    }
    
    private void MainMenu() {
        optionsPanel.setVisible(false);
        MainMenuPanel.setVisible(true);
        languePanel.setVisible(false);
        volumePanel.setVisible(false);
        scorePanel.setVisible(false);
        jouerPanel.setVisible(false);
        niveauPanel.setVisible(false);
        gameOverPanel.setVisible(false);
    }
                      
    public void initComponents() {

        MainMenuPanel = new MainMenu();
        quitterButton = MainMenuPanel.getQuitterButton();
        jouerButton = MainMenuPanel.getJouerButton();
        optionsButton = MainMenuPanel.getOptionsButton();
        optionsPanel = new Options();
        langueButton = optionsPanel.getLangueButton();
        retourOptionsButton = optionsPanel.getRetourOptionsButton();
        languePanel = new Langues();
        frenchButton = languePanel.getfrenchButton();
        retourLangueButton = languePanel.getRetourButton();
        englishButton = languePanel.getenglishButton();
        volumePanel = new Volume();
        retourVolumeButton = volumePanel.getRetourButton();
        scorePanel = new Score();
        meilleurScore = scorePanel.getMeilleurButton();
        retourScoreButton = scorePanel.getRetourButton();
        jouerPanel = new Jouer();
        jLabel6 = jouerPanel.getJlabel();
        retourAvatarButton = jouerPanel.getRetourButton();
        niveauPanel = new Niveau();
        gameOverPanel = new GameOver();
        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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
                    .addComponent(jouerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
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
                    .addComponent(jouerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }      
    
    public static void showPanels(JPanel showPanel, JPanel hidePanel1, JPanel hidePanel2, JPanel hidePanel3, JPanel hidePanel4, JPanel hidePanel5, JPanel hidePanel6, JPanel hidePanel7) {
        showPanel.setVisible(true);
        hidePanel1.setVisible(false);
        hidePanel2.setVisible(false);
        hidePanel3.setVisible(false);
        hidePanel4.setVisible(false);
        hidePanel5.setVisible(false);
        hidePanel6.setVisible(false);
        hidePanel7.setVisible(false);
    }
    
    static void setButton(JButton button, String text) {
        button.setFont(new java.awt.Font("Press Start 2P", 1, 24));
        button.setText(text);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
    }

    public static void langueButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	showPanels(languePanel, optionsPanel, MainMenuPanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel);
    }                                         

    public static void volumeButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	showPanels(volumePanel, optionsPanel, MainMenuPanel, languePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel);
    }
    
    public static void retourGameOverButtonMouseClicked(java.awt.event.MouseEvent evt) {
    	niveauPanel.rejouer();
    	showPanels(MainMenuPanel, optionsPanel, languePanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel);
    	//Audio.stopSound("/audio/partiePerdue.wav");
    	rejouer = true;
    }                                         

    static void avatar1MouseClicked(java.awt.event.MouseEvent evt) {
        niveauPanel.setMario(new ImageIcon(niveauPanel.getClass().getResource("/images/moustache_profil_static.png")));
        niveauPanel.temps.setCompteurTemps(niveauPanel.temps.getCompteurTempsInitial());
    	showPanels(niveauPanel, optionsPanel, MainMenuPanel, languePanel, scorePanel, jouerPanel, volumePanel, gameOverPanel);
    }
    
    static void avatar2MouseClicked(java.awt.event.MouseEvent evt) {
    	niveauPanel.setMario(new ImageIcon(niveauPanel.getClass().getResource("/images/marioo.png")));
    	niveauPanel.temps.setCompteurTemps(niveauPanel.temps.getCompteurTempsInitial());
    	showPanels(niveauPanel, optionsPanel, MainMenuPanel, languePanel, scorePanel, jouerPanel, volumePanel, gameOverPanel);
    }
    
    static void avatar3MouseClicked(java.awt.event.MouseEvent evt) {
    	niveauPanel.setMario(new ImageIcon(niveauPanel.getClass().getResource("/images/modifmario_arefaire.png")));
    	niveauPanel.temps.setCompteurTemps(niveauPanel.temps.getCompteurTempsInitial());
    	showPanels(niveauPanel, optionsPanel, MainMenuPanel, languePanel, scorePanel, jouerPanel, volumePanel, gameOverPanel);
    }
    
    public static void retourVolumeButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                
    	showPanels(optionsPanel, languePanel, MainMenuPanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel);
    }                                               

    public static void retourOptionsButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                 
    	showPanels(MainMenuPanel, optionsPanel, languePanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel);
    }                                                

    public static void meilleurScoreMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    public static void retourScoreButtonMouseClicked(java.awt.event.MouseEvent evt) {                                               
    	showPanels(MainMenuPanel, optionsPanel, languePanel, volumePanel, scorePanel, jouerPanel,niveauPanel, gameOverPanel);
    }                                                                                          

    public static void quitterButtonMouseClicked(java.awt.event.MouseEvent evt) {                                           
        System.exit(0);
    }                                          

    public static void jouerButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
    	showPanels(jouerPanel, optionsPanel, languePanel, volumePanel, scorePanel, MainMenuPanel, niveauPanel, gameOverPanel);
    }                                        

    public static void optionsButtonMouseClicked(java.awt.event.MouseEvent evt) {                                           
    	showPanels(optionsPanel, MainMenuPanel, languePanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel);
    }                                                                                

    public static void retourAvatarButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                
    	showPanels(MainMenuPanel, optionsPanel, languePanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel);
    }                                                                                     

    public static void scoreButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
    	showPanels(scorePanel, optionsPanel, languePanel, volumePanel, MainMenuPanel, jouerPanel, niveauPanel, gameOverPanel);
    }
    
    public static void retourLangueButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                
    	showPanels(optionsPanel, MainMenuPanel, languePanel, volumePanel, scorePanel, jouerPanel, niveauPanel, gameOverPanel);
    }     

    public static void englishButtonMouseClicked(java.awt.event.MouseEvent evt) {                                           
        jouerButton.setText("Play");
        quitterButton.setText("Quit");
        retourVolumeButton.setText("Back");
        retourLangueButton.setText("Back");
        retourOptionsButton.setText("Back");
        retourScoreButton.setText("Back");
        retourAvatarButton.setText("Back");
        langueButton.setText("Language");
        frenchButton.setText("French");
        englishButton.setText("English");
        meilleurScore.setText("Your highest score is");
        jLabel6.setText("Select your avatar");

    }                                                                                    

    public static void frenchButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        jouerButton.setText("Jouer");
        quitterButton.setText("Retour");
        retourVolumeButton.setText("Retour");
        retourLangueButton.setText("Retour");
        retourOptionsButton.setText("Retour");
        retourScoreButton.setText("Retour");
        retourAvatarButton.setText("Retour");
        langueButton.setText("Langue");
        frenchButton.setText("Français");
        englishButton.setText("Anglais");
        meilleurScore.setText("Ton meilleur score est");
        jLabel6.setText("Choisis ton avatar");
    }                                         

    public static void main(String args[]) {
    	
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu fenetre = new Menu();
		fenetre.setSize(1700,678);
                fenetre.setVisible(true);
            }
        });
    }
	
    static JButton englishButton;
    static JButton frenchButton;
    static JLabel jLabel6;
    static JButton jouerButton;
    static JButton langueButton;
    static JButton meilleurScore;
    static JButton optionsButton;
    static JButton quitterButton;
    static JButton retourAvatarButton;
    static JButton retourLangueButton;
    static JButton retourOptionsButton;
    static JButton retourScoreButton;
    static JButton retourVolumeButton;                
}
