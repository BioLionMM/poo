package poo.RPG;

public abstract class Personnage {
    //on ne peut pas creer d'instance d'une classe abstraite
    private String nom;
    private int dureeDeVie;

    public Personnage(String nom, int dureeDeVie) {
        this.nom=nom;
        this.dureeDeVie=dureeDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    public abstract void rencontrer();
    // methodes abstraites: doivent etre redefinies par les specialisations

    public String toString(){

        return "Personnage: "+this.nom+" PtsVie: "+this.dureeDeVie;
    }
}
