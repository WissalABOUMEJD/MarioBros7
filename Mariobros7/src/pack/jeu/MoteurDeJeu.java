package pack.jeu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import menu.Menu;

public class MoteurDeJeu {
	
	public static Niveau fond;
	public static Joueur Joueur;
	
	public static void main(String[] args) {
		
		// Cr�ation de la fenetre de l'application
		JFrame fenetre = new Menu();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(true);
        fenetre.setAlwaysOnTop(true);
		
		// Instanciation de l'objet Fond
		fond = new Niveau();
				
		//fenetre.setContentPane(fond); // On associe la scene � la fen�tre de l'application
		fenetre.setVisible(true);	
		
	}

}
