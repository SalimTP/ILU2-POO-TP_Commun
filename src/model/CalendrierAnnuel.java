package model;

public class CalendrierAnnuel {
    private CalendrierAnnuel.Mois[] calendriers = new CalendrierAnnuel.Mois[12];

    public CalendrierAnnuel() {
        calendriers[0] = new Mois("Janvier", 31);
        calendriers[1] = new Mois("Février", 28);
        calendriers[2] = new Mois("Mars", 31);
        calendriers[3] = new Mois("Avril", 30);
        calendriers[4] = new Mois("Mai", 31);
        calendriers[5] = new Mois("Juin", 30);
        calendriers[6] = new Mois("Juillet", 31);
        calendriers[7] = new Mois("Août", 31);
        calendriers[8] = new Mois("Septembre", 30);
        calendriers[9] = new Mois("Octobre", 31);
        calendriers[10] = new Mois("Novembre", 30);
        calendriers[11] = new Mois("Décembre", 31);
    }

    public boolean estLibre( int jours,int mois) {
        return this.calendriers[mois-1].estLibre(jours);
      
    }
    public boolean reserver( int jours,int mois) {
        if (this.calendriers[mois-1].estLibre(jours)) {
            this.calendriers[mois-1].reserver(jours);
            return true;
        }
        return false;
      
    }
   
    public class Mois {
        private String nom;
        private boolean[] jours;
        
        public Mois(String nom, int  Nbjours) {
            this.nom = nom;
            this.jours = new boolean[Nbjours];
            for(int i=0;i<Nbjours;i++)
                this.jours[i]=true;
           
        }
        public boolean estLibre(int jours) {
            return this.jours[jours-1];
        }
        public void reserver(int jours) {
            this.jours[jours-1] = false;
        }
        
      
    }
}