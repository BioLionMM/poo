package poo.Vehicules;

public abstract class Vehicule {
    //matricule, l’année de son modèle, son prix.
    //son matricule est incrémenté selon le nombre de véhicules créés.
    private static int nbVehicules=0;
    private int matricule;
    private int anneeModele;
    private float prix;

    public Vehicule(int anneeModele, float prix) {
        this.anneeModele = anneeModele;
        this.prix = prix;
        this.nbVehicules++;
        this.matricule=this.nbVehicules;
    }

    public int getMatricule() {
        return matricule;
    }

    public int getAnneeModele() {
        return anneeModele;
    }

    public void setAnneeModele(int anneeModele) {
        this.anneeModele = anneeModele;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public abstract void demarrer();

    public abstract void accelerer();

    //ToString() de la classe Véhicule retourne une chaîne de caractères
    // qui contient les valeurs du matricule, de l’année du modèle et du prix

    @Override
    public String toString(){
        return("Vehicule: Matricule = "+this.matricule+" \nAnnee du Modèle= "+this.anneeModele+"\nPrix= "+this.prix+"\n");
    }
}
