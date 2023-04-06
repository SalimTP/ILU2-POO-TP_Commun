package model;

public class FormulaireHotel  extends Formulaire{
	private int nbLitSimple;
	private int nbLitDouble;
	
	public FormulaireHotel(int jour, int mois, int nbLitSimple, int nbLitDouble) {
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
	}

	public int getNbLitSimple() {
		return nbLitSimple;
	}

	public void setNbLitSimple(int nbLitSimple) {
		this.nbLitSimple = nbLitSimple;
	}

	public int getNbLitDouble() {
		return nbLitDouble;
	}

	public void setNbLitDouble(int nbLitDouble) {
		this.nbLitDouble = nbLitDouble;
	}
	

}