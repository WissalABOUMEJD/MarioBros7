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

public class Score extends JPanel{
	private JButton meilleurScore;
	private JButton retourScoreButton;
	private JTextField jTextField1;
	private JLabel jlabel11;
	
	public Score() {
		meilleurScore = new JButton();
		retourScoreButton = new JButton();
		jTextField1 = new JTextField();
		jlabel11 = new JLabel();
		
		setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		Menu.setButton(meilleurScore, "Ton meilleur score est");
		meilleurScore.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				Menu.meilleurScoreMouseClicked(evt);
			}
		});
		add(meilleurScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, 50));

	    Menu.setButton(retourScoreButton, "Retour");
	    retourScoreButton.addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent evt) {
	            Menu.retourScoreButtonMouseClicked(evt);
	        }
	    });
	    add(retourScoreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, 190, 30));
	    add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 400, 50));
	
	    jlabel11.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire1.jpg")));
	    add(jlabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));
	}
	
	public JButton getMeilleurButton() {
        return meilleurScore;
    }
	
	public JButton getRetourButton() {
        return retourScoreButton;
    }
	
	public JTextField getTextButton() {
        return jTextField1;
    }
	
	public JTextField getjTextField1() {
		return jTextField1;
	}

	public void setjTextField1(String text) {
	    this.jTextField1.setText(text);
	}

	public JLabel getLabel11() {
		return jlabel11;
	}
	
}
