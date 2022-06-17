package tpPOOJava.tp11;

public class Auteur {
    String nom;
    boolean prime;

    public Auteur(String nom, boolean prime) {
        this.nom = nom;
        this.prime = prime;
    }

    public String getNom() {
        return nom;
    }


    public boolean getPrix() {
        return prime;
    }

    public boolean estPareilQue(Auteur auteurB){
        if(this.nom.equals(auteurB.getNom())){
            return true;
        }
        else{
            return false;
        }
    }

}
