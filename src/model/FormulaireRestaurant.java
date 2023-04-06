package model;

public class FormulaireRestaurant extends Formulaire {
	int nbPersonnes;
	int service;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int service) {
		super(jour, mois);
		this.nbPersonnes = nbPersonnes;
		this.service = service;
	}
	
	public int getNombrePersonnes() {
		return nbPersonnes;
	}

	public void setNbPersonnes(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}

	public int getNumService() {
		return service;
	}

	public void setService(int service) {
		this.service = service;
	}

}