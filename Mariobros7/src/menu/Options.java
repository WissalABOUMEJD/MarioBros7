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
	private JLabel jLabel8;
    private JButton volumeButton;
    private JButton langueButton;
    private JButton retourOptionsButton;

    public Options() {
    	jLabel8 = new JLabel();
    	volumeButton = new JButton();
    	langueButton = new JButton();
    	retourOptionsButton = new JButton();
    	
    	setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setButton(langueButton, "Langue");
        langueButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.langueButtonMouseClicked(evt);
            }
        });
        add(langueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 50));

        Menu.setButton(volumeButton, "Volume");
        volumeButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.volumeButtonMouseClicked(evt);
            }
        });
        add(volumeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, 50));

        Menu.setButton(retourOptionsButton, "Retour");
        retourOptionsButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.retourOptionsButtonMouseClicked(evt);
            }
        });
        add(retourOptionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, 190, 30));

        jLabel8.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));
    }
    
    public JButton getVolumeButton() {
        return volumeButton;
    }

    public JButton getLangueButton() {
        return langueButton;
    }
    
    public JButton getRetourOptionsButton() {
        return retourOptionsButton;
    }
}
