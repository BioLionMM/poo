package poo.Vehicules;

public class Main {
    public static void main(String[] args) {
        Camion camionA=new Camion(1985,4000,2,50);
        System.out.println(camionA.getMatricule());
        Voiture voitureA=new Voiture(2004,5000,4,false);
        Voiture voitureB=new Voiture(2017,8000,2,true);
        System.out.println(voitureB.getMatricule());
        System.out.println(voitureA.getMatricule());
        voitureB.accelerer();
        camionA.demarrer();

    }
}
