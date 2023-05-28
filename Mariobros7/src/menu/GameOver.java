package menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOver extends JPanel{
	private JLabel jLabel20;
	private JButton retourGameOverButton;
	private JLabel jlabel36;
	
	public GameOver() {
		jLabel20 = new JLabel();
		retourGameOverButton = new JButton();
		jlabel36 = new JLabel();
		
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new Font("Press Start 2P", 1, 60));
        jLabel20.setText("GAME OVER !");
        jLabel20.setForeground(Color.RED);
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, 50));


        Menu.setButton(retourGameOverButton, "Rejouer?");
        retourGameOverButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Menu.retourGameOverButtonMouseClicked(evt);
            }
        });
        add(retourGameOverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, -1, 50));
        
        jlabel36.setIcon(new ImageIcon(getClass().getResource("/images/FondProvisoire2.png")));
	    add(jlabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));
	}

	public JButton getretourGameOverButton() {
		return retourGameOverButton;
	}
	
	public JLabel getjLabel() {
		return jLabel20;
	}
	

}
