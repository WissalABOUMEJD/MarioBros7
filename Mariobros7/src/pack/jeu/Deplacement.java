package pack.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import menu.Menu;

public class Deplacement implements KeyListener {

	public boolean descendre,sauter,right,left;  // comme mario ne peut pas se baisser, on ajoute un boolean pour savoir si l'on doit descendre dans un tuyau
	

	
	private final static int vitesseDeplacement = 6;   //Attention ce nombre doit diviser 1644.
	

	@Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
        	left = true;
            Menu.niveauPanel.setX(-vitesseDeplacement);       
        }  
        if (keyCode == KeyEvent.VK_RIGHT) {
        	Menu.niveauPanel.setX(vitesseDeplacement);
        	right = true;
        }
        if (keyCode == KeyEvent.VK_UP) {
        	if (Menu.niveauPanel.player.sautEnCours == false) {
        		Menu.niveauPanel.player.sautEnCours = true;
        	}
        	sauter = true;
        }
        if (keyCode == KeyEvent.VK_DOWN) {
            descendre = true;
        }
    }
	@Override
	public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
        	Menu.niveauPanel.setX(0); 
        	left = false;
        }  
        if (keyCode == KeyEvent.VK_RIGHT) {
        	Menu.niveauPanel.setX(0);
        	right = false;
        }
        if (keyCode == KeyEvent.VK_UP) {
        	sauter = false;
        }
        if (keyCode == KeyEvent.VK_DOWN) {
            descendre = false;
        }
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void stopJoueur() {
		Menu.niveauPanel.setX(0); 
	}
	
	

}
