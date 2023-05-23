package pack.jeu;

import menu.Menu;

public class FPS implements Runnable {
    private final int PAUSE = 2;     // Temps d'attente en ms avant une nouvelle entrée dans la boucle
	
	@Override
	public void run(){		
		while(true){						
			Menu.niveauPanel.repaint();			
			try{
				Thread.sleep(PAUSE);
				} 
			catch (InterruptedException e){}
		}		
	}
}
