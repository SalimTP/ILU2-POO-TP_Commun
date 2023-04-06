package model;

public class ReservationRestaurant extends Reservation{
	int service;
	int numTable;
	
	public ReservationRestaurant(int jour, int mois, int service, int numTable) {
		super(jour, mois);
		this.service = service;
		this.numTable = numTable;
	}	
	
	public String toString() {
		String sService;
		if (service == 1) {
			sService = "premier";
		}
		else {
			sService = "deuxième";
		}
		return "Le " +jour+"/"+mois + " : table n°" + numTable + " pour le " + sService + " service.\n";
	}
}