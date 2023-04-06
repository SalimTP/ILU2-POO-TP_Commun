package model;

public class  CentraleReservation <E extends EntiteReservable <F>, F extends Formulaire>  {
    private E[] entites;
    int nbEntites;
    public CentraleReservation(E[] entites) {
       this.entites = entites;
    }
    public void ajouterEntite(E entite) {
        entites[nbEntites] = entite; 
        nbEntites++;        
    } 

    public int[] donnerPossibilites(F formulaire) {
        int[] valeurs = new int[nbEntites];
        for (int i = 0; i < this.nbEntites; i++) {
            if (entites[i].compatible(formulaire) && this.entites[i].estLibre(formulaire)) {
                valeurs[i] = this.entites[i].getNumero();
            } else {
                valeurs[i] = 0;
            }
        }
        return valeurs;
    }
    
    public Reservation reserver(int numeroEntite, F formulaire) {
        E entite = entites[numeroEntite - 1];     
        formulaire.setIdentificationEntite(numeroEntite); 
        Reservation reservation = entite.reserver(formulaire);
        return reservation;       
    }
  
}

    
