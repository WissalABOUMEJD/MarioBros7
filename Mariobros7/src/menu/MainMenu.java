package menu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JPanel{
	private JButton quitterButton;
	private JButton jouerButton;
	private JButton optionsButton;
	private JButton scoreButton;
	private JLabel jLabel1;
	
	public MainMenu() {
		quitterButton = new JButton();
		jouerButton = new JButton();
		optionsButton = new JButton();
		scoreButton = new JButton();
		jLabel1 = new JLabel();
	       
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setButton(quitterButton, "Quitter");
        quitterButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.quitterButtonMouseClicked(evt);
            }
        });
      
        add(quitterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, -1, 50));

        Menu.setButton(jouerButton, "Jouer");
        jouerButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.jouerButtonMouseClicked(evt);
            }
        });
        add(jouerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, 50));

        Menu.setButton(optionsButton, "Options");
        optionsButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.optionsButtonMouseClicked(evt);
            }
        });
        add(optionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 50));

        Menu.setButton(scoreButton, "Score");
        scoreButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.scoreButtonMouseClicked(evt);
            }
        });

        add(scoreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, 50));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg")));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));

	}
	
	public JButton getQuitterButton() {
        return quitterButton;
    }
	
	public JButton getJouerButton() {
        return jouerButton;
    }
	
	public JButton getOptionsButton() {
        return jouerButton;
    }
	
	public JButton getScoreButton() {
        return jouerButton;
    }
}
