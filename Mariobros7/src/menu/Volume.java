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
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Le panneau de contrôle du volume.
 */
public class Volume extends JPanel {
    private JButton retourVolumeButton;  // Bouton de retour
    private JSlider volumeSlider;  // Curseur de volume
    private JLabel jLabel10;  // Étiquette pour l'image de fond

    /**
     * Construit un nouveau panneau de contrôle du volume.
     */
    public Volume() {
        retourVolumeButton = new JButton();
        volumeSlider = new JSlider();
        jLabel10 = new JLabel();
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setButton(retourVolumeButton, "Retour");  // Configure le bouton de retour
        retourVolumeButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.retourVolumeButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton de retour
            }
        });
        add(retourVolumeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, 190, 30));

        setForeground(new Color(0, 204, 0));
        add(volumeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 330, 40));

        jLabel10.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg")));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));

        volumeSlider.addChangeListener((ChangeListener) new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                updateVolume();  // Met à jour le volume lorsque la valeur du curseur change
            }
        });
    }

    /**
     * Renvoie le curseur de volume.
     * 
     * @return le curseur de volume
     */
    public JSlider getvolumeSlider() {
        return volumeSlider;  // Renvoie le curseur de volume
    }

    /**
     * Met à jour le volume en fonction de la valeur actuelle du curseur.
     */
    public void updateVolume() {
        int volume = volumeSlider.getValue();
        System.out.println("Nouvelle valeur du volume : " + volume);  // Affiche la nouvelle valeur du volume dans la console
    }

    /**
     * Renvoie le bouton de retour.
     * 
     * @return le bouton de retour
     */
    public JButton getRetourButton() {
        return retourVolumeButton;  // Renvoie le bouton de retour
    }
}
