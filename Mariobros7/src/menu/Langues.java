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

public class Langues extends JPanel{
	private JButton englishButton;
    private JButton frenchButton;
    private JButton retourLangueButton;
    private JLabel jLabel9;
    
    public Langues() {
    	englishButton = new JButton();
    	frenchButton = new JButton();
    	retourLangueButton = new JButton();
    	jLabel9 = new JLabel();

    	setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setButton(frenchButton, "Français");
        frenchButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.frenchButtonMouseClicked(evt);
            }
        });
        add(frenchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 50));

        Menu.setButton(retourLangueButton, "Retour");
        retourLangueButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.retourLangueButtonMouseClicked(evt);
            }
        });
        add(retourLangueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, 190, 30));

        Menu.setButton(englishButton, "Anglais");
        englishButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.englishButtonMouseClicked(evt);
            }
        });
        add(englishButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, 50));

        jLabel9.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg")));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 840));
    }

    public JButton getfrenchButton() {
        return frenchButton;
    }

    public JButton getenglishButton() {
        return englishButton;
    }
    
    public JButton getRetourButton() {
        return retourLangueButton;
    }
}
