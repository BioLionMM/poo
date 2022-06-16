package poo.ifa;

public class Personnage {
    private String nom;
    private String prenom;

    public Personnage(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}


class SuperHero extends Personnage{
    public SuperHero(String nom, String prenom) {
        super(nom, prenom);
    }
}

interface IVoler{
    public abstract void voler();
}


class SuperHeroVolant extends SuperHero implements IVoler{
    public SuperHeroVolant(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void voler(){
        System.out.println("Je peux voler comme superman!");
    }
}


class InsecteGeant implements IVoler{
    @Override
    public void voler(){
        System.out.println("Je peux voler comme un insecte mechant!");
    }
}