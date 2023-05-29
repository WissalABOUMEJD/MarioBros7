package pack.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import menu.Menu;

public class Deplacement implements KeyListener {
	public static boolean paused;
	public boolean descendre,sauter,right,left;  // comme mario ne peut pas se baisser, on ajoute un boolean pour savoir si l'on doit descendre dans un tuyau
	
	public final static int vitesseDeplacement = 4;   //Attention ce nombre doit diviser 1644.
	

	@Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_ENTER) {
            Menu.niveauPanel.isPaused = !Menu.niveauPanel.isPaused; // Inverser l'état de la variable "paused"
            Menu.niveauPanel.temps.isPausedTemps = !Menu.niveauPanel.temps.isPausedTemps;
        }
        if (keyCode == KeyEvent.VK_LEFT && !Menu.niveauPanel.isPaused) {
        	left = true;
            //Menu.niveauPanel.setX(-vitesseDeplacement);   
        	if (Menu.niveauPanel.player.marcheGaucheEnCours == false) {
        		Menu.niveauPanel.player.marcheGaucheEnCours = true;
        	}
        	Menu.niveauPanel.player.courirgauche();
        	Menu.niveauPanel.player.marcheDroiteEnCours = false;
        	
        }  
        if (keyCode == KeyEvent.VK_RIGHT && !Menu.niveauPanel.isPaused) {
        	if (Menu.niveauPanel.player.marcheDroiteEnCours == false) {
        		Menu.niveauPanel.player.marcheDroiteEnCours = true;
        	}
        	Menu.niveauPanel.player.marcheGaucheEnCours = false;
        	
        	Menu.niveauPanel.player.courirdroite();
        	//Menu.niveauPanel.setX(vitesseDeplacement);
        	right = true;
        }
        if (keyCode == KeyEvent.VK_UP && !Menu.niveauPanel.isPaused && ! Menu.niveauPanel.player.chuteEnCours) {
        	if (Menu.niveauPanel.player.sautEnCours == false) {
        		Menu.niveauPanel.player.sautEnCours = true;
        	}
        	Menu.niveauPanel.player.marcheGaucheEnCours = false;
        	Menu.niveauPanel.player.marcheDroiteEnCours = false;
        	sauter = true;
        }
        if (keyCode == KeyEvent.VK_DOWN && !Menu.niveauPanel.isPaused) {
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
