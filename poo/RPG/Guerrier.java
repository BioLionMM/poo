package poo.RPG;

public class Guerrier extends Personnage {
    private int dureeDeVie;
    private String arme;


    public Guerrier(String nom, int dureeDeVie, String arme) {
        super(nom,dureeDeVie);
        this.arme = arme;
    }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    @Override
    public void rencontrer(){
        System.out.println("Si je te vois, je te tue");
    }
}
