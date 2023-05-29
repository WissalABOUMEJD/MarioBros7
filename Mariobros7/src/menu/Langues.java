package menu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Langues extends JPanel {
    private JButton englishButton;  // Bouton pour sélectionner la langue anglaise
    private JButton frenchButton;  // Bouton pour sélectionner la langue française
    private JButton retourLangueButton;  // Bouton pour revenir au menu des options
    private JLabel jLabel9;  // Étiquette pour l'image de fond

    /**
     * Construit un nouveau panneau pour la sélection de la langue.
     */
    public Langues() {
        englishButton = new JButton();
        frenchButton = new JButton();
        retourLangueButton = new JButton();
        jLabel9 = new JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setButton(frenchButton, "Français");  // Configure le bouton pour la langue française
        frenchButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.frenchButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton pour la langue française
            }
        });
        add(frenchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 50));

        Menu.setButton(retourLangueButton, "Retour");  // Configure le bouton de retour
        retourLangueButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.retourLangueButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton de retour
            }
        });
        add(retourLangueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, 190, 30));

        Menu.setButton(englishButton, "Anglais");  // Configure le bouton pour la langue anglaise
        englishButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.englishButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton pour la langue anglaise
            }
        });
        add(englishButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, 50));

        jLabel9.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg")));  // Affiche l'image de fond
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 840));
    }

    /**
     * Renvoie le bouton pour la langue française.
     *
     * @return le bouton pour la langue française
     */
    public JButton getFrenchButton() {
        return frenchButton;
    }

    /**
     * Renvoie le bouton pour la langue anglaise.
     *
     * @return le bouton pour la langue anglaise
     */
    public JButton getEnglishButton() {
        return englishButton;
    }
    
    /**
     * Renvoie le bouton de retour.
     *
     * @return le bouton de retour
     */
    public JButton getRetourButton() {
        return retourLangueButton;
    }
}
