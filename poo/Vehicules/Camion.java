package poo.Vehicules;

public class Camion extends Vehicule{
    private int hauteur;
    private int capacite;

    public Camion(int anneeModele, float prix, int hauteur, int capacite) {
        super(anneeModele, prix);
        this.hauteur = hauteur;
        this.capacite = capacite;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public void demarrer() {
        System.out.println("Le camion demarre! ");
    }

    @Override
    public void accelerer() {
        System.out.println("Le camion accelere! VROUUUUM!");
    }

}
