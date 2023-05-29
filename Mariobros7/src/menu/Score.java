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
import javax.swing.JTextField;

public class Score extends JPanel {
    private JButton meilleurScore;  // Bouton pour afficher le meilleur score
    private JButton retourScoreButton;  // Bouton de retour
    private JTextField jTextField1;  // Champ de texte pour afficher le score
    private JLabel jlabel11;  // Étiquette pour l'image de fond

    /**
     * Construit un nouveau panneau d'affichage des scores.
     */
    public Score() {
        meilleurScore = new JButton();
        retourScoreButton = new JButton();
        jTextField1 = new JTextField();
        jlabel11 = new JLabel();
        
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setButton(meilleurScore, "Ton dernier score est");  // Configure le bouton du dernier score

        add(meilleurScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, 50));

        Menu.setButton(retourScoreButton, "Retour");  // Configure le bouton de retour
        retourScoreButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.retourScoreButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton de retour
            }
        });
        add(retourScoreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, 190, 30));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 400, 50));

        jlabel11.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg")));
        add(jlabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));
    }

    /**
     * Renvoie le bouton du meilleur score.
     *
     * @return le bouton du meilleur score
     */
    public JButton getMeilleurButton() {
        return meilleurScore;
    }

    /**
     * Renvoie le bouton de retour.
     *
     * @return le bouton de retour
     */
    public JButton getRetourButton() {
        return retourScoreButton;
    }

    /**
     * Renvoie le champ de texte pour afficher le score.
     *
     * @return le champ de texte pour afficher le score
     */
    public JTextField getTextButton() {
        return jTextField1;
    }

    /**
     * Renvoie le champ de texte pour afficher le score.
     *
     * @return le champ de texte pour afficher le score
     */
    public JTextField getjTextField1() {
        return jTextField1;
    }

    /**
     * Définit le texte du champ de texte pour afficher le score.
     *
     * @param text le texte du score à afficher
     */
    public void setjTextField1(String text) {
        this.jTextField1.setText(text);
    }

    /**
     * Renvoie l'étiquette pour l'image de fond.
     *
     * @return l'étiquette pour l'image de fond
     */
    public JLabel getLabel11() {
        return jlabel11;
    }

}
