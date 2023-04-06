package model;

public  abstract  class EntiteReservable <F extends Formulaire>{
    int numero;
    CalendrierAnnuel calendrier;
    
    protected EntiteReservable(int numero, CalendrierAnnuel calendrier) {
        this.numero = numero;
        this.calendrier = calendrier;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean estLibre(Formulaire formulaire) {    
        return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());       
    }
    
    public abstract boolean compatible(F formulaire);
    
    public abstract Reservation reserver(F formulaire);
}