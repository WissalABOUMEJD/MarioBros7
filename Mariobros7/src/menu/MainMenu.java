package menu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JPanel {
    private JButton quitterButton;  // Bouton pour quitter le jeu
    private JButton jouerButton;  // Bouton pour démarrer une partie
    private JButton optionsButton;  // Bouton pour accéder aux options
    private JButton scoreButton;  // Bouton pour accéder aux scores
    private JLabel jLabel1;  // Étiquette pour l'image de fond

    /**
     * Construit un nouveau panneau pour le menu principal.
     */
    public MainMenu() {
        quitterButton = new JButton();
        jouerButton = new JButton();
        optionsButton = new JButton();
        scoreButton = new JButton();
        jLabel1 = new JLabel();
       
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setButton(quitterButton, "Quitter");  // Configure le bouton de quitter
        quitterButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.quitterButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton de quitter
            }
        });
      
        add(quitterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, -1, 50));

        Menu.setButton(jouerButton, "Jouer");  // Configure le bouton de jouer
        jouerButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.jouerButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton de jouer
            }
        });
        add(jouerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, 50));

        Menu.setButton(optionsButton, "Options");  // Configure le bouton d'options
        optionsButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.optionsButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton d'options
            }
        });
        add(optionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 50));

        Menu.setButton(scoreButton, "Score");  // Configure le bouton de score
        scoreButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.scoreButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton de score
            }
        });

        add(scoreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, 50));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg")));  // Affiche l'image de fond
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));

    }
    
    /**
     * Renvoie le bouton de quitter.
     *
     * @return le bouton de quitter
     */
    public JButton getQuitterButton() {
        return quitterButton;
    }
    
    /**
     * Renvoie le bouton de jouer.
     *
     * @return le bouton de jouer
     */
    public JButton getJouerButton() {
        return jouerButton;
    }
    
    /**
     * Renvoie le bouton d'options.
     *
     * @return le bouton d'options
     */
    public JButton getOptionsButton() {
        return optionsButton;
    }
    
    /**
     * Renvoie le bouton de score.
     *
     * @return le bouton de score
     */
    public JButton getScoreButton() {
        return scoreButton;
    }
}
