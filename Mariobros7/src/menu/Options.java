package menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Options extends JPanel {
    private JLabel jLabel8;  // Étiquette pour l'image de fond
    private JButton volumeButton;  // Bouton pour accéder aux options de volume
    private JButton langueButton;  // Bouton pour accéder aux options de langue
    private JButton retourOptionsButton;  // Bouton de retour

    /**
     * Construit un nouveau panneau des options.
     */
    public Options() {
        jLabel8 = new JLabel();
        volumeButton = new JButton();
        langueButton = new JButton();
        retourOptionsButton = new JButton();
        
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setButton(langueButton, "Langue");  // Configure le bouton de langue
        langueButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.langueButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton de langue
            }
        });
        add(langueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 50));

        Menu.setButton(volumeButton, "Volume");  // Configure le bouton de volume
        volumeButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.volumeButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton de volume
            }
        });
        add(volumeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, 50));

        Menu.setButton(retourOptionsButton, "Retour");  // Configure le bouton de retour
        retourOptionsButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.retourOptionsButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton de retour
            }
        });
        add(retourOptionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, 190, 30));

        jLabel8.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg"))); // Affiche l'image de fond
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));
    }
    
    /**
     * Renvoie le bouton de volume.
     *
     * @return le bouton de volume
     */
    public JButton getVolumeButton() {
        return volumeButton;
    }

    /**
     * Renvoie le bouton de langue.
     *
     * @return le bouton de langue
     */
    public JButton getLangueButton() {
        return langueButton;
    }
    
    /**
     * Renvoie le bouton de retour.
     *
     * @return le bouton de retour
     */
    public JButton getRetourOptionsButton() {
        return retourOptionsButton;
    }
}
