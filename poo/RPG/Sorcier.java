package poo.RPG;

public class Sorcier extends Magicien{
    private String batonMagique;

    public Sorcier(String nom, int dureeDeVie, String baguette, String baton) {
        super(nom, dureeDeVie, baguette);
        this.batonMagique=baton;
    }


    public String getBatonMagique() {
        return batonMagique;
    }


    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }

    @Override
    public void rencontrer(){
        System.out.println("Je suis un sorcier, hehehehehe...");
    }
}
