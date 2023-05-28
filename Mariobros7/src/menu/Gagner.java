package menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gagner extends JPanel{
	private JLabel jLabel300;
	private JButton retourGagnerButton;
	private JLabel jlabel301;
	
	public Gagner() {
		jLabel300 = new JLabel();
		retourGagnerButton = new JButton();
		jlabel301 = new JLabel();
		
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel300.setFont(new Font("Press Start 2P", 1, 60));
        jLabel300.setText("VOUS AVEZ GAGNÉ !");
        jLabel300.setForeground(Color.RED);
        add(jLabel300, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 50));


        Menu.setButton(retourGagnerButton, "Rejouer?");
        retourGagnerButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.retourGagnerButtonMouseClicked(evt);
            }
        });
        add(retourGagnerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, -1, 50));
        
        jlabel301.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire2.png")));
	    add(jlabel301, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));
	}

	public JButton getretourGameOverButton() {
		return retourGagnerButton;
	}
	
	public JLabel getjLabel() {
		return jLabel300;
	}

	public JButton getRetourGagnerButton() {
		return retourGagnerButton;
	}

	public void setRetourGagnerButton(JButton retourGagnerButton) {
		this.retourGagnerButton = retourGagnerButton;
	}
	

}
