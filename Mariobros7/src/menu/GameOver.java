package menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOver extends JPanel {
    private JLabel jLabel20;  // Étiquette pour le texte "GAME OVER !"
    private JButton retourGameOverButton;  // Bouton pour rejouer
    private JLabel jlabel36;  // Étiquette pour l'image de fond

    /**
     * Construit un nouveau panneau pour l'écran de Game Over.
     */
    public GameOver() {
        jLabel20 = new JLabel();
        retourGameOverButton = new JButton();
        jlabel36 = new JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new Font("Press Start 2P", 1, 60));
        jLabel20.setText("GAME OVER !");
        jLabel20.setForeground(Color.RED);
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, 50));

        Menu.setButton(retourGameOverButton, "Rejouer?");  // Configure le bouton "Rejouer?"
        retourGameOverButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.retourGameOverButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton de retour
            }
        });
        add(retourGameOverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, -1, 50));
        
        jlabel36.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire2.png")));  // Affiche l'image de fond
        add(jlabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));
    }

    /**
     * Renvoie le bouton de retour du Game Over.
     *
     * @return le bouton de retour du Game Over
     */
    public JButton getRetourGameOverButton() {
        return retourGameOverButton;
    }

    /**
     * Définit le bouton de retour du Game Over.
     *
     * @param retourGameOverButton le bouton de retour du Game Over
     */
    public void setRetourGameOverButton(JButton retourGameOverButton) {
        this.retourGameOverButton = retourGameOverButton;
    }

    /**
     * Renvoie l'étiquette pour le texte "GAME OVER !".
     *
     * @return l'étiquette pour le texte "GAME OVER !"
     */
    public JLabel getJLabel() {
        return jLabel20;
    }
}
