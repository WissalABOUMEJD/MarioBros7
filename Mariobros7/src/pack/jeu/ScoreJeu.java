package pack.jeu;

public class ScoreJeu {
	private int nbPieces;
	private int scoreEnCours;
			
	public ScoreJeu(){
		this.nbPieces = 0;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbrePieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	public int getScoreEnCours() {
		return scoreEnCours;
	}

	public void setScoreEnCours(int scoreEnCours) {
		this.scoreEnCours = scoreEnCours;
	}
	
	
}
