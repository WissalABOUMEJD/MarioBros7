package pack.jeu;

import audioMario.Audio;
import menu.Menu;

public class Temps implements Runnable {
    private int compteurTemps;
    private final int pause = 1000;
    private String tempsRestant;
    private int compteurTempsInitial; // Ajout de la variable pour stocker la valeur initiale du compteur de temps
    public boolean isPausedTemps;

    public Temps() {
        this.compteurTempsInitial = 100; // Assigner la valeur initiale du compteur de temps
        this.compteurTemps = compteurTempsInitial;
        this.tempsRestant = "Temps restant : " + compteurTemps;
        Thread temps = new Thread(this);
        temps.start();
    }

    public String getTempsRestant() {
        return tempsRestant;
    }

    public int getCompteurTemps() {
        return compteurTemps;
    }
    
    public int getCompteurTempsInitial() {
        return compteurTempsInitial;
    }

    public void setCompteurTemps(int compteurTemps) {
        this.compteurTemps = compteurTemps;
    }

    public void setTempsRestant(String tempsRestant) {
        this.tempsRestant = tempsRestant;
    }

    public void reset() {
        this.compteurTemps = compteurTempsInitial; // Réinitialiser le compteur de temps à sa valeur initiale
        this.tempsRestant = "Temps restant : " + compteurTemps;
    }

    @Override
    public void run() {
        while (compteurTemps != 0) {
        	if(!isPausedTemps) {
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
            }
            this.compteurTemps--;
            this.tempsRestant = "Temps restant : " + this.compteurTemps;
        }
        	else {
        		this.tempsRestant = "Temps restant : " + this.compteurTemps;
        	}
        }
        //Audio.playSound("/audio/partiePerdue.wav");
        Menu.showPanels(Menu.gameOverPanel, Menu.languePanel, Menu.MainMenuPanel, Menu.volumePanel, Menu.scorePanel,
                Menu.jouerPanel, Menu.niveauPanel, Menu.optionsPanel, Menu.gagnerPanel);
    }
}
