package menu;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jouer extends JPanel {
    private JLabel jLabel6;  // Étiquette pour le texte "Choisis ton avatar :"
    private JLabel jLabel7;  // Étiquette pour l'image de fond
    private JLabel avatar1;  // Étiquette pour l'avatar 1
    private JLabel avatar2;  // Étiquette pour l'avatar 2
    private JLabel avatar3;  // Étiquette pour l'avatar 3
    private JButton retourAvatarButton;  // Bouton pour revenir au menu des options

    /**
     * Construit un nouveau panneau pour la sélection de l'avatar.
     */
    public Jouer() {
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        avatar1 = new JLabel();
        avatar2 = new JLabel();
        avatar3 = new JLabel();
        retourAvatarButton = new JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new Font("Press Start 2P", 1, 18));
        jLabel6.setText("Choisis ton avatar : ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, 50));

        avatar1.setIcon(new ImageIcon(getClass().getResource("/images/moustache_profil_static.png")));
        add(avatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));
        
        avatar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu.avatar1MouseClicked(evt);  // Gère l'événement de clic sur l'avatar 1
            }
        });

        avatar2.setIcon(new ImageIcon(getClass().getResource("/images/cregut_static_droit.png")));
        add(avatar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));
        
        avatar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu.avatar2MouseClicked(evt);  // Gère l'événement de clic sur l'avatar 2
            }
        });

        avatar3.setIcon(new ImageIcon(getClass().getResource("/images/static_mario.png")));
        add(avatar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, -1, -1));
        
        avatar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu.avatar3MouseClicked(evt);  // Gère l'événement de clic sur l'avatar 3
            }
        });

        Menu.setButton(retourAvatarButton, "Retour");  // Configure le bouton de retour
        retourAvatarButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.retourAvatarButtonMouseClicked(evt);  // Gère l'événement de clic sur le bouton de retour
            }
        });
        add(retourAvatarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, 190, 30));

        jLabel7.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg")));  // Affiche l'image de fond
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));
    }

    /**
     * Renvoie le bouton de retour.
     *
     * @return le bouton de retour
     */
    public JButton getRetourButton() {
        return retourAvatarButton;
    }
    
    /**
     * Renvoie l'étiquette pour l'avatar 1.
     *
     * @return l'étiquette pour l'avatar 1
     */
    public JLabel getAvatar1() {
        return avatar1;
    }
    
    /**
     * Renvoie l'étiquette pour l'avatar 2.
     *
     * @return l'étiquette pour l'avatar 2
     */
    public JLabel getAvatar2() {
        return avatar2;
    }
    
    /**
     * Renvoie l'étiquette pour l'avatar 3.
     *
     * @return l'étiquette pour l'avatar 3
     */
    public JLabel getAvatar3() {
        return avatar3;
    }
    
    /**
     * Renvoie l'étiquette pour le texte "Choisis ton avatar :".
     *
     * @return l'étiquette pour le texte "Choisis ton avatar :"
     */
    public JLabel getJLabel() {
        return jLabel6;
    }
}
