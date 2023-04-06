package model;

public class ReservationHotel extends Reservation {

	int nbLitSimple;
	int nbLitDouble;
	int numChambre;
	int nbPersonnes;

	public ReservationHotel(int jour, int mois, int numChambre, int nbPersonnes) {
		super(jour, mois);
		this.nbPersonnes = nbPersonnes;
		this.numChambre = numChambre;
	}

	public String toString() {
		return "Le  " +jour+"/"+mois + " : chambre numero" + numChambre + " avec " + nbLitSimple + " lit simples et " +  nbLitDouble + " lit doubles.";
	}
}