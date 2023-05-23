package menu;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jouer extends JPanel{
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel avatar1;
	private JLabel avatar2;
	private JLabel avatar3;
	private JButton retourAvatarButton;
	
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
                Menu.avatar1MouseClicked(evt);
            }
        });

        avatar2.setIcon(new ImageIcon(getClass().getResource("/images/marioo.png")));
        add(avatar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));
        
        avatar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu.avatar2MouseClicked(evt);
            }
        });

        avatar3.setIcon(new ImageIcon(getClass().getResource("/images/modifmario_arefaire.png")));
        add(avatar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, -1, -1));
        
        avatar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu.avatar3MouseClicked(evt);
            }
        });

        Menu.setButton(retourAvatarButton, "Retour");
        retourAvatarButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.retourAvatarButtonMouseClicked(evt);
            }
        });
        add(retourAvatarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, 190, 30));

        jLabel7.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg")));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));
	}
	
	public JButton getRetourButton() {
		return retourAvatarButton;
	}
	
	public JLabel getAvatar1() {
		return avatar1;
	}
	
	public JLabel getAvatar2() {
		return avatar2;
	}
	
	public JLabel getAvatar3() {
		return avatar3;
	}
	
	public JLabel getJlabel() {
		return jLabel6;
	}

}
